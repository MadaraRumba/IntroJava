package com.company.OOP;

public class Person {

    // Define a properties or attributes of a person

    private String name;
    private int age;
    private double height;
    private double weight;

//    public Person(){ // default constructor
//
//    }

    // Constructor - is a utility that allows us to create instances of objects
    // Method/Constructor overloading - this is a way to define multiple
    // constructors or methods with same name, but they must have different
    // method/constructor signatures

    // Method signatures is the number and data type of the parameters and
    // order in which those parameters are defined

    public Person (String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double bmi(){
        return height/ (weight* weight);
    }





    // private - can't be called in different class
    // selecting the data which we want to show 'outside world'

    // Getters (get method) allow us read data from the class
    // Setters(set method) allow us to write data to the class

    // For the person class we've written today, write a method that allows you to find the
    // BMI of particular person using what we've learned today
    // height - m; weight - in kg;


}
