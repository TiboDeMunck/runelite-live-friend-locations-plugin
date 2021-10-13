package com.livefriendlocations;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface LiveFriendLocationsPluginConfiguration extends Config
{
	@ConfigItem(
			keyName = "BaseAPIUrl",
			name = "API Base URL",
			description = "Configures the address where you will receive data from and send data to."
	)
	default String getEndpoint()
	{
		return "base url for api here";
	}

	@ConfigItem(
			keyName = "sharedKey",
			name = "API Shared key",
			description = "Configures the shared key for the API."
	)
	default String sharedKey()
	{
		return "shared key here";
	}

	@ConfigItem(
			keyName = "sendLocation",
			name = "Send your location",
			description = "Configures if you want to send your location."
	)
	default boolean sendLocation() {return true; }
}
