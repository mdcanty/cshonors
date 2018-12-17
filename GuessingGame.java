import acm.program.*;
import acm.util.*;

public class GuessingGame extends ConsoleProgram { 
    public void run () { 

 RandomGenerator rg = new RandomGenerator();
 int x = rg.nextInt(1,20);

 int y = readInt("Enter a number between 1 and 20: ");
 println("Computer's number: " + x);
 println("Player's number: " + y);

 if (x==y){
     println("You won!");
 }
 else {
     println("Better luck next time!");
 }
    }
}


