package com.pluralsight;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String department;
    private double hoursWorked;
    private double payRate;
    private double startTime;
    private boolean punchedIn = false;

    public Employee(int employeeID, String employeeName, String department, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getPayRate() {
        return payRate;
    }

    public boolean isOvertime() {
        return hoursWorked > 40;
    }

    public double getTotalPay() {
        return getRegularHours() + getOvertimeHours();
    }

    public double getRegularHours() {
        return payRate * hoursWorked;
    }

    public double getOvertimeHours() {
        if (isOvertime()) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate;
        }
        return 0;
    }

    public void punchTimeCard(double time) {
        if (!punchedIn) {
            startTime = time;
            punchedIn = true;
        } else {
            hoursWorked += time - startTime;
            punchedIn = false;
        }
    }
}
