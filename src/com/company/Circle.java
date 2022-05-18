package com.company;

public class Circle extends Shape{
    public final double pi=3.14;
    private int radius;

    public Circle(int radius) {
        super();
        this.radius=radius;

    }

    @Override
    public double getPerimeter() {
        double p=getRadius()*pi*2;
        return p;
    }

    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
