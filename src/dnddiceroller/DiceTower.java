package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 * Dice Tower.
 * A Dice Tower is a tool used by serious gamers use to roll many dice at once.
 * It looks like this https://www.miniaturescenery.com/Images/PortableDiceTowerLarge.jpg
 * An instance of a dice tower is defined by the number panels it contains to help
 * provide a more regular distribution of die values. The die bounce from panel to
 * panel until they exit the dice tower at the bottom tray.
 * A dice tower will accept a collection of dice and reports their results when
 * they reach the tray at the bottom
 * @author Paul Scarrone
 * @author Seth Frosch
 */
public class DiceTower {
  private final int PANEL_COUNT = 3;
  private List<Die> dice;
  private int trayValue; //Accumulator to total value of dice rolls

  public DiceTower() {
	this.dice = new ArrayList();
  }
  
  public DiceTower(List dice) {
	this.dice = dice;
  }
  
  //Accessor to get the total value for dice rolls
  public int getTrayValue(){
      return trayValue;
  }
  
  /**
   * @param dropDice method rolls each die in the arraylist for each panel and
   * the accumulator totals those values
   */
  public void dropDice(){
      for(int i = 0; i < this.dice.size(); i++){
          for(int ii = 0; ii < this.PANEL_COUNT; ii++){
              this.dice.get(i).roll();
          }
          this.trayValue += this.dice.get(i).getValue();
      }
  }

    
}
