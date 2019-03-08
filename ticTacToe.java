import acm.program.*;
import acm.util.*;
import java.util.*;

public class ticTacToe extends ConsoleProgram {
    public void run () {
        String matrix[][] = new String[3][3];
        // String space = " ";
        int pick = 0;
        String lastMove = " ";
        int rowPick;
        int columnPick;


        for (int grid = 0; grid < matrix.length; grid++) {
            Arrays.fill(matrix[grid], (lastMove));
        }
        

        do {
            pick++;
            
            if (lastMove.equals("X") || lastMove.equals(" ")) {
                lastMove = "O";
            } else {
                lastMove = "X";
            }
            
            
            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < matrix.length; y++) {
                    print("[" + matrix[x][y] + "]");
                }
                println();
            }

            rowPick = readInt("Pick #" + pick + "\nEnter row number" + " (" + lastMove + "): ");
            columnPick = readInt("Enter the column" + " (" + lastMove + "): "); 
            
            while (matrix[rowPick][columnPick] != " ") {
                println("Choose a different position!");
                rowPick = readInt("Pick #" + pick + "\nEnter row number" + " (" + lastMove + "): ");
                columnPick = readInt("Enter the column" + " (" + lastMove + "): ");
            }
            
           while (rowPick  >= 3 || columnPick >= 3) {
                println("Choose a different position!");
                rowPick = readInt("Pick #" + pick + "\nEnter row number" + " (" + lastMove + "): ");
                columnPick = readInt("Enter the column" + " (" + lastMove + "): ");
                pick++;
                
            }

            matrix[rowPick][columnPick] = lastMove;
            // pick++;

            
           /* for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < matrix.length; y++) {
                    print("[" + matrix[x][y] + "]");
                }
                println();
            } */
                       
           /* rowPick = readInt("Pick #" + pick + "\nEnter row number" + "(" + lastMove + "): ");
            columnPick = readInt("Enter column number" + "(" + lastMove + "): "); */

           /* matrix[rowPick][columnPick] = lastMove;
            pick++; */
            
            if (matrix[0][0].equals(lastMove) && matrix[0][1].equals(lastMove) && matrix[0][2].equals(lastMove)) {
                println(lastMove + " wins!");
                break;
            } else if (matrix[1][0].equals(lastMove) && matrix[1][1].equals(lastMove) && matrix[1][2].equals(lastMove)) {
                println(lastMove + " wins!");
                break;
            } else if (matrix[2][0].equals(lastMove) && matrix[2][1].equals(lastMove) && matrix[2][2].equals(lastMove)) {
                println(lastMove + " wins!");
                break;
            } else if (matrix[0][0].equals(lastMove) && matrix[1][0].equals(lastMove) && matrix[2][0].equals(lastMove)) {
                println(lastMove + " wins!");
                break;
            } else if (matrix[0][1].equals(lastMove) && matrix[1][1].equals(lastMove) && matrix[2][1].equals(lastMove)) {
                println(lastMove + " wins!");
                break;
            } else if (matrix[0][2].equals(lastMove) && matrix[1][2].equals(lastMove) && matrix[2][2].equals(lastMove)) {
                println(lastMove + " wins!");
                break;
            }
            
                
            
            


        } while (pick < 9);
        
        if (pick >= 9) {
            println("You tied.");
        }
            
        
    }
}

       
