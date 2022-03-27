package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class TasksDate {
    public static void main(String[] args) {
        // Date is class under the java.util.Date package (has to  be imported)
        // It contains tools for managing and manipulating dates.

        Date date = new Date(); // not printing anything

//        date.getDay(); we cannot use this <-- deprecated

//        System.out.println(date);
//        System.out.println(date.getTime()); // gets the time in miliseconds since January 1970
//
//        LocalTime timeLocal = LocalTime.now(); // Library or class meant to handle most operations most to do with time
//        System.out.println(timeLocal); // The present second to nanosecond precision; it doesn't represent a date or time-zone
//
//        LocalDate localdate = LocalDate.now(); // just a date year - month - day
//        System.out.println(localdate);

//        LocalDateTime dateTime = LocalDateTime.now(); ???? WHY ISN'T THIS WORKING
//        System.out.println(dateTime); // this should get the date and the time
//
//  Task #1
//         A leap year is a year with an additional day in it because of the month of february.
//         Write a program that accepts a year from a user and tells the user if the year is a leap year or not.

//        Solution #1

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter a year: ");
//        int year = scanner.nextInt();
//
//        boolean leap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
//
//        System.out.println(leap ? "Leap year" : "not leap year");


//        Solution #2

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter a year: ");
//        int year = scanner.nextInt();
//
//        //YEAR MONTH CLASS. CHECK HOW MANY DAYS ARE IN FEBRUARY IN ORDER TO DEFINE THE LEAP YEAR.
//        YearMonth yearMonth = YearMonth.of(year, 2);
//        int daysInFebruary = yearMonth.lengthOfMonth();
//        System.out.println("In " + year + " year, in February there are " + daysInFebruary + " days.");
//
//        //IF-ELSE STATEMENT. PRINT.
//
//        if (daysInFebruary == 29) {
//            System.out.println("Year " + year + " is a leap year.");
//        } else {
//            System.out.println("Year " + year + " is NOT a leap year.");
//        }

//        Solution #3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = scanner.nextInt();
        //below input any day of year just to get the check,
        // as isLeapYear will only check the year
        Boolean isLeap = LocalDate.ofYearDay(year, 55).isLeapYear();

        if (isLeap == true) {
            System.out.println("The year is a leap year");
        }
        else {
            System.out.println("The year is NOT a leap year");
        }


        // Task #2
        // Write a program that returns the number or amount of hours between two (o'clock) times entered by the user.


//        Solution #1

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the start hour : ");
//        String userStart = scanner.nextLine();
//
//        System.out.println("Please enter the end hour: ");
//        String userEnd = scanner.nextLine();
//
//        int startHour = Integer.parseInt(userStart.split(":")[0]);
//        int endHour = Integer.parseInt(userEnd.split(":")[0]);
//
//        // If a time entered is in the morning assign it 12 else assign it 24
//        // to make it easy to compare numerically.
//        int amPmOne = userStart.split(" ")[1].equals("AM") ? 12 : 24; // 8:00 AM => ["8:00" "AM"] AM is the first index in array
//        int amPmTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;
//
//
//        // Split is one of string methods; Basically it breaks down the string
//        // " "
//        // The black bay ==> ["The" "black boy"] => ["The" "black" "boy"]
//
//        // subtract and find out the difference
//        int difference = (endHour + amPmTwo) - (startHour + amPmOne);
//        if (amPmOne < amPmTwo && startHour > endHour) difference += 12;
//
//        System.out.println(difference == 0 ? "No time has passed." : difference + " hours");

//        Solution #2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter start time (HH:mm): ");
//
//        String start = scanner.nextLine();
//        String[] split1 = start.split(":");
//        int startHours = Integer.valueOf(split1[0]);
//        System.out.println("Please enter end time (HH:mm): ");
//
//        String end = scanner.nextLine();
//        String[] split2 = end.split(":");
//        int endHours = Integer.valueOf(split2[0]);
//
//        System.out.println("Time difference is: " + (endHours - startHours) + " hours");


    }
}
