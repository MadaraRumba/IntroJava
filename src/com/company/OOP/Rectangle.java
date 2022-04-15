package com.company.OOP;

// Create a new class called rectangle and in that class,
// define two properties:
//   length
//    breadth

// Create a constructor to allow instantiation of rectangles values
// at object creation and also write methods to find perimeter and area
// of the rectangle.

public class Rectangle {

    private double length;
    private double breadth;

// constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double perimeter() {
        return length * 2 + breadth * 2;
    }

    public double area() {
        return length * breadth;
    }
}

