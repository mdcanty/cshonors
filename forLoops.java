import acm.program.*;

public class forLoops extends ConsoleProgram {
  public void run () {
    
   //Program #1
    for (int x = 15; x <= 150; x = x + 15) {
 print(x + " ");
    }
    
    println();

    //Program #2
    for (int x = 50; x <= 20000; x = x + 50) {
 print(x + " ");

    }
    
    println();

    //Program #3
    String name = "micah";
    for (int x = 1; x <= 10; x++) {
 print(name + " ");

    }
    
    println();

    //Program #4
    for (int x = 10000; x <= 1000000; x = x + 10000) {
 print(x + " ");

    }
    
    println();

    //Program #5
    for (int x = 5; x <= 100; x = x + 5) {
 print(x + " ");
 
    }
    
    println();
    
    //Program #6 
    for (int x = 1000000; x >= 0; x = x - 10000) {
      print(x + " ");

    }
    
    println();

    //Program #7
    for (int x = 999; x >= 999; x = x - 2) {
 print(x + " ");

    }
    
    println();

    //Program #8 
    String school = "CarverHSES";
    for (int x = 1; x >= 3; x = x + 1){
 print(school + " ");

    }
    
    println();

    //Program #9
    int hh = readInt("How high shall I count? ");
    int inc = readInt("By what increment? ");

    for (int x = inc; x <= hh; x = x + inc) {
      print(x + " ");

    }
    
    println();

    //Program #10
    int y;
    int base = 0;
    y = readInt("How high shall I count? ");
    for (int x = 0; x <= y; x = x + 1) {
      
      base += x;
      
    }
    println("The total of all the number from 1 to " + y + " is " + base);

    
  }
}



   
