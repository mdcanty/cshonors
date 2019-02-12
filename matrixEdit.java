import acm.program.*;
import java.util.*;

// Random matrix program. 
public class matrixEdit extends ConsoleProgram {
    public void run () {

        int rowNumber = readInt("Enter number of rows: ");
        int columnNumber = readInt("Enter number of columns: ");
        String sym = readLine("Enter symbol to fill");
        
        String mat[][] = new String[rowNumber][columnNumber];
        
        for (int i = 0; i < mat.length; i++) {
            Arrays.fill(mat[i], (sym));
        } 
        
        for (int row = 0; row < mat.length; row++) {   
            for (int column = 0; column < mat.length; column++) {
                print("[" + mat[row][column] + "]");  
            }
            println(); // New row.
        }
    

    do {

        String answer = readLine("Do you want to start up the rotors? ");
        if (answer.equalsIgnoreCase("N")) {
          println("Thanks.");
          break;
        }

        else {
            int editedRow = readInt("Enter rotor 1: ");
            int editedColumn = readInt("Enter roto2: ");

            String numPrint = readLine("Enter Leftists: ");
            mat[editedRow][editedColumn] = numPrint;
        }
            for (int r = 0; r < mat.length; r++) {

                for (int c = 0; c < mat.length; c++) {
                    print("[" + mat[r][c] + "]");
                }

                println();

                }
   } while (true);
   }

}
            



