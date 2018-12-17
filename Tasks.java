import java.text.NumberFormat;
import acm.program.*;

public class Tasks extends ConsoleProgram { 
    public void run () {
      
      NumberFormat percent = NumberFormat.getPercentInstance();
      
      double designing;
      double coding;
      double debugging;
      double testing;
      
      double designingpc;
      double codingpc;
      double debuggingpc;
      double testingpc;
      

 designing = readInt("Designing: ");
 coding = readInt("Coding: ");
 debugging = readInt("Debugging: ");
 testing = readInt("Testing: ");

 double total = (designing + coding + debugging + testing);

 designingpc = designing / total;
 codingpc = coding / total;
 debuggingpc = debugging / total;
 testingpc = testing / total;

 println("Task  % Time");

 println("Designing " + percent.format(designingpc));
 println("Coding  " + percent.format(codingpc));
 println("Debugging " + percent.format(debuggingpc));
 println("Testing " + percent.format(testingpc));

    }
}
 



 

