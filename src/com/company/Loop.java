package com.company;

public class Loop {
    public static void main(String[] args) {

        // Loops are a construct that allows us to repeat a set of commands until a condition to terminate is reached.

        // Three types of loops:
//         for loop
//         while loop
//         do while loop - least used;

        // 1. DO - WHILE loop is basically saying to do this for as long as the condition is true. Do this first and them check.

//        int count = 0; // initialize the variable
//        do {
//            System.out.println(i); // print out the count
//            count = count + 1; // increase the count by 1
//        } while (count < 10);


        // 2. WHILE LOOP is  basically saying do this and checks the criteria
        // PRO TIP: Use while loop when you don't have an idea of how many times the loop is supposed to run.


//        while (count < 11) {
//            System.out.println(count);
//            count = count + 1; // i++ increasing the count while count reaches 11
//        }


        // 3. FOR LOOP - use this specifically when you have an idea of how many times loop is supposed to run.

//         for (int i = 0; [initialize the variable that is going to act as counter for the loop]
//         i < 10; [state the condition that will terminate the loop]
//         i++ [describe how you want to increment,what you want to increase by ) {
//        }


        // TASK #0
        // Using an if statement print out numbers between 8 and 14 that are greater than 9.

//        for (int i = 8; i < 15; i++) {
//            if (i > 9) {
//                System.out.println(i + " is greater than 9");
//            }
//        }


        // TASK # 1
        // Write a program using a loop that prints out "even"
        // when an even number is encountered between 1 - 50  and "odd" when odd number is encountered as well.

//    for ( int i = 1; i<=50; i++)
//    if (i % 2 == 0) {
//        System.out.println("even");
//    } else {
//        System.out.println("odd");
//    }




        // TASK #2
        // Write a program using a while loop that will print out all the multiples of 4 between 1 and 50.

//        int counter = 1;
//        while (counter <= 50) {
//            if (counter % 4 == 0) {
//                System.out.println(counter);
//            }
//            counter++; // post-incrementation
//        }



        // UNARY OPERTIONS:
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
}



