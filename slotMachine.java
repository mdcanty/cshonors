import acm.program.*;
import acm.util.*;
import java.text.NumberFormat;

public class slotMachine extends ConsoleProgram {
        public void run () {
                RandomGenerator rg = new RandomGenerator();  
                int t = 20;
                String pull;

                do {
                        pull = readLine("You have " + t + " tokens, pull (y/n):");
                        
                        int a = rg.nextInt(1, 3);
                        int b = rg.nextInt(1, 3);
                        int c = rg.nextInt(1, 3);
                        
                        if (pull.equalsIgnoreCase("N")) {
                                break;
                        }

                        else if (pull.equalsIgnoreCase("Y")) {
                                println("[" + a + "] [" + b + "] [" + c + "]");
                                if (a == b && b == c && a == 1) {
                                        println("You won 4 tokens!");
                                        t = t + 4;
                                }

                                else if (a == b && b == c && a == 2) {
                                        println("You won 8 tokens!");
                                        t = t + 8;
                                }

                                else if (a == b && b == c && a == 3) {
                                        println("You won 12 tokens!");
                                        t = t + 12;
                                }

                                else {
                                        println("You lost");
                                        t = t - 1;
                                }
                        }
                } while(true);
        }
}
                
        
                             
                                        
