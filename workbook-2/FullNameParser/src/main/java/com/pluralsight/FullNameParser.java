package com.pluralsight;

import java.util.Scanner;

public class FullNameParser
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = userInput.nextLine().strip().toUpperCase();

        String name = fullName.split()
    }
}