package com.company.OOP.animals;

public class Bird extends Animals {

    // define bird properties


    private String color;
    private boolean doesItFly;

    public Bird(String name, int numOfLegs, String sound, String color, boolean doesItFly) {
        super(name, numOfLegs, sound);
        this.color = color;
        this.doesItFly = doesItFly;
    }

//    public void fly(){
//        if (doesItFly) System.out.println(super.getName()+ "can fly");
//        else System.out.println(super.getName() + "cannot fly");
    }
