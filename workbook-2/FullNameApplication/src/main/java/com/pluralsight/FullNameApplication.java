package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication
{
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        fullName();
    }

    public static void fullName()
    {
        Scanner userInput = new Scanner(System.in);

        // first name
        System.out.print("Enter your first name: ");
        String firstName = userInput.nextLine().strip().toUpperCase();

        // middle name
        System.out.print("Enter your middle name: ");
        String middleName = userInput.nextLine().strip().toUpperCase();

        // last name
        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine().strip().toUpperCase();

        // suffix
        System.out.print("Enter your suffix: ");
        String suffix = userInput.nextLine().strip().toUpperCase();

        // print name

        System.out.print(firstName + " ");

        if(!middleName.isBlank())
        {
            System.out.print(middleName + " ");
        }
        else
        {
            middleName = "";
        }

        System.out.print(lastName + " ");
        if(!suffix.isBlank())
        {
            System.out.print(suffix + " ");
        }
        else
        {
            suffix = "";
        }
    }
}