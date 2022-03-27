package com.company;


public class StringsScannerEscapeCharWrapperClasRegex {
    public static void main(String[] args) {

        // Escape characters:
        // Escape characters are special characters that allow us to
        // perform specials from within a string.

        // \n - this creates a new line
        // \t - creates a new tab
        // \r - carriage turn (does the same thing as pressing 'enter'); ignoring the first sentence and printing
        // only the second.

//        System.out.println("The little \"brown\" dog");
//        System.out.println("This is one line\rThis is the second line");



        // WRAPPER CLASSES (Converting primitive strings to primitive values)
//        String five = "5";
//        int number = Integer.parseInt(five);
//        System.out.println((number + number) * number);
//
//        String six = "6.0001";
//        double sixValue = Double.parseDouble(six);
//
//        String falseString = "false";
//        boolean falseValue = Boolean.parseBoolean(falseString);
//        System.out.println(falseValue);


        // How to search on google java things
//        byte -> Byte -> "Byte java 8 documentation"
//        short ->Short
//        int ->Integer
//        long -> Long
//        float -> Float
//        double -> Double
//        char -> Character
//        boolean -> Boolean


        // REGEX
        // Quantifiers are a construct under regex that allows us to take note of number of occurences of
        // a particular sequence a string.

//        aaabbbe

//        + - trying to check if a character or sequence has at least one occurrence in the string.
//        e.g. a + bc -> checks if there is at least one a in the string being tested.
//        * - checks if  a character appears zero or more times.
//        ? - checks if a character appears zero or one occurrence.

//        Pattern pattern = Pattern.compile("[a-zA-Z0-9]?"); // pattern checker (plus sign so it accepts letters and numbers
//        Matcher matcher = pattern.matcher("a"); // string to check
//        Matcher matcher2 = pattern.matcher("boogieboy109"); // string to check
//        System.out.println(matcher.matches()); // This return true if the match and false if not.
//        System.out.println(matcher2.matches()); // This return true if the match and false if not.

    }
}
