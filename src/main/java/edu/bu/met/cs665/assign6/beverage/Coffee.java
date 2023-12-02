/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Coffee.java
 * Description: The Coffee.java interface is extends the Beverage.java class
 * and contains the Coffee constructor method which sets the coffee default drink size
 * to allow for choice of sizes in the selection given to the customer.
 */

package edu.bu.met.cs665.assign6.beverage;


/**
 * This is the Coffee class which contains the Coffee constructor method.
 */
public class Coffee extends Beverage {

  /**
   * The Coffee method sets the drink's default size to allow the customer to have the choice
   * of sizes when using the beverage machine.
   */
  public Coffee() {
    super();
    this.setDrinkSize(0);
  }

}
