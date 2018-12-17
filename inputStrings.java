import java.text.NumberFormat;
import acm.program.*;

public class inputStringsGoal extends ConsoleProgram {
    public void run () { 
 String name = readLine("Enter your first name: ");
 int hrs = readInt("Enter hours worked: ");
 double rate = readDouble("Enter pay rate: ");
 
 NumberFormat money = NumberFormat.getCurrencyInstance();

 double total = (hrs*rate);
 

 println(name + " worked for " + hrs + " hours and made " + money.format(rate) + " for total wages of " + money.format(total));

 
    }
}

