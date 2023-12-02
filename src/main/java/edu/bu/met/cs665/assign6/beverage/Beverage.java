/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Beverage.java
 * Description: The Beverage.java class implements the BeverageProduct.java
 * interface and overrides the methods to set and retrieve beverage details. It is also
 * the parent class of the Coffee.java and Tea.java classes.
 */

package edu.bu.met.cs665.assign6.beverage;

/**
 * The Beverage.java class implements the BeverageProduct.java
 * interface and overrides the methods to set and retrieve beverage details.
 */
public class Beverage implements BeverageProduct {

  protected String drinkName;

  protected Integer drinkSize;

  protected Integer brewTime;

  /**
   * The setDrinkName method sets the drink's name to the string used.
   */
  @Override
  public void setDrinkName(String drinkName) {
    this.drinkName = drinkName;
  }

  /**
   * The getDrinkName method returns the drink's name.
   */
  @Override
  public String getDrinkName() {
    return drinkName;
  }

  /**
   * This is the setDrinkSize method which sets the drinks size according to the integer used.
   */
  @Override
  public void setDrinkSize(Integer drinkSize) {
    this.drinkSize = drinkSize;
  }

  /**
   * This is the getDrinkSize method which returns the drinks size.
   */
  @Override
  public Integer getDrinkSize() {
    return drinkSize;
  }

  /**
   * This is the setBrewTime method which sets the drinks brew time according to the integer used.
   */
  public void setBrewTime(Integer brewTime) {
    this.brewTime = brewTime;
  }

  /**
   * This is the getBrewTime method which returns the brew time.
   */
  public Integer getBrewTime() {
    return brewTime;
  }

}
