package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Quarter
{
    private int year;       //initialize the year variable

    public Quarter(int year)
    {
        this.year = year;
    }

    public BigDecimal getFaceValue()        //return the face value of one quarter
    {
        return new BigDecimal("0.25");
    }

    public BigDecimal getCollectibleValue()     //return the collectible value of one quarter
    {
        BigDecimal totalValue = getFaceValue();

        if (year < 1923)
        {
            BigDecimal yearsOlder = new BigDecimal(1923 - this.year);
            BigDecimal collectibleMultiplier = new BigDecimal("0.22");
            BigDecimal collectibleValueAdd = collectibleMultiplier.multiply(yearsOlder);
            totalValue = totalValue.add(collectibleValueAdd);
        }

        return totalValue;
    }
}
