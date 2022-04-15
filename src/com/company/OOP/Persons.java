package com.company.OOP;

public class Persons {

    // define properties of the class

    private Person[] people;

    // define a constructor

    public Persons(Person[] people){
        this.people = people;
    }

    // no need for getters and setters
    // person [i].getAge()

    public float getAverageAge(){
        // create a loop --> for each loop
        float sum = 0; // initialize the sum variable to 0
        for(Person person: people) {
            // person == person[i]
            sum += person.getAge();
        }

        return sum/people.length;


    }
}
