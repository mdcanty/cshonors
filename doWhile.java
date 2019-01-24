import acm.program.*;
import acm.util.*;
import java.text.NumberFormat;

public class doWhile extends ConsoleProgram {
    public void run () {
        double heads = 0, tails = 0; 
 
 
 String flip;
 do {
     flip = readLine("Flip coin (H or T or Q to Quit): ");
     if (flip.equalsIgnoreCase("Q")) {
  break;
     }

     else if (flip.equalsIgnoreCase("H")) {
  heads++;
     }

     else if (flip.equalsIgnoreCase("T")) {
  tails++;
     }

     else {
  println("Invalid. Response is not accepted");
     }





 } while(true);

        NumberFormat percent = NumberFormat.getPercentInstance();
  int ih = (int)heads;
  int it = (int)tails;

 println(ih + " heads, or " +  percent.format(heads/(heads + tails)));
 println(it + " tails. or " + percent.format(tails/(heads + tails)));
 
 /*-------------------------------------------------------------------*/
 
 
 double bl;
 String act;
 bl = readDouble("Enter starting balance $: ");
 do {
     
     act = readLine("Your balance is now " + bl + ", (D) Deposit, (W) Withdrawal, or (Q) Quit: ");
     if (act.equalsIgnoreCase("Q")) {
         break;
         
     }
     
     else if (act.equalsIgnoreCase("D")) {
         double deposit = readDouble("How much is your deposit: ");
         bl = (deposit + bl);
         act = ("Your balance is now " + bl + ", (D) Deposit, (W) Withdrawal, or (Q) Quit: ");
     }
     
     else if (act.equalsIgnoreCase("W")) {
         double withdrawal = readDouble("How much is your withdrawal: ");
         bl = (withdrawal + bl);
         act = ("Your balance is now " + bl + ", (D) Deposit, (W) Withdrawal, or (Q) Quit: ");
     }
 } while(true);
  println("Thank you for banking at the JAVA teller!");
 
     
     
 
     
     
     
     
       
     
     
     
     
     









    }
    }

