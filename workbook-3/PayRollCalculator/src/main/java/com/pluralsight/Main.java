package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException
    {
        loadEmployeeData();
        displayData();
        String[] information = {"Agatha", "IS", "SO", "COOL"};
        writeToFile(information);

    }
    public static void loadEmployeeData() throws FileNotFoundException
    {
        File file = new File("employeeData/employee.csv");

        try(Scanner fileScanner = new Scanner(file))
        {

            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();

                String[] columns = line.split("[|]");
                int employeeId = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hoursWorked = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                employees.add(employee);


            }
        }
        catch (IOException exception){

        }

    }
    public static void displayData()
    {
        System.out.println();
        System.out.println("All Employees: ");
        System.out.println("-".repeat(30));


        for(Employee employee : employees)
        {

            System.out.printf("%-5d %-10s %-10.2f\n", employee.getId(), employee.getName(), employee.getGrossPay());

        }
    }
    public static void writeToFile(String[] words){
        File file = new File("employeeData/PayRollGrossPay");

        try(FileWriter writer = new FileWriter(file))
        {
            for(String line : words)
            {
                writer.write(line);
                writer.write("\n");
                writer.flush();
            }

        }
        catch(IOException ex)
        {

        }
    }

}