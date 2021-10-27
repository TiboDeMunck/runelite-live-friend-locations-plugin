package com.livefriendlocations;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import lombok.Getter;
import lombok.Setter;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;

import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import net.runelite.api.events.GameTick;

import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.worldmap.WorldMapPoint;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;
import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.regex.*;

@PluginDescriptor(
		name = "Live Friend Locations",
		description = "Shows the locations of your friends who you share the API with.",
		tags = {"location"}
)
@Slf4j
public class LiveFriendLocationsPlugin extends Plugin
{
	private static final BufferedImage NORMAL_ICON;
	private static final BufferedImage IM_ICON;
	private static final BufferedImage HCIM_ICON;
	private static final BufferedImage UIM_ICON;
	private static final BufferedImage GIM_ICON;
	private static final BufferedImage HCGIM_ICON;

	static
	{
		NORMAL_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveFriendLocationsPlugin.class, "/normal.png");
		NORMAL_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		IM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveFriendLocationsPlugin.class, "/im.png");
		IM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		HCIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveFriendLocationsPlugin.class, "/hcim.png");
		HCIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		UIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveFriendLocationsPlugin.class, "/uim.png");
		UIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		GIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveFriendLocationsPlugin.class, "/gim.png");
		GIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}
	static
	{
		HCGIM_ICON = new BufferedImage(37, 37, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage waypointIcon = ImageUtil.loadImageResource(LiveFriendLocationsPlugin.class, "/hcgim.png");
		HCGIM_ICON.getGraphics().drawImage(waypointIcon, 0, 0, null);
	}

	@Getter
	@Setter
	private ArrayList<LiveFriendLocationsData> GIMData = new ArrayList<>();

	@Getter
	@Setter
	private ArrayList<WorldMapPoint> WaypointData = new ArrayList<>();

	@Getter
	@Setter
	private WorldPoint playerPos = new WorldPoint(0,0,0);

	@Getter
	@Setter
	private boolean getError = false;

	@Getter
	@Setter
	private boolean postError = false;

	@Inject
	private Client client;

	@Inject
	private WorldMapPointManager worldMapPointManager;

	@Inject
	private LiveFriendLocationsPluginConfiguration config;

	@Inject
	private LiveFriendLocationsDataManager dataManager;

	@Getter
	private String playerName;

	@Getter
	private String playerType;

	@Provides
	LiveFriendLocationsPluginConfiguration provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(LiveFriendLocationsPluginConfiguration.class);
	}

	/*@Override
	protected void startUp()
	{
	}*/

	@Override
	protected void shutDown()
	{
		setGIMData(new ArrayList<>());
		setPlayerPos(new WorldPoint(0,0,0));

		removeWaypoints();
	}

	@Subscribe
	public void onGameTick(GameTick tick) {
		if (isValidURL(config.getEndpoint()))
		{
			if (config.sendLocation()) {
				playerPos = client.getLocalPlayer().getWorldLocation();
				playerType = client.getAccountType().name();
				playerName = client.getLocalPlayer().getName();
				LiveFriendLocationsData d = new LiveFriendLocationsData(playerName, playerPos.getX(), playerPos.getY(), playerPos.getPlane(), playerType);
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

	public String getLiveFriendLocationsGetEndpoint()
	{
		return config.getEndpoint();
	}

	public String getLiveFriendLocationsPostEndpoint()
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

	private void setWaypoints()
	{
		if (!GIMData.isEmpty()) {
			ArrayList<WorldMapPoint> l = new ArrayList<>();
			for (LiveFriendLocationsData data: GIMData) {
				final BufferedImage WAYPOINT_ICON = getIcon(data.getType());
				WorldMapPoint waypoint = new WorldMapPoint(data.getWaypoint(), WAYPOINT_ICON);
				waypoint.setName(data.getName());
				waypoint.setJumpOnClick(true);
				waypoint.setSnapToEdge(true);
				l.add(waypoint);

				worldMapPointManager.add(waypoint);
			}
			setWaypointData(l);
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

	public boolean isValidURL(String url)
	{
		String regex = "((http|https)://)(www.)?"
				+ "[a-zA-Z0-9@:%._\\-\\+~#?&//=]"
				+ "{2,256}\\.[a-z]"
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