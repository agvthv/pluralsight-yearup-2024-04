package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        choice();
    }
    private static void choice()
    {
        String[] quotes =
                {
                    "The only way to do great work is to love what you do. - Steve Jobs",
                    "It does not matter how slowly you go as long as you do not stop. - Confucius",
                    "What you do speaks so loudly that I cannot hear what you say. - Ralph Waldo Emerson",
                    "In order to be irreplaceable one must always be different. - Coco Chanel",
                    "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill",
                    "Believe you can and you're halfway there. - Theodore Roosevelt",
                    "It's not whether you get knocked down, it's whether you get up. - Vince Lombardi",
                    "I have not failed. I've just found 10,000 ways that won't work. - Thomas A. Edison",
                    "You miss 100% of the shots you don't take. - Wayne Gretzky",
                    "I am not a product of my circumstances. I am a product of my decisions. - Stephen Covey"
                };
        try
        {
            System.out.print("Enter a number between 1 and 10 to select a quote:");

            int index = userInput.nextInt();
            System.out.println();
            index--;
            System.out.println(quotes[index]);
        }

        catch (Exception e)
        {
            System.out.println("Your number was out of range!");

        }
        System.out.println();
        System.out.println("Would you like to pick again? \n 1) Yes\n 2) No");
        System.out.print("Enter your choice here: ");
        int choice1 = userInput.nextInt();
        if (choice1 == 1){
                choice();
        }
        else
        {
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("Hope you liked your quote!");
        }





    }





}













