import acm.program.*;
import java.text.NumberFormat;

public class inputCar extends ConsoleProgram {
    public void run () {

 String f = readLine("Enter first name: ");
 String l = readLine("Enter last name: ");
 String mk = readLine("Enter car make: ");
 String mdl = readLine("Enter car model: ");
 double c =  readDouble("Enter cost of car: ");
 double i = readDouble("Enter annual cost of insurance: ");
 double g =  readDouble("Enter gallons of has used per week: ");
 double gg =  readDouble("Enter current cost of gas per gallon: ");

 double t = (c+i+(g*gg));

 NumberFormat money = NumberFormat.getCurrencyInstance();

 println("Hi " + f + " " +  l + ", here is the breakdown for your automobile costs: ");
 
 println(mk + " " + mdl + " cost: " + money.format(c));
 println("Monthly payments: " + money.format(c / 60));

 println("Annual insurance: " + money.format(i));
 println("Monthly payments: " + money.format(i/12));

 println("Monthly gas at " + money.format(g) + " per week and current gas price at " + money.format(gg) + ": " + money.format((g*gg)*4));
    }
}










