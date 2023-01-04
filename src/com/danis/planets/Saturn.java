package com.danis.planets;

public class Saturn extends Planet {

    private Saturn (){
    }

    public Saturn(int density, String name) {
        this.density = density;
        this.name = name;
        this.radius = 269;
    }
    @Override
    double getRadius() {
        return radius;
    }

    @Override
    double getMass() {
        return  4 * getRadius()*density;
    }

    @Override
    public String toString() {
        return "Saturn{" +
                "isAlive=" + isAlive +
                ", radius=" + radius +
                ", density=" + density +
                ", name='" + name + '\'' +
                '}';
    }
}
