package com.pluralsight;

import java.util.Scanner;

public class WhileLoop
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        whileLoop();
        doWhileLoop();
        forLoop();
    }
    public static void whileLoop(){
        int count = 0;
        while (count < 5){
            System.out.println("I love Java");
            count ++;
        }

    }

        public static void doWhileLoop(){
            int count = 0;
            do {
                System.out.println("I love Java");
                count++;
            } while (count < 5);
        }
        public static void forLoop(){
        for(int i = 10; i > 0; i--){
            System.out.println(i);

        }
            System.out.println("Launch!");

        }
    }




