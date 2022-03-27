package com.company;

import java.util.Arrays;
import java.util.Scanner;

// Task #3
// write a method that accepts 3 parameters: double smallNumber, double bigNumber, String operator
// based on the arithmetic operator passed, preform one of the following operations: +, -, /, *
// on the small and big number and return the result. Thr return type should be a double.

public class MethodsSimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Choose an operator: +, -, *, or /\"");
        String operator = input.nextLine();

        System.out.print("Enter the small number: ");
        double smallNumber = input.nextDouble();

        System.out.print("Enter the big number:  ");
        double bigNumber = input.nextDouble();

        System.out.println("Result is: " + simpleCalculator());


    }

    public static double simpleCalculator (double numbers) {

        String operator;
        double number1;
        double number2;

        switch (operator) {
            case "+":
                double result = number1 + number2;
                break;
            case "-":
                double result = number1 - number2;
                break;
            case "*":
                double result = number1 * number2;
                break;
            case "/":
                double result = number1 / number2;
                break;

                return result;
        }
    }
}
