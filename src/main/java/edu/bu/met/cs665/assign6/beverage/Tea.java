/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Tea.java
 * Description: The Tea.java interface is extends the Beverage.java class
 * and contains the Tea constructor method which sets the Tea default drink size
 * to allow for choice of sizes in the selection given to the customer and the total
 * brew time.
 */

package edu.bu.met.cs665.assign6.beverage;

/**
 * This is the Tea class which contains the Tea constructor method.
 */
public class Tea extends Beverage {

  /**
   * The Tea method sets the drink's default size to allow the customer to have the choice
   * of sizes when using the beverage machine and the total brew time.
   */
  public Tea() {
    super();
    this.setDrinkSize(0);
    this.setBrewTime(120);
  }
}
