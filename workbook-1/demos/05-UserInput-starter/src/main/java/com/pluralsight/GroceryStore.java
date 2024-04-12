package com.pluralsight;

import java.util.Scanner;

import static java.lang.Character.getName;

public class GroceryStore

{
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {

        // input variables
        String customerName;
        int quantity;
        double cashReceived;

        // calculated
        double totalPrice;
        double changeReturned;
        int productId;


        // get user input
        customerName = getName();

        System.out.println();
        System.out.printf("Welcome %s. Today's products are: \n", customerName);
        System.out.printf("1) %s - $ %.2f \n", PRODUCT_CHOCOLATE, PRODUCT_CHOCOLATE_PRICE);
        System.out.printf("2) %s - $ %.2f \n", PRODUCT_CANDY, PRODUCT_CANDY_PRICE);
        System.out.println();

        System.out.println("Please select a product: ");
        productId = userInput.nextInt();

        System.out.print("How many would you like to buy? ");
        quantity = userInput.nextInt();

        // calculations
        if(productId == 1)
        {
            totalPrice = PRODUCT_CHOCOLATE_PRICE * quantity;
            System.out.printf("The total is %.2f \n", totalPrice);
        }
        else if(productId == 2)
        {
            totalPrice = PRODUCT_CANDY_PRICE * quantity;
            System.out.printf("The total is %.2f \n", totalPrice);
        }

        totalPrice = quantity * productId;
        System.out.print("Please enter your cash amount: ");
        cashReceived = userInput.nextInt();

        changeReturned = cashReceived - totalPrice;

        // display the receipt
        System.out.println();
        System.out.printf("Welcome %s. \n", customerName);
        System.out.printf("Total:  $ %6.2f \n", totalPrice);
        System.out.printf("Cash:   $ %6.2f \n", cashReceived);
        System.out.printf("Change: $ %6.2f \n", changeReturned);
    }
    public static void displayProducts()
    {
        final String PRODUCT_CHOCOLATE = "Milka Aplenmilch";
        final double PRODUCT_CHOCOLATE_PRICE = 2.99;
        final String PRODUCT_CANDY = "Skittles";
        final double PRODUCT_CANDY_PRICE = 1.49;
    }
    public static String getName()
    {
        System.out.print("Please enter your name: ");
        return userInput.
    }

}