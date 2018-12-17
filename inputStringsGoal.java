import java.text.NumberFormat;
import acm.program.*;

public class inputStringsGoal extends ConsoleProgram {
    public void run () { 
 String first  = readLine("Enter your first name: ");
 String last  = readLine("Enter your last name: ");
 double made = readDouble("Enter field goals made: ");
 double att = readDouble("Enter field goals attempted: ");
 NumberFormat percent = NumberFormat.getPercentInstance();
 double pc = (made / att);


 



 println(first + " " + last + " made " + made + " out of " + att + " shots and his field goal percentage was " + percent.format(pc));



  

 

    }
}

