import acm.program.*;
import acm.util.*;


public class magicNumber extends ConsoleProgram { 
    public void run () {
    RandomGenerator rg = new RandomGenerator();
    int c = 0;
    int y = rg.nextInt(1, 20);
        do {
        int mn = readInt("Guess my magic number between (1-20): ");
            if (mn == y) {
                println("Correct");
                break;
            }
            else {
                println("Incorrect");
                c = c++;
            }
        } while(true);
        
        println("you attempted " + c + " times");


  }
 }

