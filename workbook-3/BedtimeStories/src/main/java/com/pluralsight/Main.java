package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = userInput.nextLine();

        String filePath = "File/mary_had_a_little_lamb.txt, hansel_and_gretel.txt, goldilocks.txt";
        File file = new File(filePath);
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