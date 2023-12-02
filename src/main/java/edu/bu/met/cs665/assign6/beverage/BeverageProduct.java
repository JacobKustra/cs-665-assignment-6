/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: BeverageProduct.java
 * Description: The BeverageProduct.java interface is implemented by the Beverage.java class
 * and contains default methods for it to override.
 */

package edu.bu.met.cs665.assign6.beverage;

/**
 * The BeverageProduct.java interface contains default methods for it to override.
 */
public interface BeverageProduct {

  /**
   * The setDrinkName method sets the drink's name to the string used.
   */
  default void setDrinkName(String drinkName) {
  }

  /**
   * This is the getDrinkName method which returns the drinks name.
   */
  default String getDrinkName() {
    return null;
  }

  /**
   * This is the setDrinkSize method which sets the drinks size according to the integer used.
   */
  default void setDrinkSize(Integer drinkSize) {
  }

  /**
   * This is the getDrinkSize method which returns the drinks size.
   */
  default Integer getDrinkSize() {
    return null;
  }

  /**
   * This is the setBrewTime method which sets the drinks brew time according to the integer used.
   */
  default void setBrewTime(Integer brewTime) {
  }

  /**
   * This is the getBrewTime method which returns the brew time.
   */
  default Integer getBrewTime() {
    return null;
  }


}
