package com.company;

//Write a Java program to find minimum subarray sum of specified size in a given array of integers Example:
//        Input :
//        nums = { 1, 2, 3, 4, 100, 6, 7, 8, 9,10}
//        Output:
//        Sub-array size: 4
//        Sub-array from 0 to 3 and sum is: 10
public class SubarraySumHomework {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, -100, 7, 8, 9, 10};
        int windowSize = 4;

        int windowSum = 0;
        int minWindowSum = Integer.MAX_VALUE;
        int windowRightIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            windowSum += numbers[i];
            if ((i + 1) >= windowSize) {
                if (minWindowSum > windowSum) {
                    minWindowSum = windowSum;
                    windowRightIndex = i;
                }
                windowSum -= numbers[i + 1 - windowSize];
            }
        }

        System.out.println("Sub-array from " + (windowRightIndex - windowSize + 1) + " to "
                + windowRightIndex + " and sum is: " + minWindowSum);
    }
}
