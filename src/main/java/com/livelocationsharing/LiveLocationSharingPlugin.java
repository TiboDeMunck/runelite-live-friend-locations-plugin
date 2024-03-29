package com.livelocationsharing;

import com.google.inject.Provides;
import javax.inject.Inject;

import lombok.Getter;
import lombok.Setter;

import lombok.extern.slf4j.Slf4j;

import net.runelite.api.Client;
import net.runelite.api.Varbits;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;

import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;

import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import net.runelite.client.ui.overlay.worldmap.WorldMapPoint;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;
import net.runelite.client.util.ImageUtil;

import net.runelite.api.clan.*;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.regex.*;

@PluginDescriptor(
		name = "Live Location Sharing",
		description = "Share your location with other players.",
		tags = {"location"}
)
@Slf4j
public class LiveLocationSharingPlugin extends Plugin
{
	// Injects
	@Inject
	private Client client;

	@Inject
	private ImageUtil imageUtil;

	@Inject
	private WorldMapPointManager worldMapPointManager;

	@Inject
	private LiveLocationSharingPluginConfiguration config;

	@Inject
	private LiveLocationSharingDataManager dataManager;

	// 'Constants' (can change)
	@Getter
	@Setter
	private String playerName;

	@Getter
	@Setter
	private String playerType;

	@Getter
	@Setter
	private String playerTitle;

	@Getter
	@Setter
	private int playerWorld;

	// Variables
	@Getter
	@Setter
	private ArrayList<LiveLocationSharingData> PlayerData = new ArrayList<>();

	@Getter
	@Setter
	private ArrayList<WorldMapPoint> WaypointData = new ArrayList<>();

	@Getter
	@Setter
	private WorldPoint playerPos = new WorldPoint(0,0,0);

	// Error variables
	@Getter
	@Setter
	private boolean getError = false;

	@Getter
	@Setter
	private boolean postError = false;

