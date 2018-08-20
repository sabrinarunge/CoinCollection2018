package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Dime
{
    private int year;       //initialize the year variable

    public Dime(int year)
    {
        this.year = year;
    }

    public BigDecimal getFaceValue()        //return the face value of one dime
    {
        return new BigDecimal("0.10");
    }

    public BigDecimal getCollectibleValue()     //return the collectible value of one dime
    {
        return getFaceValue();
    }
}
