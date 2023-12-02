/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Initialization.java
 * Description: The Initialization.java class is used while initializing the machine to
 * start up the automated beverage process.
 */

package edu.bu.met.cs665.assign6.machine;

/**
 * The Initialization.java class is used to initiate the automated beverage machine process.
 */
public class Initialization {

  protected Integer totalBrewTime;

  /**
   * This is the Initialization constructor method communicates to the customer about the
   * machine startup and starts the beverage choosing process.
   */
  public Initialization() {
    System.out.println("Hello and welcome to the Fully Automatic Beverage Vending "
        + "Machine created by Jacob Kustra");
    System.out.println("Please choose from the following menu options to brew a beverage.\n");

    BeverageFactory startMenu = new BeverageFactory();
    CondimentFactory startMenu2 = new CondimentFactory();
    System.out.println("\nBrewing your " + startMenu.size + "oz " + startMenu.name + " with "
        + startMenu2.milkNumber + " milk and " + startMenu2.sugarNumber + " sugar now.");
    int totalBrewTime = (startMenu.brewMultiplier * startMenu.brewTime) + startMenu2.addBrewTime;
    setTotalBrewTime(totalBrewTime);
  }

  /**
   * This is the setTotalBrewTime method which sets the total brew time of the beverage by
   * combining the wait from the beverage brewing and condiment additions.
   */
  public void setTotalBrewTime(Integer brewTimeTotal) {
    this.totalBrewTime = brewTimeTotal;
  }
}
