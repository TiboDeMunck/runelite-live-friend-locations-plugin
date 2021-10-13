package com.livefriendlocations;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LiveFriendLocationsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LiveFriendLocationsPlugin.class);
		RuneLite.main(args);
	}
}