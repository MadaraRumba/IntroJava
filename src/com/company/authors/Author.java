package com.company.authors;

// Write a class called Books that has the following fields:
// name, author, price
// Write another class called Author that contains the following
// fields: name, age and gender
// Create a list of books and return the following output for
// each book:
// "The author(s) of the book 'NAME_OF_BOOK' is/are: -------"

public class Author {

    private String name;
    private int age;
    private String gender;

    // Define constructor
    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Define getter
    public String getName() {
        return name;
    }
}
