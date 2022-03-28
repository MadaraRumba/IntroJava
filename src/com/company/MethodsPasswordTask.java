package com.company;

import java.util.Scanner;

// Write a method that compares two strings (that could be passwords) and return true or false
// based on their equality.
// With a scanner

public class MethodsPasswordTask {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String pass1 = scanner.next();

        System.out.println("Repeat the password: ");
        String pass2 = scanner.next();

        System.out.println("Passwords " + passwords(pass1, pass2));
    }

    public static String passwords (String password1, String password2){

        return password1.equals(password2) ? "match" : "don't match";

//        OR
//        System.out.println("Enter password: ");
//        String password = scanner.next();

//        System.out.println(compare(password) ? "Password is correct" : "Password incorrect");


// OR
// public static boolean compare(String enteredPassword){
//        //Assume actual password is helloworld
//        String password = "helloworld";

//        return enteredPassword.equals(password)


    }

}
