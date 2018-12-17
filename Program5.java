import acm.program.*;

public class Program5 extends ConsoleProgram{
  public void run (){
    
    println("Enter your birthdate: ");
    
    int birthYear = readInt("Year: ");
    int birthMonth = readInt("Month: ");
    int birthDay = readInt("Day: ");
    
    println("Enter today's date: ");
    
    int currentYear = readInt("Year: ");
    int currentMonth = readInt("Month: ");
    int currentDay = readInt("Day: ");
    
    int yearNumber = (currentYear - birthYear)*365;
    int monthNumber = (currentMonth - birthMonth)*30;
    int dayNumber = (currentDay - birthDay);
    
    int total = (yearNumber + monthNumber + dayNumber);
    
    println("You have been alive for " + total + "days. ");
    println("That's " + total*8 + " hours. ");


    
    
    
    

    
    
    
    
  }
}

    
      