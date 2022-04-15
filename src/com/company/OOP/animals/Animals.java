package com.company.OOP.animals;

// Write two classes:
//1. Animal class Fields -> String name, String number of legs
//Methods -> sounds it makes, movement

//2. Bird -> fields: color, does it fly
//Methods -> fly(), sing();

public class Animals {

    // define fields
    private String name;
    private int numOfLegs;
    private String sound;

    //define behaviour

    public void voice(){
        System.out.println(name + "says " + sound);
    }

    // constructor

    public Animals(String name, int numOfLegs, String sound) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.sound = sound;
    }


}
