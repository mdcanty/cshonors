import acm.program.*;

public class Program4 extends ConsoleProgram{
  public void run (){
    double laborCost=0.75;
    double rentCost=1;
    double diameter;
    
    diameter = readDouble("Enter diameter of the pizza in inches: ");
    
    double materials=0.05*Math.pow(diameter, 2);
    
    println("The cost of making the pizza is: $"+ materials + " for materials");
    println("Labor cost is: " + laborCost);
    println("Rent cost is: " + rentCost);
    
    double total=(materials + laborCost + rentCost);
    
    println("So the cost of making the pizza is: $" + total);
    
    
    
    

    
    
    
    
  }
}

    
      