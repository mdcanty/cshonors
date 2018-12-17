import acm.program.*;
import java.text.NumberFormat;

public class methodsParameters2 extends ConsoleProgram {
        public void run () {
                int hrs, payRate;
                hrs = readInt("Enter hours: ");
                payRate = readInt("Enter pay rate $: ");
                totalPay(hrs, payRate);
        }
        public void totalPay (int hrs, int payRate) {
                NumberFormat money = NumberFormat.getCurrencyInstance();
                println("Total pay: " + money.format(hrs*payRate));
        }
}
