package com.pluralsight;

public class Jewelry extends FixedAsset
{
    public Jewelry(String name, double marketValue)
    {
        super(name, marketValue);
    }

    @Override
    public double getValue()
    {
        return 0;
    }
}
