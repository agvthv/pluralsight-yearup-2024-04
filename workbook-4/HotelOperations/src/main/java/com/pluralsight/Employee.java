package com.pluralsight;

public class Employee
{
    private int employeeID;
    private String employeeName;
    private String department;
    private int hoursWorked;
    private double payRate;


    public Employee(int employeeID, String employeeName, String department, int hoursWorked)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public double getPayRate()
    {
        return payRate;
    }
}
