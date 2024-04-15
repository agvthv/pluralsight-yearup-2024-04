package com.pluralsight;

import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        // create variables
        // ask user for sandwich size
        // ask users for their names
        // display cost of sandwich

        // create variables
        final int REGULAR = 1;
        final double SMALLPRICE = 5.45;
        final int BIG = 2;
        final double LARGEPRICE = 8.95;

        // sandwich size
        System.out.print("Welcome. Would you like a 1) small or 2) large? ");
        int size = userInput.nextInt();

        // age
        System.out.print("How old are you? ");
        int age = userInput.nextInt();

        // discount
        double discount;
        if (age <=17)
        {
            discount = 0.1;
        }
        else if (age >= 65)
        {
            discount = 0.2;
        }
        else
        {
            discount = 0.0;
        }
        // calculate price
        double total;
        if (size == REGULAR)
        {
            total = SMALLPRICE * (1 - discount);
        }
        else
        {
            total = LARGEPRICE * (1 - discount);
        }

        // display
        System.out.printf("Total: $ %.2f", total);
    }
}

