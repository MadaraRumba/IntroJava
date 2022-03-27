package com.company;

public class StringsLesson {
    public static void main(String[] args) {
//         A string is basically anything inside double-quotes
//         Strings are immutable. This means they can not be changed.
//         Strings in java are case-sensitive because it sees upperCase alphabet and lower case alphabet differently.
//         System.out.println("I love coding!"); //  String literal


//        Two main ways to create strings
//        String objectString = new String ("I am going home"); // This type takes more space and is unideal.
        String regularString = "I am going to the beach";


//        The index of the first character in a string is 0.
//        The index of the last character in a string is less than the length of the string by 1.


//        System.out.println(regularString.length()); // .lenght() is including the spaces as well
//        System.out.println(regularString.toUpperCase());


//        TASK #1
//        How many a's are in the regularString?

        int counter = 0; // initiate the counter
        for (int i = 0; i < regularString.length(); i++) {
            System.out.println(regularString.charAt(i));
            if ('a'== (regularString.charAt(i))) {
                counter++;
            }
        }
                System.out.println("The number of times 'a' appeared is " + counter);
                // you can't use single quotes'' in double quotes "" more than once;
                //you can't use double quotes in double quotes

            }
        }
