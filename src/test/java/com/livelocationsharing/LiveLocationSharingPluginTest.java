package com.livelocationsharing;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LiveLocationSharingPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LiveLocationSharingPlugin.class);
		RuneLite.main(args);
	}
}