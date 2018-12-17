
import acm.program.*;

public class modulusDivision2 extends ConsoleProgram {
  public void run() {
    int cents = readInt("Enter a three-digit number: ");
    
    println("");
    
    int h=cents/100;
    int t=cents%100/10;
    int o=cents%100%10/1;
 
    println("The hundreds place digit is: " + h);
    println("The tens place digit is: " + t);
    println("The ones-place digit is: " + o);
    
    
  }
}
    
      

    
    
    
    
    
    