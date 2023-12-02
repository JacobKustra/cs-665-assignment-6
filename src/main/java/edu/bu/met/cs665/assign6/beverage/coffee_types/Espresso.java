/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Espresso.java
 * Description: The Espresso.java class extends the Coffee.java
 * class and sets some of the details for the Espresso beverage.
 */

package edu.bu.met.cs665.assign6.beverage.coffee_types;

import edu.bu.met.cs665.assign6.beverage.Coffee;

/**
 * This is the Espresso.java class which is a child class of Coffee.java.
 */
public class Espresso extends Coffee {
  /**
   * The Espresso method is used to set up the basic profile for the Espresso Beverage.
   */
  public Espresso() {
    super();
    this.setDrinkName("Espresso");
    this.setDrinkSize(2);
    this.setBrewTime(60);

  }
}
