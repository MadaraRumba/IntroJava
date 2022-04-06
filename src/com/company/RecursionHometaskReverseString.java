package com.company;

//    Using recursion, write a method that takes a string as a parameter and returns
//    the reverse of the string.

//        String word = "cocomelon";
//        String reversedString = ""; //empty string
//        for (int i = word.length() - 1; i > -1; i--) { //loop from the last character to the first
//            reversedString += word.charAt(i); //append the characters in reverse to the empty string
//        }
//        System.out.println(reversedString);

public class RecursionHometaskReverseString {
    public static void main(String[] args){

        System.out.println(reverseString("Something"));
    }

public static String reverseString(String word){

        if (word.isEmpty()) // the base case
            return word;

        return reverseString(word.substring(1)) + word.charAt(0); // append character in reverse
    }
}