	@Provides
	LiveLocationSharingPluginConfiguration provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(LiveLocationSharingPluginConfiguration.class);
	}

	// Delete on shutdown
	@Override
	protected void shutDown()
	{
		setPlayerData(new ArrayList<>());
		setPlayerPos(new WorldPoint(0,0,0));

		removeWaypoints();
	}

	// Subscribes
	@Subscribe
	public void onGameTick(GameTick tick) {
		if (isValidURL(config.getEndpoint()))
		{
			if (config.sendLocation() && wildernessChecker() && pvpWorldChecker()) {
				playerName = client.getLocalPlayer().getName();
				playerType = client.getAccountType().name();
				playerTitle = getTitle();
				playerWorld = client.getWorld();
				playerPos = client.getLocalPlayer().getWorldLocation();

				LiveLocationSharingData d = new LiveLocationSharingData(playerName, playerPos.getX(), playerPos.getY(), playerPos.getPlane(), playerType, playerTitle, playerWorld);
				dataManager.makePostRequest(d);
				//log.info(String.format("x: %s, y: %s, plane: %s", playerPos.getX(), playerPos.getY(), playerPos.getPlane()));
			}
			else {
				dataManager.makeGetRequest();
			}
			removeWaypoints();
			setWaypoints();
		}
	}

	// Helper Functions - getters
	public String getGetEndpoint()
	{
		return config.getEndpoint();
	}

	public String getPostEndpoint()
	{
		String url = config.getEndpoint();
		if (url.substring(url.length() - 1).equals("/"))
		{
			return url + "post";
		}
		return config.getEndpoint() + "/post";
	}

	public String getSharedKey()
	{
		return config.sharedKey();
	}

	// helper functions - waypoints
	private void setWaypoints()
	{
		if (!PlayerData.isEmpty()) {
			ArrayList<WorldMapPoint> l = new ArrayList<>();
			for (LiveLocationSharingData data: PlayerData) {
				if (checkFilter(data))
				{
					final BufferedImage WAYPOINT_ICON = scaleIcon(getIcon(data.getType(), data.getName(), data.getTitle()));
					WorldMapPoint waypoint = new WorldMapPoint(data.getWaypoint(), WAYPOINT_ICON);
					waypoint.setName(data.getName());
					waypoint.setJumpOnClick(true);
					waypoint.setSnapToEdge(true);
					l.add(waypoint);

					worldMapPointManager.add(waypoint);
					setWaypointData(l);
				}
			}
		}
	}

	private void removeWaypoints()
	{
		if (!WaypointData.isEmpty()) {
			for (WorldMapPoint data: WaypointData) {
				worldMapPointManager.remove(data);
			}
			setWaypointData(new ArrayList<>());
		}
	}

	private String getTitle()
	{
		ClanSettings clanSettings = client.getClanSettings();
		if (clanSettings == null) {
			return "";
		}
		ClanMember member = clanSettings.findMember(playerName);
		if (member == null) {
			return "";
		}

		return clanSettings.titleForRank(member.getRank()).getName();
	}

	private BufferedImage getIcon(String type, String name, String title)
	{
		// Check for first toggle of clan title icons
		if (config.displayClanTitle())
		{
			// Check for second toggle (only your clan title icons)
			if (config.displayYourClanTitle())
			{
				if (isClanMember(name))
				{
					return LiveLocationSharingIcons.getClanRank(title);
				}
				return LiveLocationSharingIcons.getAccountType(type);
			}
			else
			{
				if (title.equals("")) {
					return LiveLocationSharingIcons.getAccountType(type);
				}
				return LiveLocationSharingIcons.getClanRank(title);
			}
		}
		else
		{
			return LiveLocationSharingIcons.getAccountType(type);
		}
	}

	private BufferedImage scaleIcon(BufferedImage waypoint)
	{
		BufferedImage test = imageUtil.resizeImage(waypoint, config.iconScale(), config.iconScale(), true);
		return test;
	}

	// helper functions - filters
	public boolean checkFilter(LiveLocationSharingData data)
	{
		if (config.filterWorld() && playerWorld == data.getWorld())
		{
			return checkFilterHelper(data.getName());
		}
		else if (config.filterWorld())
		{
			return false;
		}
		else
		{
			return checkFilterHelper(data.getName());
		}
	}

	public boolean checkFilterHelper(String name)
	{
		if (config.filterEveryone())
		{
			return true;
		}
		else
		{
			if (config.filterFriends() && isFriend(name))
			{
				return true;
			}
			if (config.filterClan() && isClanMember(name))
			{
				return true;
			}
			return config.filterGroupIronman() && isGroupIronmanMember(name);
		}
	}

	public boolean isFriend(String name)
	{
		return client.isFriended(name, true);
	}

	public boolean isClanMember(String name)
	{
		if (client.getClanChannel(ClanID.CLAN) != null) {
			return (client.getClanChannel(ClanID.CLAN).findMember(name) != null);
		}
		return false;
	}

	public boolean isGroupIronmanMember(String name)
	{
		if (client.getClanChannel(ClanID.GROUP_IRONMAN) != null)
		{
			return (client.getClanChannel(ClanID.GROUP_IRONMAN).findMember(name) != null);
		}
		return false;
	}

	public boolean wildernessChecker()
	{
		if (config.filterWilderness())
		{
			return true;
		}
		else return client.getVar(Varbits.IN_WILDERNESS) == 0;
	}

	public boolean pvpWorldChecker()
	{
		if (config.filterPvpWorld())
		{
			return true;
		}
		else return !WorldType.isPvpWorld(client.getWorldType());
	}

	/*public boolean isClanChatMember(String name)
	{

	}*/

	public boolean sameWorld(int world)
	{
		return (getPlayerWorld() == world);
	}

	// helper functions - validators
	public boolean isValidURL(String url)
	{
		String regex = "((http|https)://)(www.)?"
				+ "[a-zA-Z0-9@:%._\\-\\+~#?&//=]"
				+ "{2,256}(\\.|\\:)[a-z0-9]"
				+ "{2,6}\\b([-a-zA-Z0-9@:%"
				+ "._\\+~#?&//=]*)";

		Pattern p = Pattern.compile(regex);

		if (url == null) {
			return false;
		}

		Matcher m = p.matcher(url);

		//log.info(url + " matches regex: " + String.valueOf(m.matches()));
		return m.matches();
	}
}