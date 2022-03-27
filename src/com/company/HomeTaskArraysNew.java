package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTaskArraysNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

// Task #1
// You're given a string of words from the user. You need to find the word "Nemo", and return a string like this:
// "I found Nemo at [the order of the word you find Nemo]!". If you can't find Nemo, return "I can't find Nemo :(".

//        System.out.println("Please enter a string");
//        String userInput = scanner.nextLine();
//
//        String [] wordArray = userInput.split( " ");
//
//        for (int i = 0; i < wordArray.length; i++) {
//            if (wordArray[i].equalsIgnoreCase ( "Nemo")){
//                System.out.println("I found Nemo at word number" + (i+1) + " !" );
//            }
//            if ( i == wordArray.length - 1 && !wordArray[i].equalsIgnoreCase( "Nemo")) {
//                System.out.println("I can't find Nemo:( ");
//            }
//        }





//Task #2
// Create a program that takes an array and returns the difference between the biggest and smallest numbers.

//        System.out.println("How many numbers: ");
//        int[] numbers = scanner.nextInt();
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter a number: ");
//            numbers[i] = scanner.nextInt();
//        }
//        // this is to ensure that our min and max correlates with our existing data sets
//        int min = numbers[0]; // the first in the array
//        int max = numbers [0]; // the first in the array
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (max < numbers[i]) max = numbers [i];
//            if (min > numbers[i]) min = numbers [i];
//
//        }
//
//        System.out.println(Arrays.toString(numbers)+ " max number: " + max);





//Task #3
// Create a program that takes an array of Strings (You can intialize the variable without user input) and checks if
// the last item matches the rest of the array concatenated together. For example,  ["i", "love", "tesh", "ilovetesh"]
// will return true

//        String[] stringArr = new String[] {"i", "love", "tesh", "ilovetesh"};
//
//        String appender = "";
//        for (int i = 0; i < stringArr.length - 1; i++) {
//            appender += stringArr[i];
//        }
//
//        // Ternary operator - is a conditional that can be used to decide execution flow on the fly
//        System.out.println(appender.equals(stringArr[stringArr.length- 1]) ? "match" : "don't match");
//
//        // ? means 'true' or 'false'
//        // can be used only for println




        // Math package
        // Date and Time
        // Introduction to algorithms


// Task #4
//         Write a java program to rearrange the following array of unique elements such that each second integer is greater
//         than the integers to it's left and right;
//         Use this particular array: {3, 5, 9, 10, 7, 2, 1}
//         {1, 3, 2, 7, 5, 10, 9}

        int[] number = new int[] {3, 5, 9, 10, 7, 2, 1};
        System.out.println(Arrays.toString(number));

        // Loop through the numbers array starting from the second element

        for (int i = 0; i < number.length; i += 2) {

            // check the number preceding every second element
            if (number [i-1] > number [i]) {
                int temp = number[i - 1]; //set it to the preceding number
                number[i - 1] = number[i]; //set the preceding value to the current value
                number[i - 1] = temp; // revive the temp value
            }

                // check for the other side
                if (i + 1 < number.length && number [i + 1]> number[i]){
                    int temp = number [i + 1]; //set it to the preceding number
                number [i+1] = number [i]; //set the preceding value to the current value
                number [i] = temp; // revive the temp value
                }
        }
        System.out.println("The rearanged array is: " + Arrays.toString(number));



    }
}
