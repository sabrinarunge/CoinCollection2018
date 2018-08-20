package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Nickel
{
    private int year;

    public Nickel(int year)     //initialize the year variable
    {
        this.year = year;
    }

    public BigDecimal getFaceValue()        //return the face value of one nickel
    {
        return new BigDecimal("0.05");
    }

    public BigDecimal getCollectibleValue()     //return the collectible value of one nickel
    {
        BigDecimal totalValue = getFaceValue();

        if (year < 1935)
        {
            BigDecimal yearsOlder = new BigDecimal(1935 - this.year);
            BigDecimal collectibleMultiplier = new BigDecimal("0.10");
            BigDecimal collectibleValueAdd = collectibleMultiplier.multiply(yearsOlder);
            totalValue = totalValue.add(collectibleValueAdd);
        }
        return totalValue;
    }
}
