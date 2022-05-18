package com.company;

public class Main {

    public static void main(String[] args) {
        Shape triangle=new Triangle(10,13,14);
        System.out.println("Perimeter of triangle = "+triangle.getPerimeter());

        Shape rectangle=new Rectangle(12,13);
        System.out.println("Perimeter of rectangle = "+rectangle.getPerimeter());

        Shape square=new Square(15);
        System.out.println("Perimeter of square = "+square.getPerimeter());

        Shape rhombus=new Rhombus(20);
        System.out.println("Perimeter of rhombus = "+rhombus.getPerimeter());

        Shape circle=new Circle(4);
        System.out.println("Perimeter of circle = "+circle.getPerimeter());


    }
}
