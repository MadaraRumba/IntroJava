package com.company;

import java.util.Scanner;

// Write a method to calculate simple interest and return it.
// Google the simple interest formula
// With a scanner

// S.I. = P × R × T
// P = Principal,
// R = Rate of Interest in % per year,
// T = Time, usually calculated as the number of years.

public class MethodsSimpleInterestTask {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("The sum initially borrowed: ");
        float princ = scanner.nextFloat();

        System.out.println("The interest rate % per year: ");
        float rate = scanner.nextFloat();

        System.out.println("Period of time in years: ");
        int period = scanner.nextInt();


        System.out.println("The interest rate is: " + simpleInterest(princ, rate, period));
    }

    public static float simpleInterest(float principal, float rateOfInterest, int years){

        return (principal*rateOfInterest*years) / 100;

    }
}
