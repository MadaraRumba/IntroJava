package com.company.authors;

// Write a class called Book that has the following fields:
// name, author, price
// Write another class called Author that contains the following
// fields: name, age and gender
// Create a list of books and return the following output for
// each book:
// "The author(s) of the book 'NAME_OF_BOOK' is/are: -------"

public class Book {
//
//    // define the properties (fields)
//    private String nameOfBook;
//    private String nameOfAuthor;
//    private int price;

    private String name; // a books name
    private Author[] authors; // an author
    private int price;
//
//    // define constructor

    public Book(String name, Author[] authors, int price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthors() {
        String authorsList = "";

        for (Author author : authors){

            for (int i = 0; i < authors.length; i++) {
                // if the current author is the last author in
                // the array then print without comma

                if (i == authors.length - 1){
                    authorsList += authors[i].getName();
                    break;
                } else authorsList += authors[i].getName() + ", ";
            }
            return authorsList;

    }
        return authorsList;
    }


//
//    public Books(String nameOfBook, String nameOfAuthor) {
//        this.nameOfBook = nameOfBook;
//        this.nameOfAuthor = nameOfAuthor;
//    }
//
//    public String getNameOfBook() {
//        return nameOfBook;
//    }
//
//    public String getNameOfAuthor() {
//        return nameOfAuthor;
//    }
}
