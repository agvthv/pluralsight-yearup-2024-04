package com.pluralsight;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate
        // chocolate costs 3.99/bar
        // I have 20 dollars
        // I want to buy 3 bars
        double chocoPrice = 3.99;
        double balance = 20;
        double quantity = 3;
        double total = chocoPrice * quantity;
        System.out.println("Chocolate Bar: $" + chocoPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("-------------------------------");
        System.out.println("Amount Paid: $" + balance);
        System.out.println("Change: $" + (balance - total));

    }

    public static void question2()
    {
        // calculate the perimeter of a circle
        // for a circle with a radius of 12
        double radius = 12;
        double perimeter = 2 * Math.PI * radius;
        //calculate

        //output
        System.out.println("Perimeter of a circle with radius of 12: " + perimeter);

    }

}

