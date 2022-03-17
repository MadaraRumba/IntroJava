package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TasksOnlyClass {
    public static void main(String[] args) {

//        Task #1
//        Ask the user to enter a range of numbers and sort that group of numbers in such a way that even numbers
//        come first in the output and odd numbers are after even numbers.


//        Solution #1
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many numbers would you like to enter? ");
//        int numberOfNumbers = scanner.nextInt();
//        int [] userNumbers = new int [numberOfNumbers];
//
//        for (int i = 0; i < userNumbers.length ; i++) {
//            System.out.println("Please enter a number:");
//            userNumbers [i] = scanner.nextInt();
//        }
//
//        int [] sortedNumbers = new int [userNumbers.length];
//        int countEven = 0;
//
//        for (int i = 0; i < userNumbers.length; i++) {
//            if (userNumbers[i] % 2 ==0 ){
//                countEven++;
//                sortedNumbers [countEven -1] = userNumbers[i]; // if the first index in array is 0, we're subtracting 1
//            }
//        }
//
//        int countOdd = 0;
//
//        for (int i = 0; i < userNumbers.length; i++) {
//            if (userNumbers[i] % 2 !=0 ){
//                countOdd++;
//                sortedNumbers [countOdd -1 + countOdd] = userNumbers[i];
//            }
//        }
//
//        System.out.println("Sorted array is: " + Arrays.toString(sortedNumbers));



//        Solution #2
        // Separate the even numbers and odd numbers in one 'for' loop
        // Create counter to count the odd and the even numbers entered.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many numbers would you like to enter? ");
//        int numberOfNumbers = scanner.nextInt();
//        int[] userNumbers = new int[numberOfNumbers];
//
//        int countOdd = 0;
//        int countEven = 0;
//
//        for (int i = 0; i < userNumbers.length; i++) {
//            System.out.println("Enter a number: ");
//            userNumbers[i] = scanner.nextInt();
//            if (userNumbers[i] % 2 == 0) countEven++;
//            else countOdd++;
//        }
//
//        int[] sortedNumbers = new int[userNumbers.length];
//
//        int counterEven = 0;
//        int counterOdd = 0;
//        for (int i = 0; i < userNumbers.length; i++) {
//            if (userNumbers[i] % 2 == 0) {
//                counterEven++;
//                sortedNumbers[counterEven - 1] = userNumbers[i];
//
//            } else {
//                counterOdd++;
//                sortedNumbers[countEven - 1 + counterOdd] = userNumbers[i];
//            }
//        }
//
//        System.out.println("Sorted array is: " + Arrays.toString(sortedNumbers));




        // Task 2:
        //Write a program to return the second largest number from a stream of inputted integers from user.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many numbers would you like to select: ");
//        int[] numbers = new int[scanner.nextInt()];
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter a number: ");
//            numbers [i] = scanner.nextInt();
//        }
////
////        // Sort the array
//        Arrays.sort(numbers);
//        int secondLargest = numbers[numbers.length - 2]; // -2 because it is sorted and the second largest number will right before the last one.
//        System.out.println(secondLargest);




//        Task 3
//        Write a program to find out if in a list of numbers entered by a user there are no multiples of 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to select: ");
        int[] numbers = new int[scanner.nextInt()];
        boolean multiples = false; // setting boolean to 'false' by default
        int multiplesCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number: ");
            numbers [i] = scanner.nextInt();
            if (numbers [i] % 3 ==0){
                multiples = true;
                multiplesCount++;
            }
        }

        if (multiples == true) {
            System.out.println("There is/are " + multiplesCount + " multiples of 3");
        } else {
            System.out.println("There aren't any multiples of 3");
        }


    }
}

