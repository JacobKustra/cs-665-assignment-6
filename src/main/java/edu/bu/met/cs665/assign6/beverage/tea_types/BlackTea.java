/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: BlackTea.java
 * Description: The BlackTea.java class extends the Tea.java
 * class and sets some of the details for the Black Tea beverage.
 */

package edu.bu.met.cs665.assign6.beverage.tea_types;

import edu.bu.met.cs665.assign6.beverage.Tea;

/**
 * This is the BlackTea.java class which is a child class of Tea.java.
 */
public class BlackTea extends Tea {

  /**
   * The BlackTea method is used to set up the basic profile for the Black Tea Beverage.
   */
  public BlackTea() {
    super();
    this.setDrinkName("Black Tea");
  }
}
