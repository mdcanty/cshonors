import acm.program.*;

public class carModel extends ConsoleProgram {
  public void run () {
    int n = readInt("Enter the car's model number: ");
    if (n == 119 || n == 179 || n >= 189 && n <= 195 || n == 221 || n == 780){
     println("Your car is defective. It must be reported.");
    }
    else {
      println("Your car is fine");
    }
  }
}


