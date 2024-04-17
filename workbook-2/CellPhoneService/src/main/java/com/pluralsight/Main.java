package com.pluralsight;

import java.util.Scanner;


public class Main
{

    private static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args)
    {
        // declare variables
        int serialNumber;
        String model, carrier, phoneNumber, owner;

        // serial number
        CellPhone person1 = new CellPhone();
        System.out.print("What is the serial number?: ");
        serialNumber = userInput.nextInt();
        person1.setSerialNumber(serialNumber);
        userInput.nextLine();

        // model
        System.out.print("What model is the phone?: ");
        model = userInput.nextLine();
        person1.setModel(model);

        // carrier
        System.out.print("Who is the carrier?: ");
        carrier = userInput.nextLine();
        person1.setCarrier(carrier);

        // phone number
        System.out.print("What is the phone number?: ");
        phoneNumber = userInput.nextLine();
        person1.setPhoneNumber(phoneNumber);

        // owner
        System.out.print("Who is the owner of the phone?: ");
        owner = userInput.nextLine();
        person1.setOwner(owner);
        person1.dial("789-212-4567 \n");
        display(person1);
    }

    public static void display(CellPhone phone)
        {

            System.out.println("Owner Name: " + phone.getOwner());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println();

        }




}