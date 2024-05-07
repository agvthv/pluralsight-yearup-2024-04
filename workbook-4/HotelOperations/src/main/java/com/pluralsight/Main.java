package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Room room = new Room(3,123.56,false,false);
        System.out.println("Room size: " + room.getNumberOfBeds());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Available: " + room.isAvailable());
        System.out.println("CheckIn: " + room.isCheckIn());
        System.out.println("Is room clean: " + room.isCleanRoom());
        System.out.println("Can you checkout: " + room.isCheckOut());

        Reservation hilton = new Reservation("King",7,true);
        System.out.println("-".repeat(20));
        System.out.println("Bed Size: " + hilton.getRoomType());
        System.out.println("How many nights: " + hilton.getNumberOfNights());
        System.out.println("Weekend: " + hilton.isWeekend());

        Employee employee = new Employee(45,"Joe Johnson", "Room Service",45, 56);
        System.out.println("-".repeat(20));
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Pay Rate: " + employee.getPayRate());
        System.out.println("Overtime: " + employee.isOvertime());
        System.out.println("Total Pay this week: " + employee.getTotalPay());



        }
    }
