package dnddiceroller;

import java.util.Random;

/**
 * A Die is a many sided object that when rolled provides a random value from
 * 1 through the number of sides on the object. Some dice are 6 sided and have
 * the numbers 1-6 on them. Some dice are 20 sided with the numbers 1-20 on them.
 * Others are called fudge dice and have the values of -1 0 or +1
 * @author Paul Scarrone
 * @author Seth Frosch
 */
public class NumberedDie implements Die {
  private int side; //Number of sides on the die
  private int value; //Value of the side
  
  //Constructor for NumberedDie class accepts int value for number of sides
  public NumberedDie(int side){
      this.side = side;
  }
  
  //Accessor to get value field
  @Override
  public int getValue(){
      return value;
  }
  
  /**
   * @param roll method assigns random int number to value field by adding 1 to 
   * get value between 1 and number of sides
   */
  @Override
  public int roll(){
      Random rand = new Random();
      return this.value = rand.nextInt(this.side) + 1;
  }
}
