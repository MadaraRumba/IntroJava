package com.company;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        Task #2
//        Write a program that accepts a String from a user and prints an interactive response telling the user
//        if the word is the same when spelt backwards. For example, bread when spelt backwards is daerb,
//        which isn't quite the same.

        Scanner scanner = new Scanner(System.in); // 1. Set the scanner
        System.out.print("Please write something here: "); // 2. Prompt the user to write something
        String something = scanner.nextLine(); // 3. Set the scanner to print


        String reversedSomething = ""; //empty string
        for (int i = something.length() - 1; i > -1; i--) { //loop from the last character to the first
            reversedSomething += something.charAt(i); //append the characters in reverse to the empty string

            if (something == reversedSomething) {
                System.out.println("The word is the same spelled backwards.");
            } else {
                System.out.println("The word is not the same spelled backwards.");

//                        switch (something) {
//            case reversedSomething:
//                System.out.println("The word is equal spelled backwards.");
//                break;
            }
        }
//        System.out.println(reversedSomething);
    }
}
