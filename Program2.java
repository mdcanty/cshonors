import java.text.NumberFormat;
import acm.program.*;

public class Program2 extends ConsoleProgram{
  public void run (){
    int burgers;
    int fries;
    int sodas;
    int tendered;
    double burgerPrice=1.69;
    double friesPrice=1.09;
    double sodasPrice=0.99;
      
    println("Welcome to Good Burger");
    burgers = readInt("burgers: ");
    fries = readInt("fries: ");
    sodas = readInt("sodas: ");
    
    NumberFormat percent = NumberFormat.getPercentInstance();
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    double beforePrice=(burgers*burgerPrice)+(fries*friesPrice)+(sodas*sodasPrice);
    double tax=(beforePrice*.065);
    double totalPrice=((beforePrice)+(tax)); 
    
    println("Tax: "+ money.format(tax));
    println("before tax: " + money.format(beforePrice));
    println("total: " + money.format(totalPrice));
    
    tendered = readInt("enter amount tendered: ");
    double change = (tendered - totalPrice);
    
    println("change: " + money.format(change));
    
    
  }
}

    
      
