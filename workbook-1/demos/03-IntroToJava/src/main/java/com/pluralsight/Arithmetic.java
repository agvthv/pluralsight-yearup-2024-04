package com.pluralsight;

public class Arithmetic
{
    public static void main(String[] args)
    {
        // Expression
        // An expression is a calculation that results in a single value
        // 5 + 4 => 9
        // 5 + 4 - 3 => 9 - 3 => 6

        // Statement
        // int sum = 5 + 4;

        // Addition
        int sum = 5 + 4;
        System.out.println("The sums of 5 + 4 = " + sum);

        // Division
        int quotient = 5/2; // NOT A 2.5
        System.out.println("5 / 2 = " + quotient);

        // Double
        double quotientDouble = 5.0/2; // has to be 5.0/2 to be correct .. otherwise it will divide both
        System.out.println("5 / 2 = " + quotientDouble);
    }
}
