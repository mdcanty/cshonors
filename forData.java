import acm.program.*;
import acm.util.*;
import java.text.NumberFormat;

public class forData extends ConsoleProgram {
    public void run () {
  

//#1

int pass = 0;
int fail = 0;
int x;
  int hm = readInt("How many LETTER grades to analyze? ");
 for (x = 1; x <= hm; x = x + 1) {

     String g = readLine("Enter letter grade #" + x + ": ");
     if (g.equalsIgnoreCase("A")) {
         pass = pass + 1;
     }
     
     else if (g.equalsIgnoreCase("B")) {
       pass = pass + 1;
     } 
     
     else if (g.equalsIgnoreCase("C")) {
       pass = pass + 1;
     } 
     
     else if (g.equalsIgnoreCase("D")) {
       pass = pass + 1;
     } 
     

     else if (g.equalsIgnoreCase("F")) {
         fail = fail + 1;
     }

     else {
         println("Invalid letter grade.");
     }
  }
    
     NumberFormat percent = NumberFormat.getPercentInstance();
 
     double rawPass = (double)pass/hm;
     double rawFail = (double)fail/hm;
     
     String totalPass = percent.format(rawPass);
     String totalFail = percent.format(rawFail);

     println(pass + " Passed with a " + totalPass);
     println(fail + " Failed with a " + totalFail);

    //#2

    int hmn = readInt("How many numeric grades to analyze? ");
    int totalGrade = 0;
    for (x = 1; x <= hmn; x = x + 1) {
    int ng = readInt("Enter Grade #" + x);
    	totalGrade = totalGrade + ng;  
    }

    int avg = totalGrade / hmn;

    println("Average: " + avg);

}
    
 
    
    
}
    

