package com.livelocationsharing;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

@Slf4j
public class LiveLocationSharingWorldArea {
    @Getter
    private final String name;

    @Getter
    private final WorldArea area;

    @Getter
    private final WorldPoint overworld;

    @Getter
    private final int transposeX;

    @Getter
    private final int transposeY;

    public LiveLocationSharingWorldArea(String name, int xBase, int yBase, int width, int height, int z, int xSurface, int ySurface, int transposeX, int transposeY) {
        this.name = name;
        this.area = new WorldArea(xBase, yBase, width, height, z);
        this.overworld = new WorldPoint(xSurface, ySurface, 0);
        this.transposeX = transposeX;
        this.transposeY = transposeY;
    }

    public LiveLocationSharingWorldArea(String name, WorldArea area, WorldPoint overworld, int transposeX, int transposeY) {
        this.name = name;
        this.area = area;
        this.overworld = overworld;
        this.transposeX = transposeX;
        this.transposeY = transposeY;
    }
}
