package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.time.Period;

import java.time.*; //means that I'm installing everything under this class

public class HomeTasksDate {
    public static void main(String[] args) {

        //    Write a Java program to get year and months between two dates.

//        LocalDate today = LocalDate.now();
//        LocalDate userDay = LocalDate.of(2020, Month.JUNE, 23);
//
//        Period difference = Period.between(userDay, today);
//
//        System.out.println("The difference between" +
//                userDay + " - " +
//                today + ": " +
//                difference.getYears() + " years " + " and " + difference.getMonths() + " months ");


//    Task #2
//    Write a Java program to calculate the difference between two dates in days.

//        LocalDate userDate1 = LocalDate.of(2022, 1, 3);
//        LocalDate userDate1 = LocalDate.of(2020, 6, 22);
//        LocalDate userDate2 = LocalDate.of(2022, 3, 22);
//
//        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(userDate1, userDate2)); // ChronoUnit = inom
//        System.out.println("The difference between them in days is: " + numberOfDaysBetween);



//        Task #1
//        Write a program to calculate the age of a person, considering that they
//        (the user) only enters their date of birth

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Date of birth: ");
//        LocalDate birthDate = LocalDate.parse(scanner.next());
//
//        LocalDate today = LocalDate.now();
//Period difference = Period.between(birthDate, today);
//
//        System.out.println("The difference between " +
//                birthDate + " - " +
//                today + ": " +
//                difference.getYears() + " years " + " and " + difference.getMonths() + " months ");


//        LocalDate dateOfBirth = LocalDate.of(2020, Month.JUNE, 23);
//        LocalDate today = LocalDate.now();
//
//        Period difference = Period.between(dateOfBirth, today);
//
//        System.out.println("The difference between" +
//                dateOfBirth + " - " +
//                today + ": " +
//                difference.getYears() + " years " + " and " + difference.getMonths() + " months ");


//        Task #2
//        Write a program to calculate the number of days between two specified years
//        Beginning of each year is the input

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Pick a start year: ");
//        LocalDate year1 = LocalDate.parse(scanner.next());
//
//        System.out.println("Pick an end year: ");
//        LocalDate year2 = LocalDate.parse(scanner.next());
//
//
//        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(year1, year2)); // ChronoUnit = inom
//        System.out.println("The difference between them in days is: " + numberOfDaysBetween);

    }
}
