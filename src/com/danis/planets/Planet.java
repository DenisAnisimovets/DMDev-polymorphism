package com.danis.planets;

public abstract class Planet {
    boolean isAlive;
    int radius;
    int density;
    String name;

    public int getDensity() {
        return density;
    }

    public String getName() {
        return name;
    }

    abstract double getRadius();

    abstract double getMass();

    int compareTo(Planet planet) {
        return (int)(getMass() - planet.getMass());
    };

    double getDiameter() {
        return SpaceUtil.PI * radius;
    }
}
