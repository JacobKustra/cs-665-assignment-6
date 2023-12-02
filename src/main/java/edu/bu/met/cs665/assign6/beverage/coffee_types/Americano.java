/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Americano.java
 * Description: The Americano.java class extends the Coffee.java
 * class and sets some of the details for the Americano beverage.
 */

package edu.bu.met.cs665.assign6.beverage.coffee_types;

import edu.bu.met.cs665.assign6.beverage.Coffee;

/**
 * This is the Americano.java class which is a child class of Coffee.java.
 */
public class Americano extends Coffee {
  /**
   * The Americano method is used to set up the basic profile for the Americano Beverage.
   */
  public Americano() {
    super();
    this.setDrinkName("Americano");
    this.setBrewTime(100);
  }
}
