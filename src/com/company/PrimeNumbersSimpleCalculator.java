package com.company;

public class PrimeNumbersSimpleCalculator {
    public static void main(String[] args) {

        // TASK #1 - prime numbers
//
//        for (int i = 1; i <= 80; i++) { //run from 1-80; i++ so the count increases;
//            int counter = 0; // initialize counter to count the number of numbers that divide i.
//            // If you divide number into two, and those halves still can't divide that whole number without a reminder
//            // it is a prime. If you divide 2 into two, you get 5. But if you divide 11 by two, you get 5.5
//            // 5.5 inside an integer will give you 5. 11/5 => 2.2 which is not 0.
//            for (int j = 2; j <= i / 2; j++) { // nested loop - a loop inside  a loop; j <= i/2 because.... why tho?
//                if (i % j == 0) { // if this returns true we know that the number is not prime
//                    counter++; // increase the count of numbers that divide i
//                }
//            }
//            // use the counter to check how many numbers divided i. If counter is greater than 0, then it is not prime.
//            if (counter == 0) {
//                System.out.println(i + " is prime.");
//            }
//        }

        // TASK #2 - simple calculator
        //Write a program that will act as a simple calculator where you set a variable as the operator and based
        // on that perform an arithmetic operation. For example if the operator variable
        // is "+" then it will add two numbers and so on.

//        int number1 = 4;
//        int number2 = 5;
//        char operator = '/';
//
//
//        if (operator == '+'){
//            System.out.println("The sum is: " + (number1 + number2));
//        } else if (operator == '-'){
//            System.out.println("The subtraction is: " + (number1 - number2));
//        } else if (operator == '*'){
//            System.out.println("The product is: " + (number1 * number2));
//        } else if (operator == '/'){
//            System.out.println("The quotient is: " + (number1 / number2));
//        } else {
//            System.out.println("Error");
//        }




        // continue - used to skip an iteration (one movement loop)
        // break - stop the loop immediately.
        // return -
        // void data type that doesn't return any value


//        for (int i = 1; i < 20; i++) { // checking even numbers from 1 to 20
//            if (i % 2 != 0) { // checks if  a number can be divided by 2 without reminder
//                continue; // skips the odd numbers defined above
//                // break - if we used this, the loop would stop running when an odd number appears
//            }
//            System.out.println(i);



        }

    }
