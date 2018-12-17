import acm.program.*;
import acm.util.*;

public class stringRandom extends ConsoleProgram {
        public void run () {
                String a = "abcdefghijklmnopqrstuvwxyz";
                String w = "";
                String e = readLine("How many letters in your word?");
                RandomGenerator rg = new RandomGenerator();
                int b = rg.nextInt(1, 26);  
                int l = e.length();
                       
                do {
                    for (int x = 0; x <= l; x++) {
                         b = rg.nextInt(1, 26);

                         w += a.substring(b);
 
                    }
                    
                    println(w);
                    w = "";
                    
                    String r = readLine("Another (y/n)?");
                    
                    if (r.equalsIgnoreCase("N")) {
                        break;
                    }
                    
                    else if (r.equalsIgnoreCase("Y")) {
                        e = readLine("How many letters in your word?");
                    }
                    
                        
                    
                    
                    
       
                    
                    
                } while(true);
                
               
        }
}
