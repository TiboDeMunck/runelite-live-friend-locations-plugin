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

    public LiveFriendLocationsData(String name, int x, int y, int plane, String type) {
        this.name = name;
        this.waypoint = new WorldPoint(x, y, plane);
        this.type = type;
    }
}