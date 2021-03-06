import acm.program.*;
import java.util.*;

public class matrixPiece extends ConsoleProgram {
    public void run () {

        // Move a 'piece' through a matrix.
        int rowNumber = readInt("Enter number of rows: ");
        int columnNumber = readInt("Enter number of columns: ");
        
        String matrix[][] = new String[rowNumber][columnNumber];
        String space = " ";

        for (int p = 0; p < matrix.length; p++) {
            Arrays.fill(matrix[p], (space));
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                print("[" + matrix[r][c] + "]");
            }
            println();
        }

        int rowStart = readInt("Enter starting row: ");
        int columnStart = readInt("Enter starting column: ");
        
        String sym = readLine("Enter symbol: ");

         matrix[rowStart][columnStart] = sym;

        
       /* for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                print("[" + matrix[r][c] + "]");
            }
            println();
        }*/
         
        
        do {
          for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                print("[" + matrix[r][c] + "]");
            }
            println();
        }
        
            String movement = readLine("Move symbol (U)p, (D)own, (L)eft, (R)ight, or (Q)uit: ");
            if (movement.equalsIgnoreCase("Q")) {
                println("Thanks.");
                break;
            } else if (movement.equalsIgnoreCase("R")) {
                matrix[rowStart][columnStart] = space;
                columnStart ++;
                if (columnStart < columnNumber) {
                    columnStart--;
                }
                matrix[rowStart][columnStart] = sym;

            } else if (movement.equalsIgnoreCase("L")) {
                matrix[rowStart][columnStart] = space;
                columnStart --;
                if (columnStart < 0) {
                    columnStart++;
                }
                matrix[rowStart][columnStart] = sym;
            } else if (movement.equalsIgnoreCase("D")) {
                matrix[rowStart][columnStart] = space;
                rowStart ++;
                if (rowStart < rowNumber ) {
                    rowStart--;
                }
                  
                matrix[rowStart][columnStart] = sym;
 
            } else if (movement.equalsIgnoreCase("U")) {
               matrix[rowStart][columnStart] = space;
               rowStart--;
               if (rowStart < 0) {
                    rowStart++;
               } 
                matrix[rowStart][columnStart] = sym;  
            }



        } while (true);
        
    }
}
        


           
