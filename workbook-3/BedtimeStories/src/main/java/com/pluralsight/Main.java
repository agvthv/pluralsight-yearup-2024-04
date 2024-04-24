package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        homeSelection();
    }

    public static String homeSelection() {
        System.out.print("What story would you like to read? \n 1) Goldilocks \n 2) Hansel and Gretel \n 3) Mary Had a Little Lamb \n");
        System.out.print("Please input here: ");
        System.out.println();
        int choice = userInput.nextInt();
        if (choice == 1) {
            goldilocks("File/goldilocks.txt");
        } else if (choice == 2) {
            hanselGretel("File/hansel_and_gretel.txt");

        } else if (choice == 3) {
            maryLamb("File/mary_had_a_little_lamb.txt");
        } else {
            System.out.println("Have a nice day");
        }
        return "";
    }






    public static void goldilocks(String fileName){

        File file = new File(fileName);
        String filePath = "File/goldilocks.txt";
        try(Scanner fileScanner = new Scanner(file))
        {
            while(fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("That was a bad file name");
        }
    }
    public static void hanselGretel (String fileName){
        File file = new File(fileName);
        String filePath = "File/hansel_and_gretel.txt";
        try(Scanner fileScanner = new Scanner(file))
        {
            while(fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("That was a bad file name");
        }
//        System.out.println("Would you like to read another book? (Y/N)");
//        boolean yes = true;
//        if (yes){
//            homeSelection();
//        }


    }
    public static void maryLamb (String fileName){
        File file = new File(fileName);
        String filePath = "File/mary_had_a_little_lamb.txt";
        try(Scanner fileScanner = new Scanner(file))
        {
            while(fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("That was a bad file name");
        }
    }
}