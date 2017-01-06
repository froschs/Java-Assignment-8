/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

import java.util.Random;

/**
 *
 * @author Seth Frosch
 */
public class Loaded implements Die {
  private int side; //Number of sides on the die
  private int value; //Value of the side
  
  //Constructor for Loaded class accepts int value for number of sides
  public Loaded(int side){
      this.side = side;
  }
  
  //Accessor to get value field
  @Override
  public int getValue(){
      return value;
  }
  
  /**
   * @param roll method assigns random int number to value field by adding 1 to 
   * get value between 1 and number of sides but continues to roll if the value
   * is less than the highest value
   */
  @Override
  public int roll(){
      Random rand = new Random();
      this.value = rand.nextInt(this.side) + 1;
      while(this.value<this.side){
          this.value = rand.nextInt(this.side) + 1;
      }
      return this.value;
  }
}
