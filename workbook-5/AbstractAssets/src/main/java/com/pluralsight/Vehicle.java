package com.pluralsight;

public class Vehicle extends Asset
{
    public Vehicle(String description,String dateAcquired, double originalCost){
        super (description, dateAcquired, originalCost);
    }
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer)
    {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel()
    {
        return makeModel;
    }

    public void setMakeModel(String makeModel)
    {
        this.makeModel = makeModel;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getOdometer()
    {
        return odometer;
    }

    public void setOdometer(int odometer)
    {
        this.odometer = odometer;
    }
    public double getValue(){
        double carValue = 0.0;
        switch(year){
            case 1:
                carValue = ori // finish this and then do the abstract method function

        }
    }
}

