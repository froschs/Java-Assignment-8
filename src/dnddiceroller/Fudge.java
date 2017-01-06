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
public class Fudge implements Die {
  private int side; //Number of sides on the die
  private int value; //Value of the side
  
  //Constructor for Fudge class accepts int value for number of sides
  public Fudge(int side){
      this.side = side;
  }
  
  //Accessor to get value field
  @Override
  public int getValue(){
      return value;
  }
  
  /**
   * @param roll method assigns random int number to value field by setting the
   * random range from 0 to 2 and subtracting 1 to get a -1, 0, or +1 result
   */
  @Override
  public int roll(){
      Random rand = new Random();
      return this.value = rand.nextInt(3) - 1;
  }
}
