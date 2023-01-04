package com.danis.planets;

public class Moon implements Satellite {
    private Moon() {
    }

    public Moon(Planet master) {
        this.master = master;
    }

    private Planet master;

    @Override
    public String toString() {
        return "Moon{" +
                "master=" + master +
                '}';
    }

    @Override
    public int getDistanceToMaster() {
        return 1200;
    }
}
