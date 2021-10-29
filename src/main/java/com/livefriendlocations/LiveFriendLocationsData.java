package com.livefriendlocations;

import lombok.Data;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Data
public class LiveFriendLocationsData {
    @Getter
    private final String name;

    @Getter
    private final String type;

    @Getter
    private final WorldPoint waypoint;

    @Getter
    private final int world;

    public LiveFriendLocationsData(String name, int x, int y, int plane, String type, int world) {
        this.name = name;
        this.waypoint = new WorldPoint(x, y, plane);
        this.type = type;
        this.world = world;
    }
}