package com.company.OOP.company;

import com.company.OOP.Person;

public class Employee extends Person {

    // define properties
    private Company company;

    // Define constructor
    public Employee(String name, int age, Company company) {
        super(name, age);
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }
}

