package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTaskArrays {
    public static void main(String[] args) {
//Task #1
// Write a program that receives some numbers based on the user’s choice and then returns the largest number
// of the ones the user entered.


//        1. Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many numbers would you like to enter? ");
//        int [] numbers = new int [scanner.nextInt()]; // use the input to create an array to hold the values
////        int numberOfNumbers = scanner.nextInt();
////
////        int[] numbers = new int[numberOfNumbers]; //create the array using the number of numbers of length
////
//        for(int i=0; i<numbers.length; i++){
//            System.out.print("Enter number No."+(i+1)+": ");
//            numbers[i] = scanner.nextInt();
//        }
////        scanner.close();
//
//
//        // Find the maximum number
//        int maximum = numbers[0]; // initialize a variable to be equal to the first element in the array
//
//        // compare the value with other elements in the array
//        for (int i = 1; i < numbers.length ; i++) {
//            // if the current number is smaller than the maximum then set it as the new maximum.
//            if (maximum < numbers[i]){ // if it is less tha number in question
//                maximum = numbers [i]; //then let's maximum become equal to that value
//            }
//        }
//        System.out.println("The largest number you entered is " + maximum);

//        int numberOfnumbers, max;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many numbers would you like to enter? ");
//        numberOfnumbers = scanner.nextInt(); //numberOfNumbers is the number of how many numbers user will select
//
//        int numbers[] = new int[numberOfnumbers]; / //create the array using the number of numbers
//        System.out.println("Enter a number: ");
//        for(int i = 0; i < numberOfnumbers; i++)
//        {
//            numbers[i] = scanner.nextInt(); //numbers are selected numbers
//        }
//        max = numbers[0];
//        for(int i = 0; i < numberOfnumbers; i++)
//        {
//            if(max < numbers[i])
//            {
//                max = numbers[i];
//            }
//        }
//        System.out.println("Maximum value:"+max);





//Task #2
// Write a program that accepts a String from the user and returns an array of integers representing the counts
// of each vowel in the String. The array returned by your method should hold 5 elements:
// the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please write something here: ");
//        String inputString = scanner.nextLine();
//
//        // We know that hte array is going to have a length of 5
//        int[] vowelCount = new int[5]; //
//
//
//        // Loop through the string and count the vowels
//        for (int i = 0; i < inputString.length(); i++) {
//            char currentLetter = inputString.toLowerCase().charAt(i);
//
//            switch (currentLetter){
//                case 'a':
//                    vowelCount[0]++;
//                    break;
//                case 'e':
//                    vowelCount[1]++;
//                    break;
//                case 'i':
//                    vowelCount[2]++;
//                    break;
//                case 'o':
//                    vowelCount[3]++;
//                    break;
//                case 'u':
//                    vowelCount[4]++;
//                    break;
//
//            }
//
//        }
//        System.out.println("The vowel breakdown for the " + inputString + " is " + Arrays.toString(vowelCount));
//
//        int counter = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            char currentLetter = inputString.toLowerCase().charAt(i);
//            switch (currentLetter) { // checks for equality
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    counter++;
//                    break;
//            }
//        }
//        System.out.println("There are " + counter + " vowels in the text");
    }
}
