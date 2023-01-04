package com.danis.planets;

public class Jupiter extends Planet {
    private Jupiter() {
    }

    public Jupiter(int radius, int density, String name) {
        this.density = density;
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Jupiter{" +
                "isAlive=" + isAlive +
                ", radius=" + radius +
                ", density=" + density +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    double getRadius() {
        return radius;
    }

    @Override
    double getMass() {
        return radius*getDensity();
    }
}
