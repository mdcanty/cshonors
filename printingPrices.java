import acm.program.*;
import java.text.NumberFormat;

public class printingPrices extends ConsoleProgram { 
    public void run() {
 int copies= readInt("Enter the number of copies to be printed: ");
 double cost;

 if (copies<=99) {
     cost=.30;
 }
 else if (copies<=499) {
     cost=.28;
 }
 else if (copies<=749) {
     cost=.27;
 }
 else if (copies<1000) {
     cost=.26;
 }
 else{
     cost=.25;
 }
 
 NumberFormat money = NumberFormat.getCurrencyInstance();

 println("Price per copy is: " + money.format(cost));
 println("Total cost is: "  + money.format(cost*copies));


}
}

