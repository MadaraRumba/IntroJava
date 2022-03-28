package com.company;

//    Home tasks:
//    Using recursion write a method that takes a number as a parameter and returns the total sum between one and
//    that number.
//    upToNumber(8) -> 1+2+3+4+5+6+7+8

public class RecursionHomeTaskAddtion {
    public static void main(String[] args) {
        System.out.println(addition(8));
    }

    public static int addition(int n) {
        if (n <= 0) { // this is the base case
            return 0;
        }
        return addition(n - 1) + n;
    }
}

