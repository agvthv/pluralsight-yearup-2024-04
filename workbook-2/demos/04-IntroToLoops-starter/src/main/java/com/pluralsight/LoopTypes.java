package com.pluralsight;

import java.util.Scanner;

public class LoopTypes
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        whileLoop();
        dowhileLoop();
        whileLoop10();
    }
    public static void  whileLoop(){
    String playAgain = "y";
    while (playAgain.equalsIgnoreCase("Y")){
        System.out.println("Welcome to my game");
        System.out.println("------------------");

        System.out.println();
        System.out.println(" do you want to play again? (y/n) ");
        playAgain = userInput.nextLine().strip().toLowerCase();
    }
        System.out.println();
        System.out.println("Thanks for playing! Come again");
    }
    public static void  dowhileLoop(){
        String playAgain1 = userInput.nextLine().strip().toLowerCase();
            do {
            System.out.println();
            System.out.println("do you want to play again? (y/n) ");
        }
        System.out.println();
        System.out.println("Thanks for playing! Come again");
    }
    public static void whileLoop10()
    {
        int counter = 0;
        while(counter < 10){
            System.out.println(counter);
            counter++;
        }
    }
    public static void forLoop(){
        //for loops are commonly used with arrays or any other collection
        for(int counter = 0; counter < 10; counter++){
            if(counter % 2 ==0) {// checks if number is even
                continue; // skips even numbers
            }
            if(counter ==7){
                break; //will stop the loop completely
            }
            System.out.println(counter);
    }
}
}
