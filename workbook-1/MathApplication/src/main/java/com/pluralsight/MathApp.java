package com.pluralsight;

public class MathApp
{
    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1()
    {
        // Question 1:
        // declare variables here
        double bobSalary = 134590;
        double garySalary = 67908;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is..." + highestSalary);

        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here
        double carPrice = 34000.99;
        double truckPrice = 45009.99;
        double smallest = Math.min(carPrice, truckPrice);
        System.out.println("Smallest price: " + smallest);


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle is: " + area);
        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here
        double root = 5;
        double squareRoot = Math.sqrt(root);
        System.out.println("Square Root of 5: " + squareRoot);


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here
        double xFirst = Math.pow(80, 2);
        double xSecond = Math.pow(40, 2);
        double xThird = xFirst + xSecond;
        double xResult = Math.sqrt(xThird);
        System.out.println("Distance Between 2 Points: " + xResult);
        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7:
        // declare variables here
        double random = Math.random();
        System.out.println(random);

        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }
}