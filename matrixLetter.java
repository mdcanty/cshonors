import acm.program.*;
import acm.util.*;
import java.util.*;

public class matrixLetter extends ConsoleProgram {
    public void run () {
        String matrix[][] = new String[5][5];
        String sym = "*";
        int pick = 0;
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], (sym));
        } 
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                print("[" + matrix[row][column] + "]");
            }
            println();
        }

        do {
            int letterA = 0, letterB = 0, letterC = 0, letterD = 0, letterE = 0;
            pick++;

            RandomGenerator rg = new RandomGenerator();
            int num = rg.nextInt(1, 5);
            String let;

            if (num == 1) {
                 let = "A";
            } else if (num == 2) {
                let = "B";   
            } else if (num == 3) {
                let = "C";    
            } else if (num == 4) {
                let = "D";    
            } else {
                let = "E";   
            }
            
            println("Pick #" + pick);
            int rowPick = readInt("Enter the row: ");
            if (rowPick > 4) {
                println("Invalid number. ");
                break;
            }

            int columnPick = readInt("Enter the column: ");
            if (columnPick > 4) {
                println("Invalid number. ");
                break;
            }
            
            matrix[rowPick][columnPick] = let;
            
            if (let.equalsIgnoreCase("A")) {
                letterA++;
            } else if (let.equalsIgnoreCase("B")) {
                letterB++;
            } else if (let.equalsIgnoreCase("C")) {
                letterC++;
            } else if (let.equalsIgnoreCase("D")) {
                letterD++;
            } else {
                letterE++;
            }
                
            for (int r = 0; r < matrix.length; r++) {
                for (int co = 0; co < matrix.length; co++) {
                    print("[" + matrix[r][co] + "]");
                }
                println();
            }
            
            if (letterA == 3 || letterB == 3 || letterC == 3 || letterD == 3 || letterE == 3) {
                println("You win!");
                break;
            }
            println("You failed.");
            
        } while (pick < 5);
    }
}
