import com.company.authors.Author;
import com.company.authors.Book;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

// Abstraction
// ... is a mechanism that is focused on hiding implementation
// details from the user. The user doesn't need to know how it
// was done, they only need to know that it works.

//        Vehicle car = new Car();
//        car.stopEngine(true);

//        System.out.println(TaskMenu.FILE.getFirstItem());

//TASK
// Assuming you were assigned a task to create a roster for employees that will decide who will work the night
// shift based on a random basis.

// Write a method in you Company object/class that will return a random employee, from the list of employees anytime
// the method is called.

        // in Company class

//    public String getRandomEmployee(){
//            int randomIndex = (int)(Math.random()*10); // Get a random index
//            if (randomIndex >= employees.length) return getRandomEmployee();
//            return employees[randomIndex].getName();


//        TASK
//        Create an enum to model a restaurant menu
//        They offer 3 categories of meals: appetizer, main course and dessert
//        Appetizer - Steamed Prawn and caffe latte;
//        Main course - Continental rice and deep-fried chicken
//        Dessert - Cupcakes and milk chocolate ice cream

//        System.out.println(RestaurantMenu.DESSERT.getFirstItem());

//        Account joshua = new Account(2, "Joshua");
//        Account gregory = new Account(4, "Gregory");
//
//        joshua.credit(2000);
//        gregory.credit(1000);
//
//        joshua.transferToMoney(gregory, 500);
//
//        System.out.println(joshua.getBalance());
//        System.out.println(gregory.getBalance());
//
//        Books goneWithTheWind = new Books("Gone With the Wind", "Margaret Mitchell");
//        Books honeyAndMilk = new Books ("Honey and Milk", "Rupi Kaur");
//
//        System.out.println("The author of the book " + goneWithTheWind.getNameOfBook() + " is " + goneWithTheWind.getNameOfAuthor() + ".");
//        System.out.println("The author of the book " + honeyAndMilk.getNameOfBook() + " is " + honeyAndMilk.getNameOfAuthor() + ".");


        // initialize scanner

        Scanner scanner = new Scanner(System.in);

        // promt user for author's name and age
        System.out.print("Enter the authors name: ");
        String authorName = scanner.next();

        System.out.print("Enter the authors age: ");
        int authorAge =  scanner.nextInt();

        Author fred = new Author(authorName, authorAge);
        Author[] authors = new Author[]{fred};

        // Book details
        System.out.print("Enter the book's name: ");
        String bookName =  scanner.next();
        System.out.print("Enter the book's price: ");
        int price =  scanner.nextInt();

        Book book = new Book (bookName, authors, price);

        System.out.println("The author(s) of the book " + book.getName()+ " is/are " + book.getAuthors());



    }
}
