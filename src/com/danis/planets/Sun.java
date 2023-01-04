package com.danis.planets;

public class Sun extends Planet {

    private Sun() {
    }

    public Sun(int density, String name) {
        this.density = density;
        this.name = name;
        this.radius = 2500;
        isAlive = true;
    }

    @Override
    double getRadius() {
        return radius;
    }

    @Override
    double getMass() {
        return getRadius()*getDensity();
    }

    @Override
    public String toString() {
        return "Sun{" +
                "isAlive=" + isAlive +
                ", radius=" + radius +
                ", density=" + density +
                ", name='" + name + '\'' +
                '}';
    }
}
