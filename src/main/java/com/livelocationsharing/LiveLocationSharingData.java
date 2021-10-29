package com.livelocationsharing;

import lombok.Data;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Data
public class LiveLocationSharingData {
    @Getter
    private final String name;

    @Getter
    private final String type;

    @Getter
    private final WorldPoint waypoint;

    @Getter
    private final int world;

    public LiveLocationSharingData(String name, int x, int y, int plane, String type, int world) {
        this.name = name;
        this.waypoint = new WorldPoint(x, y, plane);
        this.type = type;
        this.world = world;
    }
}