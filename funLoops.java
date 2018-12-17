import acm.program.*;
import acm.util.*;


public class funLoops extends ConsoleProgram {
  public void run () {  
        
        //Program 1
        int d = readInt("Enter a number: ");
        int count = 0;
                while(d != 0) {
                  d /= 10;
                  ++count;            
                }
                println("digits: " +  count);
                
        //Program 2
        int e2 = readInt("Enter a number: ");
            while (e2 >= 10) {
                e2 /= 10;
            }    
        println(e2);

     
        //Program 3
        
        int t;
        int a1 = 0; 
        int a2 = 0; 
        int a3 = 0;
        int e3 = readInt("Enter a number: ");
        int e4 = e3;
        while (e3 >= 10) {
          e3 = (Math.abs(e3)/10);
        }

        a1 = e3;
        a2 = (Math.abs(e4)%10);
        t = a1 + a2;
        
        println(t);

        

        
        
  
                  
                 
                
              
        

        
}
}

