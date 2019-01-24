import acm.program.*;
import acm.util.*;

public class midtermGuessingGame extends ConsoleProgram {
    public void run () {
       
       
       int points = (1000); // Start with 1000 points.

       // Do-while loop for player's wage.
       do {
         while (points >= 0) {
           points = playerDraw(points); // Call the 'playerDraw' method.
           String answer = readLine("Play again (y/n) ? ");
           
           if (answer.equalsIgnoreCase("N")) {
             break;
           }
         }
       } while (true);
    }

    public int playerDraw (int points) {
        // Generates random number 
        RandomGenerator rg = new RandomGenerator();
        int number = rg.nextInt(1, 5);
        
        println("You have " + points + " points. ");
        int risk = readInt("How many points to risk: ");
        int pick = readInt("Predict your number: ");
        

        if (pick == number) {
            points = points + (risk * 5); // The amount risked is multiplied by 5.
            println("You predicted " + pick + " and the number was " + number + " so you win " + (risk * 5) + " points. ");
        }

        else {
            points = points - risk;
            println("You predicted " + pick + " and the number was " + number + " so you lose " + risk + " points. ");
        }
        
        
        
        

        return (points);

        

    }
}

    
           


