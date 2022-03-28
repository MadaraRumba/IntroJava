package com.company;

import java.util.Arrays;
import java.util.Scanner;

// Task #2
// Write a method that takes in an array of numbers and returns the maximum number in the array.
// It should return integer.
// Do not use the Math.max method


public class MethodsMaxNum {

    public static void main(String[] args) {

// 2. Promt the user for input
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int[] userNumbers = new int [scanner.nextInt()]; // array!!! how many variables are in an array??

// 3. Populate it
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Enter a number: ");

            userNumbers[i] = scanner.nextInt();
        }
        System.out.println("The max number is: " + findMaxNumber(userNumbers));
      }



    public static int findMaxNumber(int[] numbers) { // arrray!

//1. initializing the max variable
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(maximum<numbers[i]){ // max is the first (0) index in array, compares it to the next item;
                maximum = numbers[i]; // if that is true - next index becomes the new max
            }
        }
        return maximum;
    }
  }




