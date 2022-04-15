package com.company.OOP;

//Write a method that takes an array of 5 persons as a parameter
// and then returns average age of the array of Persons
// as its output

// This is tied with 'Person' class
public class AverageAge {

    public int AverageAge(int[] ageOfPerson){
        int total = 0;

        for (int i = 0; i < ageOfPerson.length; i++) {
            total = total + ageOfPerson[i];


        }
        return total/ageOfPerson.length;
    }

}
