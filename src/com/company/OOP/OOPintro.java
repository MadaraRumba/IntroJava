package com.company.OOP;

import com.company.OOP.animals.Animals;
import com.company.OOP.company.Company;
import com.company.OOP.company.Employee;
import com.company.OOP.Person;

public class OOPintro {

//    OOP
//    Programming paradigm (a way of viewing things)
//        object oriented programming

//        4 core concepts:

//    INHERITANCE
//    Mechanism that allows to share behaviour between classes
//    A class that inherits from another class is called the 'child' or 'sub' class
//    The class that this is inherited from is the 'parent' OR
//    'super' class.

//    Sintax is: public class Ferrari extends Car { }

//    Polymorphism - ability of an object to return different
//    responses to the same method call.


//    ENCAPSULATION
//    this concept of hiding data and methods from the outside world (classes outside the one the data is defined in)
//    This allows us to control what data is given out or received

//    A class is a blueprint for describing an object
//    Car -> Attributes: color, model, numbOfTires, numOfSeats.
//    Behaviour: startEngine, stopEngine, turnRight, turnLeft
//    fields -> used to define attributes in a Class


    public static void main(String[] args) {

        Person george = new Person("George", 28);
        Person victoria = new Person("Victoria", 26);

//        Person george = new Person();
//        george.setName("George");
//
//        Person victoria = new Person();
//        victoria.setName("Victoria");

//
//        System.out.println("BMI for George: " + george.bmi());
//
//        System.out.println("BMI for Victoria: " + victoria.bmi());

//
//        Rectangle rectangle = new Rectangle (5.4, 7.2);
//
//        System.out.println("Perimeter is " + rectangle.perimeter());
//        System.out.println("Area is " + rectangle.area());


//Person[] people = new Person[]{
//        new Person("George", 22),
//        new Person("Fredd", 18),
//        new Person ("David", 20),
//        };
//
//Persons persons = new Persons(people);
//System.out.println("The average age is " + persons.getAverageAge());


        // solution
//        Bird pinguin = new  Bird ("Pinguin", 2);
////        penguin.sing();
////        penguin.fly();

        String google = "Google", microsoft = "Microsoft";

        Company goog = new Company(google);
        Company micro = new Company(microsoft);

        Employee[] googleWorkers = new Employee[]{
                new Employee("Fred", 33, goog),
                new Employee("Rachel", 30, goog),
        };

        Employee[] microsoftWorkers = new Employee[]{
                new Employee("George", 28, micro),
                new Employee("Victoria", 31, micro),
        };

        goog.setEmployees(googleWorkers);
        micro.setEmployees(microsoftWorkers);

//        System.out.println(googleWorkers[0].getCompany().getCompanyName());
//        System.out.println(googleWorkers[0].getCompany().getEmployees().length);
//
//
//        System.out.println(goog.averageAge());
//        System.out.println(micro.averageAge());


        // Random task solution
//        System.out.println(goog.getRandomEmployee());
//    }

//    public static float getAverageAge(Person[] people) {
//        float sum = 0; // initialize the sum variable to zero
//        // for-each loop
//        for(Person person : people) {
//            // person == person[i]
//            sum += person.getAge();
//        }
//        return sum / people.length;

    }
}