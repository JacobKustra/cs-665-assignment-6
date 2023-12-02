/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Brewing.java
 * Description: The Brewing.java class is used while brewing the chosen beverage.
 */

package edu.bu.met.cs665.assign6.machine;

/**
 * The Brewing.java class is used to brew the beverage chosen.
 */
public class Brewing {

  /**
   * This is the Brewing constructor method communicates to the customer how
   * long they will wait while their chosen beverage brews and pause until it finishes.
   */
  public Brewing (int brewTimeTotal) {
    System.out.println("Please wait " + brewTimeTotal + "ms, while you beverage brews.");
    try {
      Thread.sleep(brewTimeTotal);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    System.out.println("\nFinished Brewing!");
    System.out.println("Please take your beverage, and enjoy your day.");
    System.out.println("Powering Off");
  }

}
