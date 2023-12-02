/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: CondimentProduct.java
 * Description: The CondimentProduct.java interface is implemented by the Condiment.java class
 * and contains default methods for it to override.
 */


package edu.bu.met.cs665.assign6.condiment;

/**
 * The CondimentProduct.java interface contains default methods for it to override.
 */
public interface CondimentProduct {

  /**
   * This is the setAddBrewTime method which sets the brew time according to the integer used
   * for condiments.
   */
  default void setAddBrewTime(Integer additionalBrewTime) {
  }

  /**
   * This is the getAddBrewTime method which returns the additional brew time from
   * adding condiments.
   */
  default Integer getAddBrewTime() {
    return null;
  }

}
