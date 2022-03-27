package com.company;

import java.util.Arrays;
import java.util.Scanner;


//Write a Java program to find minimum subarray sum of specified size in a given array of integers Example:
//        Input :
//        nums = { 1, 2, 3, 4, 100, 6, 7, 8, 9,10}
//        Output:
//        Sub-array size: 4
//        Sub-array from 0 to 3 and sum is: 10
public class SubarraySumHomework {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5, -100, 7, 8, 9, 10};
//        int windowSize = 4; // sub-array size =4
//        int windowSum = 0;
//        int minWindowSum = 0;
//        int windowRightIndex = 0; // it is the last element in the window
//
//        for (int i = 0; i < numbers.length; i++) {
//            windowSum += numbers[i];
//            if ((i + 1) >= windowSize) {
//                if (minWindowSum > windowSum) {
//                    minWindowSum = windowSum;
//                    windowRightIndex = i;
//                }
//                windowSum -= numbers[i + 1 - windowSize];
//            }
//        }
//
//        System.out.println("Sub-array from " + (windowRightIndex - windowSize + 1) + " to "
//                + windowRightIndex + " and sum is: " + minWindowSum);


//        Solution #2 w/ scanner wtf??
        Scanner scanner = new Scanner (System.in);
        int [] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers [i]= scanner.nextInt();
        }

        // 1. Sort the array
        Arrays.sort(numbers);

        // 2. promt the user to enter the minimum size of the array to add
        System.out.println("Enter the minimum size to add: ");
        int minSize = scanner.nextInt();

        int sumMinSize = 0;

        // 3. sum the min size of the array
        for (int i = 0; i < minSize; i++) {
            sumMinSize += numbers[i];
        }
        System.out.println("The min size is " + sumMinSize);



    }
}
