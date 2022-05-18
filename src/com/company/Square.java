package com.company;

public class Square extends Shape{
    private int a;

    public Square(int a) {
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
