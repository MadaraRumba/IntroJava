package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MathUtil {
    public static void main(String[] args) {
        // 2^3 => 8
//        System.out.println(Math.pow(2, 3));
//        System.out.println(Math.max(5, 9));

        Scanner scanner = new Scanner (System.in);

//        Task #1
//        Write a program that allows the user to enter the base and height of a triangle and return the area of
//        triangle interactively to the user.
//        The area of a triangle is 0.5 * base * height

//        System.out.println("Please enter the base value: ");
//        int base = scanner.nextInt();
//
//        System.out.println("Please enter the height value");
//        int height = scanner.nextInt();
//
//        System.out.println("The area of the triangle is " + (Math.multiplyExact(base, height)) * 0.5);


//        Task #2
        // Write a program that accepts the a, b and c and allows a calculates a quadratic equation based in
        // the users input
        // the quadratic formula is: x1: (-b + sqrt (b ^2 - (4*a*c))) / 2a  x2: (-b - sqrt (b ^2 - (4*a*c)))

        System.out.println("Please enter the value of A: ");
        double a = scanner.nextDouble();

        System.out.println("Please enter the value of B");
        double b = scanner.nextDouble();

        System.out.println("Please enter the value of C");
        double c = scanner.nextDouble();

        double x1  = (-b + Math.sqrt (Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("X1: " + x1);

        double x2  = (-b - Math.sqrt (Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("X2: " + x2);

    }
}
