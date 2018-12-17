import acm.program.*;
import acm.util.*;
public class forDice extends ConsoleProgram {
  public void run () {
    
    int d = 0;
    int se = 0;
    int sv = 0;

    
    RandomGenerator r = new RandomGenerator();

    int rolls = readInt("How many rolls? ");
    
    for (int x = 1; x <= rolls; x++) {
      int die1 = r.nextInt(1, 6);
      int die2 = r.nextInt(1, 6);
      
      if (die1 == die2) {
        d += 1;
      }
      
      else if (die1 == 1 && die2 == 1) {
        se += 1;
      }
      
      else if (die1 + die2 == 7) {
        sv += 1;
      }
      
      else {
        
      
      println("Roll #" + x + "\t" + die1 + "\t" + die2 + "\t");
      println("Doubles:\t" + d);
      println("Rolls Totaling 7:\t" + sv);
      println("Snake Eyes:\t" + se);

    
      }
      
    }
  }
}
 

  




