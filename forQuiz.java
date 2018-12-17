import acm.program.*;
import java.text.NumberFormat;
import acm.util.*;

public class forQuiz extends ConsoleProgram {
   public void run () {
    RandomGenerator rg = new RandomGenerator();
    
   int x;
    
    
    for (x = 0; x <= 100; x = x + 2) {
      print(x+"\t");
      
    }
    println("");
    int num = readInt("How many numbers: ");
    
    
    for (x = 1; x <= num; x++) {
      int r = rg.nextInt(1, 10);
      println("Number "+x+": "+r);

    }
    double ett = 0;
    int t = readInt("How many temperatures: ");
    double tt = 0;
    double st = 0;

    for (x=1;x<=t;x++) {
      double et = readDouble("Enter temperature: ");
      
 
      tt = tt + et;
      if (tt > tt) {
        double high = tt;
      }
      
    }
    
    double avg = tt / t;
    println("Average: "+avg);
    
    println("High: "+high);
    
    
    
    
    


      
      
    
}
  }


  
  
