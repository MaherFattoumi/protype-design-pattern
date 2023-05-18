package com.mf.protype;

public class Circle implements CloneableShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public CloneableShape clone() {
        return new Circle(radius);
    }

    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }
}