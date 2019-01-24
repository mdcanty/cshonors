import acm.program.*;
import java.text.NumberFormat;

public class array1A extends ConsoleProgram {
    public void run () {
        int howMany = readInt("How many players: ");
      
        String name[] = new String[howMany];
        double goalsMade[] = new double[howMany];
        double goalsAttempted[] = new double[howMany];
        double throwsMade[] = new double[howMany];
        double throwsAttempted[] = new double[howMany];
        
        int totalPoints;

        

        // For loop asks user information about the players. 
        for (int x = 0; x < howMany; x++) {
            name[x] = readLine("Enter player #" + (x + 1));
            
            goalsMade[x] = readDouble("Enter field goals made for "
            + name[x] + ": "); // Asks for field goals made.
            goalsAttempted[x] = readDouble("Enter field goals attempted for "
            + name[x] + ": "); // Asks for field goals attempted.
            throwsMade[x] = readDouble("Enter free throws made for "
            + name[x] + ": "); // Asks for free throws made.
            throwsAttempted[x] = readDouble("Enter free throws attempted "
            + name[x] + ": "); // Asks for free throws attempted.
        }
        
        println(
        "Name" + "\t" +
        "FGM" + "\t" +
        "FGA" + "\t" +
        "FGP" + "\t" + 
        "FTM" + "\t" + 
        "FTA" + "\t" + 
        "FTP" + "\t" +
        "Total Points"
         );
         
         
        NumberFormat percent = NumberFormat.getPercentInstance();

        // Prints results, formatted.
        for (int y = 0; y <= howMany; y++) {
            println(name[y] + "\t" 
            + goalsMade[y] + "\t" 
            + goalsAttempted[y] + "\t"
            + percent.format(goalsMade[y] / goalsAttempted[y])
            + throwsMade[y] + "\t" 
            + throwsAttempted[y] + "\t"
            + percent.format(throwsMade[y] / throwsAttempted[y]) + "\t"
            + ((goalsMade[y] * 3) + throwsMade[y]))
            ;

        }
            
    }
}
