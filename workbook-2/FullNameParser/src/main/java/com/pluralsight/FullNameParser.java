package com.pluralsight;

import java.util.Scanner;

public class FullNameParser
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = userInput.nextLine().strip().toUpperCase();
        String[] names = fullName.split(" ");

        // first name
        System.out.println("First name: " + names[0] + " ");

        // middle name
       boolean hasMiddle = names.length > 2;
        if (hasMiddle)
        {
            System.out.println("Middle name: " + names[1]);
            System.out.println("Last name: " + names[2]);
        }
        else
        {
            System.out.println("Last name: " + names[1]);
        }


        boolean op1 = Integer.parseInt()
        char op1 =ger;
        char op2 = '-'; Inte
        char op3 = '*';
        char op4 = '/';























    }
}