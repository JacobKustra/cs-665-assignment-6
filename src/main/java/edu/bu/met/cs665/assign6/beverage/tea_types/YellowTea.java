/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: YellowTea.java
 * Description: The YellowTea.java class extends the Tea.java
 * class and sets some of the details for the Yellow Tea beverage.
 */

package edu.bu.met.cs665.assign6.beverage.tea_types;

import edu.bu.met.cs665.assign6.beverage.Tea;

/**
 * This is the YellowTea.java class which is a child class of Tea.java.
 */
public class YellowTea extends Tea {

  /**
   * The YellowTea method is used to set up the basic profile for the Yellow Tea Beverage.
   */
  public YellowTea() {
    super();
    this.setDrinkName("Yellow Tea");
  }
}
