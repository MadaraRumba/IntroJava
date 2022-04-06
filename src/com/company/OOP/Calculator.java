package com.company.OOP;



public class Calculator {

    // accept values
    // performs operations

    public static int add(int smallNumber, int bigNumber){
        return bigNumber - smallNumber;
    }

    public static int subtract(int smallNumber, int bigNumber){
        return bigNumber - smallNumber;
    }

    public static int multiply(int smallNumber, int bigNumber){
        return bigNumber * smallNumber;
    }

    public float divide(float smallNumber, float bigNumber){
        return bigNumber / smallNumber;
    }


    public static void main(String[] args){

        System.out.println(Calculator.add(2, 4));


        Calculator calc = new Calculator();
        System.out.println(calc.divide(3, 9));
    }

    // opposite of static -> instance variable (fields) is a variable whose values are attached ti a particular
    // instance of and object
    // instance method is a method that is attached to a particular instance of an object

    // method has to do one particular thing


}
