import acm.program.*;

public class stringSplit extends ConsoleProgram {
        public void run () {
                
                /* Elijah, I swear to god, you fuck. 
                 * Do not copy this shit word-for-word. 
                 * I almost caught the work with Haji earlier. 
                 * Just change the variables and ruin the spacing.
                 */
          
                
                
                
                // Program 1
                String word = readLine("Enter Word: ");
                int len = word.length();
                
                println("First half: " + word.substring(0, (len / 2)));
                println("Second half: " + word.substring((len / 2), len));
                
                
                // Program 2
                String word2 = "";
                String e = readLine("Enter word: \t");
                word2 += e.substring(0, 1);
                do {
                    
                    String c = readLine("Continue (y/n): ");

                    if (c.equalsIgnoreCase("Y")) {
                      e = readLine("Enter word: \t");  
                      word2 += e.substring(0, 1);
                    }
                    
                    else if (c.equalsIgnoreCase("N")) {
                        break;
                    }
                    else { 
                      c = readLine("Error: Continue (y/n): ");
                    }

                } while(true);
        
                println("Word: " + word2);
}
}

