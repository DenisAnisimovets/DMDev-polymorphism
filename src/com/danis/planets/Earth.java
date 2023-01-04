package com.danis.planets;

public class Earth extends Planet {
    private Earth() {
    }

    public Earth(int radius, int density, String name) {
        this.density = density;
        this.radius = radius;
        this.name = name;
        isAlive = true;
    }

    @Override
    double getRadius() {
        return radius;
    }

    @Override
    public double getMass() {
        return density*getVolume();
    }

    double getVolume() {
        return 4*Math.PI*Math.pow(radius, 3)/3;
    }

    @Override
    public String toString() {
        return "Earth{" +
                "isAlive=" + isAlive +
                ", radius=" + radius +
                ", density=" + density +
                ", name='" + name + '\'' +
                '}';
    }
}
