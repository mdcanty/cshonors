import acm.program.*;
import java.text.NumberFormat;
import acm.util.*;

public class highLow extends ConsoleProgram {
        
  
  public void run () { 
    int points = 1000; int risk = 0; int prediction = 0; int guess = 0;
      
      println("High Low Game");
      println();
      
      println("RULES");
      println("Numbers 1 through 6 are low");
      println("Number 7 is neither high nor low");
      println("Numbers 8 through 13 are high");

        do {
          guess++;
          println("You have " + points + ".");
          if (points <= 0) {
            println("Ran out of cash.");
            println("Guesses: " + guess);
            break;
          }
          
          else {
            prediction = readInt("Enter prediction: ");
            risk = readInt("Enter amount of cash you want to risk: ");
            points = play(points, risk, prediction);
          }
         
        } while(true);
  }



    public int play(int points, int risk, int prediction) {
        
        RandomGenerator rg = new RandomGenerator();
        int num = rg.nextInt(1, 13);

        println("Number is " + num);

        if ((num <= 6) && (prediction == 0)) {
                println("You win " + risk + " points");
                points = points + risk;

                return (points);
        }

        else if ((num >= 8) && (prediction == 1)) {
                println("You win " + risk + " points");
                points = points + risk;

                return (points);
        }

        else {
                println("You lose " + risk + " points");
                points = points - risk;
                return (points);
        }


}
}





