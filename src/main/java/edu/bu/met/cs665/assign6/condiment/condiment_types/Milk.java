/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Milk.java
 * Description: The Milk.java interface is extends the Condiment.java class
 * and contains the Milk constructor method which sets the additional brew time
 * per each added Milk.
 */

package edu.bu.met.cs665.assign6.condiment.condiment_types;

import edu.bu.met.cs665.assign6.condiment.Condiment;

/**
 * This is the Milk class which contains the Milk constructor method.
 */
public class Milk extends Condiment {

  /**
   * The Milk method sets the additional brew time per each added Milk.
   */
  public Milk() {
    super();
    this.setAddBrewTime(20);
  }
}
