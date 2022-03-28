package com.company;

import java.util.Scanner;
import java.util.Arrays;

// Task #3
// write a method that accepts 3 parameters: double smallNumber, double bigNumber, String operator
// based on the arithmetic operator passed, preform one of the following operations: +, -, /, *
// on the small and big number and return the result. Thr return type should be a double.

// parameters are the oinput that the method expects in order to process your instructions

public class MethodsSimpleCalc {

    public static void main(String[] args) {

//        System.out.println("The result is: " + simpleCalculator( 5.43, 6.78, "/"));

//        OR
//        Scanner:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a small number: ");
        double smallNum = scanner.nextDouble();

        System.out.println("Enter a big number: ");
        double bigNum = scanner.nextDouble();

        System.out.println("Enter an operator: ");
        String operatorNum = scanner.next();

        System.out.println("The result is: " + simpleCalculator(smallNum,bigNum, operatorNum ));


    }

    public static double simpleCalculator (double smallNumber, double bigNumber, String operator){

        double result = 0;
        switch(operator){
            case "+":
                return smallNumber + bigNumber;
            case "-":
                return bigNumber - smallNumber;
            case "*":
                return smallNumber * bigNumber;
            case"/":
                return bigNumber / smallNumber;
            default:
                System.out.println(operator + " operator is not a valid option");
                return 0;
        }
    }
}
