/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: TestAge.java
 * Description: The TestAge.java class contains the various tests needed to
 * ensure the automated beverage machine is running as expected.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assign6.beverage.coffee_types.Americano;
import edu.bu.met.cs665.assign6.beverage.tea_types.BlackTea;
import edu.bu.met.cs665.assign6.beverage.tea_types.YellowTea;
import edu.bu.met.cs665.assign6.condiment.condiment_types.Milk;
import org.junit.Test;

/**
 * This is the TestAge Class, containing unit tests for my Fully
 * Automatic Beverage Vending Machine program.
 */
public class TestAge {

    /**
     * Given an Americano beverage, we are able to set the brew time accordingly
     */
    @Test
    public void testAmericanoBrew() {
        Americano testA = new Americano();
        testA.setBrewTime(100);
        if (testA.getBrewTime() == 100) {
            assert true;
        }else {
            assert false;
        }
    }

    /**
     * Given a Black Tea beverage, we are able to set the size accordingly
     */
    @Test
    public void testBeverageSize() {
        BlackTea testB = new BlackTea();
        testB.setDrinkSize(16);
        if (testB.getDrinkSize() == 16) {
            assert true;
        }else {
            assert false;
        }
    }


    /**
     * Given a Yellow Tea beverage, we are able to set the drinks
     * name appropriately.
     */
    @Test
    public void testBeverageName() {
        YellowTea testC = new YellowTea();
        testC.setDrinkName("Yellow Tea");
        if (testC.getDrinkName().equals("Yellow Tea")) {
            assert true;
        } else {
            assert false;
        }
    }


    /**
     * Given the milk condiment, we are able to set the drinks
     * additional brew time appropriately.
     */
    @Test
    public void testMilk() {
        Milk testD = new Milk();
        testD.setAddBrewTime(200);
        if (testD.getAddBrewTime() == 200) {
            assert true;
        } else {
            assert false;
        }
    }

    /**
     * Given the sugar condiment, we are able to set the drinks
     * additional brew time appropriately.
     */
    @Test
    public void testSugar() {
        Milk testD = new Milk();
        testD.setAddBrewTime(10);
        if (testD.getAddBrewTime() == 10) {
            assert true;
        } else {
            assert false;
        }
    }
}
