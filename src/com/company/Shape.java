package com.company;

public abstract class Shape {
    private int a;
    private int b;


    public  Shape(int a,int b) {
        this.a = a;
        this.b=b;

    }
    public Shape(){

    }

    public abstract double getPerimeter();


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
