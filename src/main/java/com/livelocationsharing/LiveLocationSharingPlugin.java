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

import net.runelite.api.clan.ClanID;

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
	// Icons
	private static final BufferedImage NORMAL_ICON;
	private static final BufferedImage IM_ICON;
	private static final BufferedImage HCIM_ICON;
	private static final BufferedImage UIM_ICON;
	private static final BufferedImage GIM_ICON;
	private static final BufferedImage HCGIM_ICON;

	static
	{
		NORMAL_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/normal.png");
		NORMAL_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		IM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/im.png");
		IM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		HCIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/hcim.png");
		HCIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		UIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/uim.png");
		UIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		GIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/gim.png");
		GIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		HCGIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveLocationSharingPlugin.class, "/hcgim.png");
		HCGIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}

	// 'Constants' (can change)
	@Getter
	@Setter
	private String playerName;

	@Getter
	@Setter
	private String playerType;

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

	// Injects
	@Inject
	private Client client;

	@Inject
	private WorldMapPointManager worldMapPointManager;

	@Inject
	private LiveLocationSharingPluginConfiguration config;

	@Inject
	private LiveLocationSharingDataManager dataManager;

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
				playerWorld = client.getWorld();
				playerPos = client.getLocalPlayer().getWorldLocation();

				LiveLocationSharingData d = new LiveLocationSharingData(playerName, playerPos.getX(), playerPos.getY(), playerPos.getPlane(), playerType, playerWorld);
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
					final BufferedImage WAYPOINT_ICON = getIcon(data.getType());
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

	private BufferedImage getIcon(String type)
	{
		switch (type) {
			case "NORMAL":
				return NORMAL_ICON;
			case "IRONMAN":
				return IM_ICON;
			case "HARDCORE_IRONMAN":
				return HCIM_ICON;
			case "ULTIMATE_IRONMAN":
				return UIM_ICON;
			case "GROUP_IRONMAN":
				return GIM_ICON;
			case "HARDCORE_GROUP_IRONMAN":
				return HCGIM_ICON;
			default:
				return NORMAL_ICON;
		}
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