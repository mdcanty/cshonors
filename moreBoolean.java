import acm.program.*;

public class moreBoolean extends ConsoleProgram {
  public void run () {
    int lb = readInt("Enter weight of the package: ");
    int l = readInt("Enter length of the package: ");
    int w = readInt("Enter width of the package: ");
    int h = readInt("Enter height of the package: ");
    
    int c = l * w * h;
    
    if (lb >= 27 && c >= 100000){
      println("Ok");
    }
    
    else if (lb != 27 && c >= 100000){
      println("Too large.");
    }
    
    else if (lb >= 27 && c != 100000){
      println("Too heavy.");
    }
    
    else {
      println("Too heavy and too large.");
    }
    
      
      
      
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}