package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CoinCollection
{
    private ArrayList<Quarter> quartersList = new ArrayList<>();    //create an array list to keep track of all the coins
    private ArrayList<Dime> dimesList = new ArrayList<>();
    private ArrayList<Nickel> nickelsList = new ArrayList<>();
    private ArrayList<Penny> penniesList = new ArrayList<>();

    public CoinCollection(int numberOfQuarters, int numberOfDimes, int numberOfNickels, int numberOfPennies)        //initialize the number of quarters, dimes, nickels, pennies
    {
        final int DEFAULT_YEAR = 2000;

        for (int i = 0; i < numberOfQuarters; i++)
        {
            Quarter quarter = new Quarter(DEFAULT_YEAR);
            quartersList.add(quarter);
        }

        for (int i = 0; i < numberOfDimes; i++)
        {
            Dime dime = new Dime(DEFAULT_YEAR);
            dimesList.add(dime);
        }

        for (int i = 0; i < numberOfNickels; i++)
        {
            Nickel nickel = new Nickel(DEFAULT_YEAR);
            nickelsList.add(nickel);
        }

        for (int i = 0; i < numberOfPennies; i++)
        {
            Penny penny = new Penny(DEFAULT_YEAR);
            penniesList.add(penny);
        }
    }

    public void addPenny(int year)  //add pennies to the collection
    {
        Penny penny = new Penny(year);
        penniesList.add(penny);
    }

    public void addNickel(int year)     //add nickels to the collection
    {
        Nickel nickel = new Nickel(year);
        nickelsList.add(nickel);
    }

    public void addDime(int year)       //add dimes to the collection
    {
        Dime dime = new Dime(year);
        dimesList.add(dime);
    }

    public void addQuarter(int year)        //add quarters to the collection
    {
        Quarter quarter = new Quarter(year);
        quartersList.add(quarter);
    }

    public BigDecimal getPenniesFaceValue()     //return the face value of all pennies in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Penny penny : penniesList)
        {
            totalValue = totalValue.add(penny.getFaceValue());
        }
        return totalValue;
    }

    public BigDecimal getNickelsFaceValue()     //return the face value of all nickels in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Nickel nickel : nickelsList)
        {
          totalValue = totalValue.add(nickel.getFaceValue());
        }
        return totalValue;
    }

    public BigDecimal getDimesFaceValue()       //return the face value of all dimes in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Dime dime : dimesList)
        {
            totalValue = totalValue.add(dime.getFaceValue());
        }
        return totalValue;
    }

    public BigDecimal getQuartersFaceValue()        //return the face value of all quarters in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Quarter quarter : quartersList)
        {
            totalValue = totalValue.add(quarter.getFaceValue());
        }
        return totalValue;
    }

    public BigDecimal getPenniesCollectibleValue()      //return the collectible value of all pennies in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Penny penny : penniesList)
        {
            totalValue = totalValue.add(penny.getCollectibleValue());
        }

        return totalValue;
    }

    public BigDecimal getNickelsCollectibleValue()      //return the collectible value of all nickels in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Nickel nickel : nickelsList)
        {
            totalValue = totalValue.add(nickel.getCollectibleValue());
        }

        return totalValue;
    }

    public BigDecimal getDimesCollectibleValue()        //return the collectible value of all dimes in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Dime dime : dimesList)
        {
          totalValue = totalValue.add(dime.getCollectibleValue());
        }

        return totalValue;
    }

    public BigDecimal getQuartersCollectibleValue()     //return the collectible value of all quarters in the collection
    {
        BigDecimal totalValue = new BigDecimal("0.00");

        for (Quarter quarter : quartersList)
        {
            totalValue = totalValue.add(quarter.getCollectibleValue());
        }

        return totalValue;
    }

    public BigDecimal getFaceValue()        //return the face value of all coins in the collection
    {
        BigDecimal totalValue;

        BigDecimal totalPenniesValue = getPenniesFaceValue();
        BigDecimal totalNickelsValue = getNickelsFaceValue();
        BigDecimal totalDimesValue = getDimesFaceValue();
        BigDecimal totalQuartersValue = getQuartersFaceValue();

        BigDecimal intermediateValue = totalPenniesValue.add(totalNickelsValue);
        BigDecimal secondIntermediateValue = intermediateValue.add(totalDimesValue);
        totalValue = secondIntermediateValue.add(totalQuartersValue);

        return totalValue;
    }

    public BigDecimal getCollectibleValue()     //return the collectible value of all the coins in the collection
    {
        BigDecimal totalValue;

        BigDecimal totalPenniesValue = getPenniesCollectibleValue();
        BigDecimal totalNickelsValue = getNickelsCollectibleValue();
        BigDecimal totalDimesValue = getDimesCollectibleValue();
        BigDecimal totalQuartersValue = getQuartersCollectibleValue();

        BigDecimal intermediateValue = totalPenniesValue.add(totalNickelsValue);
        BigDecimal secondIntermediateValue = intermediateValue.add(totalDimesValue);
        totalValue = secondIntermediateValue.add(totalQuartersValue);

        return totalValue;
    }
}
