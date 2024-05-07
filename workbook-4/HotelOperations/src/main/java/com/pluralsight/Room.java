package com.pluralsight;

public class Room
{
    private int numberOfBeds;
    private double  price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty)
    {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;

    }
    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean isAvailable(){
        return !dirty && !occupied;
    }
    public boolean isCheckIn(){
        return occupied && dirty;
    }
    public boolean isCheckOut(){
        return !isCleanRoom() && !isCheckIn();
    }
    public boolean isCleanRoom(){
        return !dirty && !occupied;
    }
}
