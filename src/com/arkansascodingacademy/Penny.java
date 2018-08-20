package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Penny
{
    private int year;

    public Penny(int year)      //initialize the year variable
    {
        this.year = year;
    }

    public BigDecimal getFaceValue()        //return the face value of one penny
    {
        return new BigDecimal("0.01");
    }

    public BigDecimal getCollectibleValue ()        //return the collectible value of one penny
    {
        BigDecimal totalValue = getFaceValue();

        if (year < 1945)
        {
            BigDecimal yearsOlder = new BigDecimal(1945 - this.year);
            BigDecimal collectibleMultiplier = new BigDecimal("0.03");
            BigDecimal collectibleValueAdd = collectibleMultiplier.multiply(yearsOlder);
            totalValue = totalValue.add(collectibleValueAdd);
        }

        return totalValue;
    }
}
