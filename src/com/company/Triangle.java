package com.company;

public class Triangle extends Shape{
    private int c;

    public Triangle(int a, int b,int c) {
        super(a,b);
        this.c=c;
    }

    @Override
    public double getPerimeter() {
        int p=getC()+getB()+getA();
        return p;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


}
