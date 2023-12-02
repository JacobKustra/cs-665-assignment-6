/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Sugar.java
 * Description: The Sugar.java interface is extends the Condiment.java class
 * and contains the Sugar constructor method which sets the additional brew time
 * per each added Sugar.
 */

package edu.bu.met.cs665.assign6.condiment.condiment_types;

import edu.bu.met.cs665.assign6.condiment.Condiment;

/**
 * This is the Sugar class which contains the Sugar constructor method.
 */
public class Sugar extends Condiment {

  /**
   * The Sugar method sets the additional brew time per each added Sugar.
   */
  public Sugar() {
    super();
    this.setAddBrewTime(10);
  }
}
