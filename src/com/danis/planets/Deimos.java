package com.danis.planets;

public class Deimos implements Satellite {
    private Deimos() {
    }

    public Deimos(Planet master) {
        this.master = master;
    }

    private Planet master;

    @Override
    public int getDistanceToMaster() {
        return 300;
    }

    @Override
    public String toString() {
        return "Deimos{" +
                "master=" + master +
                '}';
    }
}
