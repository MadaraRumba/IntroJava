package com.company;

import java.util.Scanner;


// Write a method that accepts an integer and returns whether that integer is a prime number or not.
// A prime number is a number that isn't devisible without a reminder by any other numbers apart from one and itself
// isPrime(9) -> number is not prime

public class MethodsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is a prime number: ");
        int inputNumber = scanner.nextInt();

        System.out.println(inputNumber + primeChecker(inputNumber));
    }


    public static String primeChecker(int number) {

        int temp;
        boolean isPrime = true;

        for (int i = 2; i <= number/2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime) {
            return " is a prime number";
        } else {
            return " is not a prime number";
        }
    }
}
