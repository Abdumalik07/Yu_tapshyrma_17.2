package com.company;

public class Rhombus extends Shape{
    private int a;
    public Rhombus(int a) {
        super();
        this.a=a;
    }

    @Override
    public double getPerimeter() {
        int p=getA()*4;
        return p;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
