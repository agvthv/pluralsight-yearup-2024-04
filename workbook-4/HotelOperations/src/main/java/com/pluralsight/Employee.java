package com.pluralsight;

public class Employee
{
    private int employeeID;
    private String employeeName;
    private String department;
    private int hoursWorked;
    private double payRate;


    public Employee(int employeeID, String employeeName, String department, int hoursWorked,double payRate)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
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

    public boolean isOvertime()
    {
        return hoursWorked > 40;
    }

    public double getTotalPay()
    {
        return getRegularHours() + getOvertimeHours();
    }

    public double getRegularHours()
    {
        return getPayRate() * getHoursWorked();
    }

    public double getOvertimeHours()
    {
        return isOvertime() ? hoursWorked * payRate:0;
    }
}

