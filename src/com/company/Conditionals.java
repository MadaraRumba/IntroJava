package com.company;

public class Conditionals {

    public static void main (String[] args) {

////        int number = 7;
////        if (number ==2) {
////            System.out.println("The value is 2");
////        } else {
////            System.out.println("The value is not 2");
////        }
//
//        // Task
//        // Using an if statement print out
//        // numbers between 8 and 14 that are greater than 9.
//
//        int number = 13;
//        if (number > 9) {
//            System.out.println("Numbers greater that 9 are: 10, 11, 12, 13, 14");
//        } else {
//            System.out.println("8 is less than 9");
//        }
//
//
//int newNumber = 8;
//
//        if (newNumber > 9) {
//            System.out.println("The value is greater than 9");
//        } else {
//            System.out.println("The value is less than 9");
//        }


        // Loops are a construct that allows us to repeat a set of commands
        // until a condition to terminate is reached.
        // Do - while is saying to do this for as long as condition is true.
        int count = 0;
//        do {
//            System.out.println(i); // print out the count
//            count = count + 1; // increase the count by 1
//        } while (count < 10);
         // while loop is saying to do this
        // PRO TIP: Use while loop when you don't have an idea of how many times the loop is supposed to run.
        while (count < 11) {
            System.out.println(count);
            count = count + 1; // i++
        }
        // For loop
        // use the for loop specifically when you have an idea of how many times loop is supposed to run.
        for (int i = 8; i < 15; i++){
            //System.out.println(i);
            if (i > 9) {
                System.out.println(i + " is greater than 9");
            }
        }

    }
}
