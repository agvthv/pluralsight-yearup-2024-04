package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        // constructor
        Person person1 = new Person("Agatha", "Jung", 22); //this executes constructor
        // remove to use getter/setter
        //person1.setFirstName("Agatha");
        //person1.setLastName("Jung");
        //person1.setAge(22);

        // can happen if not using constructor with values. provides flexibility
        Person person2 = new Person();

        System.out.println("Hello world!");
    }
}