/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Condiment.java
 * Description: The Condiment.java class implements the CondimentProduct.java
 * interface and overrides the methods to set and retrieve additional brew time due
 * to the additional added condiments. It is also the parent class of the Sugar.java
 * and Milk.java classes.
 */

package edu.bu.met.cs665.assign6.condiment;

/**
 * The Condiment.java class implements the CondimentProduct.java
 * interface and overrides the methods to set and retrieve additional brew time due
 * to the additional added condiments.
 */
public class Condiment implements CondimentProduct{
  protected int additionalBrewTime;

  /**
   * This is the setAddBrewTime method which sets the brew time according to the integer used
   * for condiments.
   */
  @Override
  public void setAddBrewTime(Integer additionalBrewTime) {
    this.additionalBrewTime = additionalBrewTime;
  }

  /**
   * This is the getAddBrewTime method which returns the additional brew time from
   * adding condiments.
   */
  @Override
  public Integer getAddBrewTime() {
    return additionalBrewTime;
  }
}
