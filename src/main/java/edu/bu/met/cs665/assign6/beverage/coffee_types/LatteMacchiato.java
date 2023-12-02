/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: LatteMacchiato.java
 * Description: The LatteMacchiato.java class extends the Coffee.java
 * class and sets some of the details for the Latte Macchiato beverage.
 */

package edu.bu.met.cs665.assign6.beverage.coffee_types;

import edu.bu.met.cs665.assign6.beverage.Coffee;

/**
 * This is the LatteMacchiato.java class which is a child class of Coffee.java.
 */

public class LatteMacchiato extends Coffee {
  /**
   * The LatteMacchiato method is used to set up the basic profile for the Latte Macchiato Beverage.
   */
  public LatteMacchiato() {
    super();
    this.setDrinkName("Latte Macchiato");
    this.setBrewTime(200);
  }
}
