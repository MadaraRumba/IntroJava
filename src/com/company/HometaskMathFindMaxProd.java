package com.company;

//Write a Java program to find maximum product of two integers in a given array of integers Example:
//Input :
//nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
//Output:
//Pair is (7, 8, Maximum Product: 56
public class HometaskMathFindMaxProd {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, -7, 5, 8, -5 };

        int max1 = numbers[0];
        int max2 = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max1 < numbers[i]) {
                max2 = max1;
                max1 = numbers[i];
            }
        }
        System.out.println("Pair is (" + max1 + ", " + max2 + "), Maximum Product: " + (max1 * max2));
    }
}
