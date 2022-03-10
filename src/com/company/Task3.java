package com.company;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

//        Task #3
//        Write a program that accepts any of the primary colors as a String and returns the complimentary
//        color of that color to the user

//        Primary colors: yellow, blue; red
//        Complimentary colors: purple, orange, green

        Scanner scanner = new Scanner(System.in); // 1. Set the scanner
        System.out.print("Please select a primary color :"); // 2. Prompt the user to write something
        String colorPrimary = scanner.nextLine(); // 3. Set the scanner to print

        for (int i = 0; i < colorPrimary.length(); i++) {

            switch (colorPrimary) { // checks for equality
                case "yellow":
                    System.out.println("Complimentary color of yellow is purple");
                    break;
                case "blue":
                    System.out.println("Complimentary color of blue is orange");
                    break;
                case "red":
                    System.out.println("Complimentary color of red is green");
                    break;
            }

        }
    }
}
