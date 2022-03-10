package com.company;
import java.util.Scanner;

public class HomeTask1203 {
    public static void main(String[] args) {
        // Task #1
//        Write a program that returns true interactively, if a user enters a string containing any of these
//        characters: 'u', 'w', '6', 'i', 'b', 'q'

        Scanner scanner = new Scanner(System.in); // 1. Set the scanner
        System.out.print("Please write something here: "); // 2. Prompt the user to write something
        String inputString = scanner.nextLine(); // 3. Set the scanner to print

        int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentLetter = inputString.toLowerCase().charAt(i);
            switch (currentLetter) { // checks for equality
                case 'u':
                    System.out.println("The 'something' you wrote contains 'u'.");
                    counter++;
                    break;
                case 'w':
                    System.out.println("The 'something' you wrote contains 'w'.");
                    counter++;
                    break;
                case '6':
                    System.out.println("The 'something' you wrote contains '6'. ");
                    counter++;
                    break;
                case 'i':
                    System.out.println("The 'something' you wrote contains 'i'.");
                    counter++;
                    break;
                case 'b':
                    System.out.println("The 'something' you wrote contains 'b'.");
                    counter++;
                    break;
                case 'q':
                    System.out.println("The 'something' you wrote contains 'q'.");
                    counter++;
                    break;
            }
        }
    }
}