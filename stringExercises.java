import acm.program.*;

public class stringExercises extends ConsoleProgram {
        public void run () {
                String word = readLine("Enter name: ");
 

                //Program 1
                for (int x = 0; x < word.length(); x++) {
                        println(word.substring(x, x + 1) + " = " + x);
                }

                //Program 2
                String word2 = readLine("Enter name: ");
                
                int v = 0;
                int c = 0;
                for (int x = 0; x < word2.length(); x++) {
                  if (word2.substring(x, x + 1).equalsIgnoreCase("A")) {
                                v++;
                  }
                  else if (word2.substring(x, x + 1).equalsIgnoreCase("E")) {
                      v++;
                  }
                  
                  else if (word2.substring(x, x + 1).equalsIgnoreCase("I")) {
                      v++;
                  }
                  
                  else if (word2.substring(x, x + 1).equalsIgnoreCase("O")) {
                      v++;
                  }
                  
                  else if (word2.substring(x, x + 1).equalsIgnoreCase("U")) {
                      v++;
                  }

                  else {
                     c++;
                  }
}
                println("vowels: " + v);
                println("consonant: " + c);
                
                //Program 3
                String word3 = readLine("Enter name: ");
                int len = word3.length();
                //String word4 = "";
                
                for (int x = len - 1; x >= 0; x = x - 1) {
                    print(word3.substring(x , x + 1));
                }
                

                


        }
}
                
