package dnddiceroller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul Scarrone
 * @author Seth Frosch
 */
public class DnDDiceRoller {

  /**
   * Try out your dies and dice tower
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	for(int i = 0; i< 1000; i++){
	  int d6 = test_oneD6();
	  if(d6 != -1){
		System.out.println("Die Test Failed with Value: " + d6);
	  }
	  int tower = test_diceTowerWithTwoD6();
	  if(tower != -1){
		System.out.println("Tower Test Failed with Value: " + tower);
	  }
	}
  }
  
  public static int test_oneD6(){
	NumberedDie die = new NumberedDie(6);
	die.roll();
	int dieValue = die.getValue();
	if(dieValue >= 1 && dieValue <= 6){
	  return -1; // Means the die value is outside its bounds for a d6
	}else{
	  return dieValue;
	}
  }
  
  public static int test_diceTowerWithTwoD6(){
	List<Die> dice = new ArrayList();
	dice.add(new Fudge(6));
        dice.add(new Loaded(6));
	DiceTower tower = new DiceTower(dice);
	tower.dropDice();
	int trayValue = tower.getTrayValue();
	if(trayValue >= 2 && trayValue <= 12){
	  return -1; // means the die value is outside the bounds of 2 d6
	}else{
	  return trayValue;
	}
  }
  
}
