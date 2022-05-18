package com.company;

public class Rectangle extends Shape{

    public Rectangle(int a, int b) {
        super(a,b);
    }

    @Override
    public double getPerimeter() {
        int p=(getA()+getB())*2;
        return p;
    }
}
