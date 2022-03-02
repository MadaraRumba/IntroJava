package com.company;

public class loop {
    public static void main(String[] args) {
        // Task 1
        // Write a program using a loop that prints out "even"
        // when an even number is encountered between 1 - 50  and "odd" when odd number is encountered as well.

//for ( int i = 1; i<=50; i++)
//    if (i % 2 == 0) {
//        System.out.println("even");
//    } else {
//        System.out.println("odd");
//    }

        // Task 2
        // Write a program using a while loop that will print out all the
        // factors of 4 between 1 and 50.

//        int counter = 1;
//        while(counter <= 50) {
//            if (counter % 4 == 0) {
//                System.out.println(counter);
//            }
//            counter++; // post-incrementation

        // Unary operators:
        // unary means "one"
        // Addition
        // pre-incrementation operators -- e.g. ++counter is the same as (==) counter +1
        // when used, the value is incremented before it is read
//        int value = 9;
//        System.out.println(value +1);
//        System.out.println(value++);
//        System.out.println(value);


        // post-incrementation operators -- e.g. counter++ is the same as (==) counter +1
        // when used, the value is read before it's incremented

        // Subtraction
        // pre-decrementation operator -- e.g. --counter
        // post-decrementation operator -- e.g. counter--

        // Task 3:
        //Write a program that prints numbers 1-50
        // and if number is divisible by 3, then replace that number with the word "Fizz."
        // and if number is divisible by 7, replace with buzz
        // if divisible by both 3 and 7 then replace with fizzbuzz
        // else print the number.

        for (int i = 1; i <= 50; i++)
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
    }


