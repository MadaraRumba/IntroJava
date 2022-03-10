package com.company;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class TasksOneAndTwo {
    public static void main(String[] args) {
        // Task #1:
//        Write a program that accepts a string from the user and returns
//        the number of vowels that can be found in that
        // For example: If the user enters the string , "Bodacious" -> 5 vowels
//        Caveat: Make your program interactive.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something here: ");
//        String something = scanner.nextLine();
//
////        System.out.println(something.length());
//        int counter = 0; // initiate the counter
//                for (int i = 0; i < something.length(); i++) {
////                    System.out.println(something.toLowerCase().charAt(i));
//                    char currentLetter = something.toLowerCase().charAt(i); // using this so it wouldn't print the lenght
//            if ('a' == currentLetter || 'i' == currentLetter || 'e' == currentLetter || 'o' == currentLetter || 'u' == currentLetter){
//                counter++;
//            }
//        }
//        System.out.println("The number of vowels in your chosen word is: " + (counter));


        // Uche's solution Task #1

//        Scanner scanner = new Scanner(System.in);
////        // Prompt the user for a string
//        System.out.println("Please enter a string: ");
//        String inputString = scanner.nextLine();
////
//////        initialize the counter variable to count the vowel occurances.
//        int counter = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            char currentLetter = inputString.toLowerCase().charAt(i); // The current letter we are checking
//            switch (currentLetter) { // checks for equality
//                case 'a': // is it equal to a?
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    counter++;
//                    break;
////                default: //if none of these conditions work, the default will just do this.
////                    System.out.println("There are not a vowel");
////                    break;
//            }
//        }
//        System.out.println("The number of vowels in the string is: " + counter);


//        Task #2:
        // Write a program that accepts 5 numbers from a user AS STRINGS.
//        Do not use nextInt() method.
//        Add the first two numbers and subtract the second two numbers and divide the result by the last number and
//         multiply the result of those calculations above, then
//        print interactively.
//         5,4,3,2,1 -> 5+4 ; 3-2 ;

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number here: ");
//        String numberOne = scanner.next();
//        int number1 = Integer.parseInt(numberOne);
//
//        System.out.print("Enter number here: ");
//        String numberTwo = scanner.next();
//        int number2 = Integer.parseInt(numberTwo);
//
//        System.out.print("Enter number here: ");
//        String numberThree = scanner.next();
//        int number3 = Integer.parseInt(numberThree);
//
//        System.out.print("Enter number here: ");
//        String numberFour = scanner.next();
//        int number4 = Integer.parseInt(numberFour);
//
//        System.out.print("Enter number here: ");
//        String numberFive = scanner.next();
//        int number5 = Integer.parseInt(numberFive);
//
//        System.out.println("The result is: " + ((number1 + number2) * (number3 - number4))/number5);


        // Task #3 - simple calculator
        //Write a program that will act as a simple calculator where you set a variable as the operator and based
        // on that perform an arithmetic operation. For example if the operator variable
        // is "+" then it will add two numbers  and so on.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please enter a number: ");
//        String numberOne = scanner.nextLine();
//        int number1 = Integer.parseInt(numberOne);
//
//        System.out.print("Please enter a number: ");
//        String numberTwo = scanner.nextLine();
//        int number2 = Integer.parseInt(numberTwo);
//
//        System.out.print("Please enter an operator: ");
//        String operator = scanner.nextLine();
//
//            switch (operator) {
//                case "+":
//                    System.out.println("The result is: " + (number1 + number2));
//                    break;
//                case "-":
//                    System.out.println("The result is " + (number1 - number2));
//                    break;
//                case "*":
//                    System.out.println("The result is " +  (number1 * number2));
//                    break;
//                case "/":
//                    System.out.println("The result is: " + (number1 / number2));
//                    break;
            }
        }
