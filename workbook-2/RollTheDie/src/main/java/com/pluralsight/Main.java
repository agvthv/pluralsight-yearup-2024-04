package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Dice dice = new Dice();
        int dice1;
        int dice2;
        int sum;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;



        for (int i = 1; i <= 20; i++){
            dice1 = dice.roll();
            dice2 = dice.roll();

            sum = dice1 + dice2;
            if (sum == 2) twoCounter++;
            else if(sum == 4)fourCounter++;
            else if(sum == 6)sixCounter++;
            else if(sum == 7)sevenCounter++;


            System.out.printf("Roll %d: %d - %d = %d \n", i, dice1, dice2, sum);



        }
        System.out.println("---------------------------");
        System.out.printf("Count 2: %d \n", twoCounter);
        System.out.printf("Count 4: %d \n", fourCounter);
        System.out.printf("Count 6: %d \n", sixCounter);
        System.out.printf("Count 7: %d \n", sevenCounter);

    }
}