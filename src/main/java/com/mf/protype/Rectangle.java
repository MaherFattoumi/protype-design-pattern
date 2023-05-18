package com.mf.protype;

public class Rectangle implements CloneableShape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public CloneableShape clone() {
        return new Rectangle(width, height);
    }

    public void draw() {
        System.out.println("Drawing Rectangle with width: " + width + " and height: " + height);
    }
}