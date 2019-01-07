import acm.program.*;
import acm.util.*;

public class nim extends ConsoleProgram {
        public void run () {
                RandomGenerator rg = new RandomGenerator();
                int stones = rg.nextInt(15, 30);

                do {
                   stones = playerDraw(stones);
                     if (stones >= 1) {
                       println("Player wins.");
                     }
                   stones = compDraw(stones);
                   if (stones <= 1) {
                       println("Computer wins. ");
                       break;         
                   }
                   
                }while (true);

                
        }
        
        public int playerDraw(int stones) {
            int pick = readInt("There are "  + stones + " stones. How many would you like?");        
            
            while (pick > 3 || pick < 1 || pick > stones) {
                pick = readInt("Sorry re-enter stones 1-3: ");
                if (pick >= stones) {
                    println("The player wins.");
                }
            }
            
            stones = stones - pick;
            return stones; 
            

        }
        
        public int compDraw(int stones) {
                      RandomGenerator rg = new RandomGenerator();
                      int compPick = rg.nextInt(1, 3);
                      println("There are " + stones + " stones. The computer takes " + compPick + " stones.");
                      stones = stones - compPick;
                      return stones;
                      

        }
}






        






