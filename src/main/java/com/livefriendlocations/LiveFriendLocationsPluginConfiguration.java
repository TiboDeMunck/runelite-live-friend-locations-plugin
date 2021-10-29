package com.livefriendlocations;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("livefriendlocations")
public interface LiveFriendLocationsPluginConfiguration extends Config
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
			description = "Configures the address where you will receive data from and send data to.",
			secret = true,
			section = APISettings
	)
	default String getEndpoint()
	{
		return "go to this plugins GitHub to setup your API";
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
		return "shared key here";
	}

	@ConfigItem(
			keyName = "sendLocation",
			name = "Send your location",
			position = 3,
			description = "Configures if you want to send your location.",
			section = APISettings
	)
	default boolean sendLocation() {return true; }

	@ConfigSection(
			name = "Filters",
			description = "Filter who you see on the world map.",
			position = 100,
			closedByDefault = true
	)
	String filterSettings = "filterSettings";

	@ConfigItem(
			keyName = "filterEveryone",
			name = "Show Everyone",
			position = 101,
			description = "Configures if you want to see everyone on the world map who has access to the API. " +
					"Selecting this option will ignore all other filters except the world filter!",
			section = filterSettings
	)
	default boolean filterEveryone() {return true; }

	@ConfigItem(
			keyName = "filterFriends",
			name = "Show Friends",
			position = 102,
			description = "Configures if you want to see your friends on the world map.",
			section = filterSettings
	)
	default boolean filterFriends() {return false; }

	@ConfigItem(
			keyName = "filterClan",
			name = "Show Clan Members",
			position = 103,
			description = "Configures if you want to see your fellow clan members on the world map.",
			section = filterSettings
	)
	default boolean filterClan() {return false; }

	@ConfigItem(
			keyName = "filterGroupIronman",
			name = "Show Group Ironman",
			position = 104,
			description = "Configures if you want to see your fellow group ironman on the world map.",
			section = filterSettings
	)
	default boolean filterGroupIronman() {return false; }

	@ConfigItem(
			keyName = "filterWorld",
			name = "Only show same world",
			position = 105,
			description = "Configures if you only want to see players in the same world as you.",
			section = filterSettings
	)
	default boolean filterWorld() {return false; }
}
