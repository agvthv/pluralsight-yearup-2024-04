package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // ask user for name
        // ask for date of the show
        // ask for number of tickets they will purchase
        // display reservation

        Scanner userInput = new Scanner(System.in);

        //ask user for name
        System.out.println("Please enter your full name: ");
        String fullName = userInput.nextLine().strip().toUpperCase();
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // ask for date of show
        DateTimeFormatter formatter;
        System.out.println("What date are you attending? (MM/dd/yyyy):");
        String date = userInput.nextLine().strip();
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //ask for number of tickets
        System.out.println("How many tickets would you like?");
        String tickets  = userInput.nextLine().strip();

        // display
        System.out.printf("%s ticket(s) reserved for %s under %s, %s", tickets, date, lastName, firstName);





    }
}