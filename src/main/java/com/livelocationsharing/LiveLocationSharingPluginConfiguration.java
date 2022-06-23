package com.livelocationsharing;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("livelocationsharing")
public interface LiveLocationSharingPluginConfiguration extends Config
{
	@ConfigSection(
			name = "API Setup",
			description = "Setup for API.",
			position = 0
	)
	String APISettings = "APISettings";

	@ConfigItem(
			keyName = "BaseAPIUrl",
			name = "API Base URL",
			position = 1,
			description = "Configures the address where you will receive data from and send data to. Checkout the GitHub for setup.",
			secret = true,
			section = APISettings
	)
	default String getEndpoint()
	{
		return "";
	}

	@ConfigItem(
			keyName = "sharedKey",
			name = "API Shared key",
			position = 2,
			description = "Configures the shared key for the API.",
			secret = true,
			section = APISettings
	)
	default String sharedKey()
	{
		return "";
	}

	@ConfigSection(
			name = "Filter your location",
			description = "Filter when you share your location.",
			position = 100,
			closedByDefault = true
	)
	String postLocationSettings = "postLocationSettings";

	@ConfigItem(
			keyName = "sendLocation",
			name = "Send your location",
			position = 101,
			description = "Configures if you want to send your location.",
			section = postLocationSettings
	)
	default boolean sendLocation() {return true; }

	@ConfigItem(
			keyName = "filterWilderness",
			name = "Send wilderness location",
			position = 102,
			description = "Configures if you want send your location when you are in the Wilderness.",
			section = postLocationSettings
	)
	default boolean filterWilderness() {return true; }

	@ConfigItem(
			keyName = "filterPvpWorld",
			name = "Send PVP world location",
			position = 103,
			description = "Configures if you want send your location when you are in a PVP world.",
			section = postLocationSettings
	)
	default boolean filterPvpWorld() {return true; }

	@ConfigSection(
			name = "Filter incoming locations",
			description = "Filter who you see on the world map.",
			position = 200,
			closedByDefault = true
	)
	String getLocationSettings = "getLocationSettings";

	@ConfigItem(
			keyName = "filterEveryone",
			name = "Show Everyone",
			position = 201,
			description = "Configures if you want to see everyone on the world map who has access to the API.",
			section = getLocationSettings
	)
	default boolean filterEveryone() {return true; }

	@ConfigItem(
			keyName = "filterFriends",
			name = "Show Friends",
			position = 202,
			description = "Configures if you want to see your friends on the world map.",
			section = getLocationSettings
	)
	default boolean filterFriends() {return false; }

	@ConfigItem(
			keyName = "filterClan",
			name = "Show Clan Members",
			position = 203,
			description = "Configures if you want to see your fellow clan members on the world map.",
			section = getLocationSettings
	)
	default boolean filterClan() {return false; }

	@ConfigItem(
			keyName = "filterGroupIronman",
			name = "Show Group Ironman",
			position = 204,
			description = "Configures if you want to see your fellow group ironman on the world map.",
			section = getLocationSettings
	)
	default boolean filterGroupIronman() {return false; }

	@ConfigItem(
			keyName = "filterWorld",
			name = "Only show same world",
			position = 205,
			description = "Configures if you only want to see players in the same world as you.",
			section = getLocationSettings
	)
	default boolean filterWorld() {return false; }

	@ConfigSection(
			name = "Icon Display",
			description = "World Map icon Display",
			position = 300,
			closedByDefault = true
	)
	String IconDisplay = "IconDisplay";

	@ConfigItem(
			keyName = "displayClanTitle",
			name = "Clan Title Icons",
			position = 301,
			description = "Display whether you want to show the clan rank icon from people in your clan or not.",
			section = IconDisplay
	)
	default boolean displayClanTitle() {return false; }

	@ConfigItem(
			keyName = "displayYourClanTitle",
			name = "Your Clan Title Icons",
			position = 302,
			description = "Toggle to display only clan title icons from your clan.",
			section = IconDisplay
	)
	default boolean displayYourClanTitle() {return false; }
}
