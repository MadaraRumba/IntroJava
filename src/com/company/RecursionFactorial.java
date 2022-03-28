package com.company;

public class RecursionFactorial {
    public static void main(String[] args){
        System.out.println(factorial(5));

//        System.out.println(lengthOfString("hello"));
    }

// Recursion
// Recursion is a phenomenon where a method calls itself.

// A base case is the condition under which you want a recursive operation to end.


//Example:
//Factorial of a number is the multiplication of that number by all
//the positive integers between 1 and the number, the only exception being 0! -> 1

// 5! -> 5x4x3x2x1 -> 120;


    // using iteration (loop)

//    public static int factorial (int number){
//        int result = 1;
//        for (int i = 0; i <= number; i++) {
//            result *= i; // multiply all the numbers between 1 and number.
//        }
//        return result;
//    }

    public static int factorial(int n){
        if (n ==0 || n ==1){ // this is the base case
            return 1;
        }
        return n * factorial(n-1);

        // 5 *factorial(5-1)
        // 4 * factorial (4-1)
        // 3 * factorial(3-1)
        // 2 * factorial(2-1)
        // 1
    }


//    Write a method that returns the length of a string

//    public static int lengthOfString(String value){
//        if (value.equals("")){
//            return 0;
//        }
//        return lengthOfString(value.substring(1)) + 1;
//    }


}
