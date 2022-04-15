package com.company.accounts.shape;

public class Circle implements Shape{

    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 2d *  Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2d *  Math.PI * radius;
    }
}
