import acm.program.*;

public class Program1 extends ConsoleProgram{
  public void run (){
    int numKids;
    int numAdults;
    double kidPrice=5.5;
    double adultPrice=12.75;
    
    println("Hello World!");
    
    println("Welcome to Movie Madness");
    numKids = readInt("Enter # kids: ");
    numAdults = readInt("# adults: ");
    
    double totalPrice=(numKids*kidPrice)+(numAdults*adultPrice);
    
    print("Total price for ");
    print(numKids+ " kids ");
    print("and" + numAdults+ " adults ");
    println(" is "+ totalPrice);
    
  }
}

    
      