package com.danis.planets;

public class Mars extends Planet {

    private Mars() {
    }

    public Mars(int radius, int density, String name) {
        this.density = density;
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mars{" +
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
        return 10 * getRadius()*getDensity();
    }
}
