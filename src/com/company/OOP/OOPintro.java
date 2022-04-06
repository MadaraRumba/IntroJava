package com.company.OOP;

public class OOPintro {

//    OOP
//    Programming paradigm (a way of viewing things)
//        object oriented programming

//        4 core concepts:
//    Inheritance;
//    Encapsulation - this concept of hiding data and methods from the outside world (classes outside the one the data is defined in)
//    This allows us to control what data is given out or received

//    A class is a blueprint for describing an object
//    Car -> Attributes: color, model, numbOfTires, numOfSeats.
//    Behaviour: startEngine, stopEngine, turnRight, turnLeft

//    fields -> used to define attributes in a Class


    public static void main(String[] args){

        Person george = new Person("George", 28, 1.9, 95);
        Person victoria = new Person("Victoria", 26, 1.67, 53);

//        Person george = new Person();
//        george.setName("George");
//
//        Person victoria = new Person();
//        victoria.setName("Victoria");

        System.out.println(george.getName());
        System.out.println(victoria.getName());

        System.out.println(george.getAge());
        System.out.println(victoria.getAge());

        System.out.println(george.getHeight());
        System.out.println(victoria.getHeight());

        System.out.println(george.getWeight());
        System.out.println(victoria.getWeight());


        System.out.println("BMI for George: " + george.bmi());

        System.out.println("BMI for Victoria: " + victoria.bmi());


    }
}
