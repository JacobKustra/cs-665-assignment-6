/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: GreenTea.java
 * Description: The GreenTea.java class extends the Tea.java
 * class and sets some of the details for the Green Tea beverage.
 */

package edu.bu.met.cs665.assign6.beverage.tea_types;

import edu.bu.met.cs665.assign6.beverage.Tea;

/**
 * This is the GreenTea.java class which is a child class of Tea.java.
 */
public class GreenTea extends Tea {

  /**
   * The GreenTea method is used to set up the basic profile for the Green Tea Beverage.
   */
  public GreenTea() {
    super();
    this.setDrinkName("Green Tea");
  }
}
