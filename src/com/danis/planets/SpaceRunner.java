package com.danis.planets;

public class SpaceRunner {
    public static void main(String[] args) {
        Planet earth = new Earth(100, 2, "Earth");
        System.out.println(earth);
        Planet sun = new Sun(3, "Sun");
        System.out.println(sun);
        System.out.println(SpaceUtil.forceGravity(earth, sun));
        System.out.println();

        System.out.println(SpaceUtil.isStar(earth));

        Planet jupiter = new Jupiter(200, 3, "Jupiter");
        System.out.println(jupiter);

        Planet saturn = new Saturn(3, "Saturn");
        System.out.println(saturn);

        Planet mars = new Mars(300, 5, "Mars");
        System.out.println(mars);
        Satellite deimos = new Deimos(mars);
        System.out.println(deimos);

        System.out.println(SpaceUtil.isStar(mars));

        System.out.println(mars.compareTo(earth));
    }
}
