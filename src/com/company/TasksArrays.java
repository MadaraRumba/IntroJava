package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalTime;
import java.time.LocalDate;

public class TasksArrays {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

        // Arrays
        // Task #1
        // Write a program that takes in the weight and height of 5 people from the user and returns
        // their average BMI of the group

//        float [] weight = new float[5];
//        System.out.print("Weight.\n");
//        for (int i = 0; i < weight.length; i++) {
//            System.out.print("Enter a weight individuals in kg: ");
//            weight[i] = scanner.nextFloat();
//        }
//        System.out.println(Arrays.toString(weight));
//
//        float[] height = new float[5];
//        System.out.print("\nHeight.\n");
//        for (int i = 0; i < height.length; i++) {
//            System.out.print("Enter a height individuals in m: ");
//            height[i] = scanner.nextFloat();
//        }
//        System.out.println(Arrays.toString(height));
//
//        float bmi1 = height[0]*height[0];
//        float bmi2 = height[1]*height[1];
//        float bmi3 = height[2]*height[2];
//        float bmi4 = height[3]*height[3];
//        float bmi5 = height[4]*height[4];
//
//        System.out.println("BMI for each individual is: " + bmi1 + " , " + bmi2 + " , " +
//                bmi3 + " , " + bmi4 + " , " + bmi5);

        // Task #2
        // Given a string from the user return the character and the count of the character that occurs the most
        // in the string

        // 1. Input
//        Scanner scanner = new Scanner(System. in);
//        System.out.println("Enter a string: ");
//        String k = scanner.nextLine();

        // 2. Which char occurs the most?
//        char tempArray[] = k.toCharArray(); // initialize an array
//        Arrays.sort(tempArray); // sort the array
//        String s = new String(tempArray); // set it as a new string
//        int n = s.length(); // length of the string
//        int max_count = 0; // initialize the max count
//        int count = 1;
//        char mostOccur = '-';
//        for (int i = 1; i <= n; i++)
//        {
//            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
//            {
//                if (max_count < count)
//                {
//                    max_count = count;
//                    mostOccur = s.charAt(i-1);
//                }
//                count = 1;
//            }
//            else
//            {
//                count++;
//            }
//        }

//        // 3. How many times it occurs?
//        int counter = 0; // initiate the counter
//        for (int i = 0; i < n; i++) {
//            if (mostOccur == (s.charAt(i))) {
//                counter++;
//            }
//        }
//
//        // 4. Return
//        System.out.println("Maximum occurring character is " + mostOccur + ", and it occurs " + counter + " times");





// Task #3
        //You're sent to a grocery store with the following items on your list: ["Bananas", "Bread," "Fish"]
        // The cost of the items in the store is [12, 5, 10], your current cash-in-hand is 20$. Which of the items
        // can you safely buy without needing extra cash?
        // Priorities of the items: bananas [least], fish [second] and bread [first].

        // N.B. you can't buy half of item
        // You can buy .... and ... you'll be left with ... dollars.



        String[] items = new String[]{"Bread", "Fish", "Bananas"};
        int [] prices = {5, 10, 12};
        int cash = 20;

        String itemsPurch = ""; // empty string that is going to contain items
        for (int i = 0; i < items.length; i++) {
            if (cash - prices [i] >= 0){
                itemsPurch += items[i] + " ";
                cash -= prices[i];
            }
        }

        System.out.println(" You can buy: " + itemsPurch + " the change is " + cash);



        // Dates
        // Task #4
        // Receive the year, month and day from the user separately. The year should be a four-digit number
        // Assume that the date is correct. Determine if the date is a magic date
        // A magic occurs when:
        // - m * d is a 1-digit number that matches the last digit of the year or
        // - m * d is a 2-digit number that matches the
        // last digits of the year or
        // - m * d is a 3-digit number that matches the last digits of the year

        // return the output interactively to the user.

//        // 1. The input
//        System.out.println("Enter a year : ");
//        int year = scanner.nextInt();
//
//        System.out.println("Enter a month : ");
//        int month = scanner.nextInt();
//
//        System.out.println("Enter a day : ");
//        int day = scanner.nextInt();
//
//        // 2. The product of dd * mm
//        int product = day * month;
//
//        //3. How many digits the product contains
//        int productLength = String.valueOf(product).length();
//
//        // 4. Last 1,2,3 digits of year
//
//        int lastDigit = year%10;
//        int twoLastDigits = year%100;
//        int threeLastDigits = year%1000;
//
//        //5. Check if product == lastDigit
//
//        if (productLength ==1 && product == lastDigit ||
//                productLength ==2 && product == twoLastDigits ||
//                productLength == 3 && product == threeLastDigits) {
//            System.out.println(year + " is magic");
//        } else {
//            System.out.println(year + " is not magic");
//        }


        // Draw a flowchart that checks if 2 numbers that are entered are divisible by 5 // done& done

        // Draw a flowchart to return fibonacci numbers between 1 - 30 // done& done


    }
}
