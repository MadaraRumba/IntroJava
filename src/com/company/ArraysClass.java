package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class ArraysClass {
    public static void main(String[] args) {


        // An array is a collection of multiple data unit of a single data type.
        // Arrays are somewhere between objects and primitive values
        // Indexing for an array starts at 0

//         Scanner scanner = new Scanner(System.in);

//        // First way to declare an array (you have predetermined values)
//        int[] number = {4, 5, 0, 4}; // indexing starts from 0 (similar as in strings)
//        System.out.println(number.length); // do not use parenthesis; parenthesis use ony on strings


//        // Second way to declare an array (you have unknown values to be added later)
//        int[] numbers = new int[5]; //  default value for int = 0
//        System.out.println(numbers.length);
//
//        String[] textArr = new String [6]; // default value for objects including String is null
//        textArr[3] = "orange";
//
//        for (int i = 0; i < textArr.length; i++) {
//            System.out.println(textArr[i]);
//        }


        // Receive the input to populate the array with data

//        int[] numbers = new int[5];  // declare size of an array
//        for (int i = 0; i < numbers.length; i++) {
//                // promt the user to enter a number
//                System.out.print("Enter a number: ");
//                numbers[i] = scanner.nextInt();
//            }
//        System.out.println(Arrays.toString(numbers));


        //Find the sum of numbers
//            int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
////            System.out.println(Arrays.toString(numbers));
//        System.out.println("The sum of variables is " + sum);

        // Task #1:
//    write a program to find the average of a set of numbers that the user enters.
//    Allow the user to decide the number of integers to enter.
//    Interactively return the output to the console.

        System.out.print("How many numbers you want to enter? ");
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = scanner.nextInt();

        double[] numbers = new double[numberOfNumbers]; //create the array using the number of numbers of length
        double sum = 0;

        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter number No."+(i+1)+": ");
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<numbers.length; i++){
           sum += numbers[i];
        }
        System.out.format("The average is: " + Arrays.toString(numbers) + " is " + (sum/numbers.length));

    }
}
