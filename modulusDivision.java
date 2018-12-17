import acm.program.*;

public class modulusDivision extends ConsoleProgram {
  public void run() {
    int cents = readInt("Enter the change in cents: ");
    
    println("");
    println("The minimum number of coins is: ");
    
    int quarters=cents/25;
    int dimes=cents%25/10;
    int nickels=cents%25%10/5;
    int pennies=cents%25%10%5;
    
    println("Quarters: " + quarters);
    println("Dimes: " + dimes);
    println("Nickels: " + nickels);
    println("Pennies: " + pennies);
    
    
  }
}
    
      

    
    
    
    
    
    