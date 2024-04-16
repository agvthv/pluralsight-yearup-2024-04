package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins
{
    public static void main(String[] args)
    {
        // ask user for score
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a game score (Home:Visitor|21:9) : ");
        String input = userInput.nextLine();

        String[] scores = input.split("[:|]");
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        String home = "score[0]";

        int homeScore = Integer.parseInt(home[1]);
        int visitorScore = Integer.parseInt(visitor[1]);

        if (home > visitor)
        {
            System.out.println("Home team wins!");
        }
        else if (visitor > home)
        {
            System.out.println("Visitor team wins!");
        }
        else
        {
            System.out.println("It's a tie!");
        }

    }