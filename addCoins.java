import acm.program.*;

public class addCoins extends ConsoleProgram {
    public void run () {
        double pennies; 
        double nickels; 
        double dimes; 
        double quarters;
        double total;
        
        
        

        println("Enter your total coins: ");
        println();

        quarters = readInt("Quarters: ");
        dimes = readInt("Dimes: ");
        nickels = readInt("Nickels: ");
        pennies = readInt("Pennies: ");

        println();
        println("$" + getDollarAmount(pennies, nickels, dimes, quarters));  

        
        }

    public double getDollarAmount(double pennies, double nickels, double dimes, double quarters) {
        nickels = nickels * .05;
        dimes = dimes * .10;
        quarters = quarters * .25;
        pennies = pennies * .01;

        double total = (pennies + nickels + dimes + quarters);

        return (total);
        
    }
}



