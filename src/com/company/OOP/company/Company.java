package com.company.OOP.company;

import com.company.OOP.Person;

public class Company {

    private String companyName;
    private Employee[] employees;

    // Define a constructor
    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;
}

    public Employee[] getEmployees() {
        return employees;
    }


    public float averageAge(){
        float sum = 0;
        for(Person person : employees){
            sum += person.getAge();
        }
        return sum / employees.length;
    }

    public String getRandomEmployee(){
        int randomIndex = (int)(Math.random()*10); // Get a random index
        if (randomIndex >= employees.length) return getRandomEmployee();
        return employees[randomIndex].getName();
    }
}
