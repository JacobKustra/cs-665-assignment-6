/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: VendingMachineInterface.java
 * Description: The VendingMachineInterface.java class is used by the customer to start the
 * automated beverage machine.
 */

package edu.bu.met.cs665.assign6.machine;

/**
 * This is the VendingMachineInterface class which contains the processes to start and run
 * the automated beverage machine.
 */
public class VendingMachineInterface {

  /**
   * This is the VendingMachineInterface method take the
   * customer through the menu of selecting a drink and making
   * it to their desired specifications.
   */
  public VendingMachineInterface() {

    Initialization initialization = new Initialization();

    Integer totalBrewTime = initialization.totalBrewTime;

    Brewing brewing = new Brewing(totalBrewTime);
  }
}
