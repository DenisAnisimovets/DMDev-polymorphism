package com.danis.planets;

public final class SpaceUtil {

    private SpaceUtil() {
    }

    public static double PI = 3.14;

    static double forceGravity(Planet planet1, Planet planet2) {
        return planet1.getRadius() * planet1.getDensity() + planet2.getRadius()* planet2.getDensity();
    }

    static boolean isStar(Planet planet) {
        return !planet.isAlive && planet.radius > 1000;
    }
}
