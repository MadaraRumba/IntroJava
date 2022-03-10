package com.company;

public class StringTest {
    public static void main(String[] args) {
//        // A string is basically anything inside double-quotes
//        //Strings are immutable. This means they can not be changed.
//        // Strings in java are case-sensitive because it sees upperCase alphabet and lower case alphabet differently.
////        System.out.println("I love coding!"); //  String literal
//
//        // Two main ways to create strings
////        String objectString = new String ("I am going home"); // This type takes more space and is  unideal.
//        String regularString = "I am going to the beach";
//        // The index of the first character in a string is 0.
//        // The index of the last character in a string is less than the length of the string by 1.
//
////
//        System.out.println(regularString.length());
//        int counter = 0; // initiate the counter
//        for (int i = 0; i < regularString.length(); i++) {
//            System.out.println(regularString.charAt(i));        // i represents an index in string??
//            if ('a' == (regularString.charAt(i))) {
//                counter++;
//            }
//        }
//                System.out.println("The number of times 'a' appeared is " + counter);
//                // you can't use single quotes'' in double quotes "" more than once;
//                //you can't use double quotes in double quotes

        // Task
        // Write a program to count the number of times a vowel appears in a word
        // any vowel from the alphabet - a, i, e, o, u
        // Physician
        // Aerodynamics

        String newWord = "Physician";
        String otherWord = "Aerodynamics";

        int counterOther = 0;
        int counterNew = 0;
        for (int i = 0; i < otherWord.length(); i++) {
//            System.out.println(otherWord.toLowerCase().charAt(i)); // this is not needed to run the code
            if ('a' == otherWord.charAt(i) || 'i' == otherWord.charAt(i) || 'e' == otherWord.charAt(i) || 'o' == otherWord.charAt(i) || 'u' == otherWord.charAt(i)){
                counterOther++;
            }

        }
        for (int i = 0; i < newWord.length(); i++) {
//            System.out.println(newWord.toLowerCase().charAt(i)); // this is not needed to run the code
            if ('a' == newWord.charAt(i) || 'i' == newWord.charAt(i) || 'e' == newWord.charAt(i) || 'o' == newWord.charAt(i) || 'u' == newWord.charAt(i)){
                counterNew++;
            }

        }

        System.out.println("The number of vowels in the word 'Aerodynamics' is " + counterOther);
        System.out.println("The number of vowels in the word 'Physician' is " + counterNew);



            }


        }
