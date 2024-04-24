package com.pluralsight;

public class Main
{

    public static void main(String[] args)
    {
        /* you can create containers with different sizes depending on content
        ex. moving a six egg carton to a 12 egg carton
         */

        System.out.println("Intro to Arrays");
        int[] numbers; // container that holds int. numbers =/=  actual value
        String[] names;
        Person[] people;

        // numbers
        int[] numbers; // container that holds int. numbers =/=  actual value
        numbers = new int[6];
        numbers[0] = 13;
        numbers[1] = 5;
        numbers[2] = 97;
        numbers[3] = 55;
        numbers[4] = 33;
        numbers[5] = 78;

        for (int i = 0; i < numbers.length; i++){ //if hardcoded = i < 6;
            System.out.println(numbers[i]);
        }
        // days
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // custom classes
        Person[] people = {

        }


    }
}