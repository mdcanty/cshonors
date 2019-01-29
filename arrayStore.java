import acm.program.*;
import java.text.NumberFormat;

public class arrayStore extends ConsoleProgram {
    public void run () {
        int howmanyItems = readInt("How many different items?: ");
        double percentMarkup = readDouble("Enter % markup: ") * .01;

        String itemType [] = new String[howmanyItems];
        double itemCost [] = new double[howmanyItems];
        double itemQuantity [] = new double[howmanyItems];

        for (int x = 0; x < howmanyItems; x++) {
            itemType[x] = readLine("Enter item " + (x + 1) + ": ");
            itemCost[x] = readDouble("Enter cost paid in US$ for " + itemType[x] + ": ");
            itemQuantity[x] = readDouble("How many " + itemType[x] + ": ");
        }
        
        println(
        "Name \t" +
        "Amount \t" +
        "CPU \t" +
        "CFA \t" +
        "SPU \t" +
        "SFA \t" +
        "Total Profit");
        
         
        for (int y = 0; y < howmanyItems; y++) {   
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        String name = itemType[y];
        double amount = itemQuantity[y];
        double cpu = itemCost[y];
        double cfa = itemCost[y] * itemQuantity[y];
        double spu = ((itemCost[y] * percentMarkup) + itemCost[y]);
        double sfa = spu * itemQuantity[y];
        double totalProfit = sfa - cfa;
          
            println(name +
            "\t" + money.format(amount) + 
            "\t" + money.format(cpu) + 
            "\t" + money.format(cfa) +
            "\t" + money.format(spu) +
            "\t" + money.format(sfa) +
            "\t" + money.format(totalProfit)
             );
        
    }
}
}



