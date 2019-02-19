import acm.program.*;
import acm.util.*;
import java.util.*;

public class secretSquare extends ConsoleProgram {
    public void run () {

        // Move a 'piece' through a matrix.
        int tries = 0;
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
        
        String sym = readLine("Enter your playing piece: ");

        matrix[rowStart][columnStart] = sym;
         
        RandomGenerator rg = new RandomGenerator();
        int randomPiece = rg.nextInt(rowNumber);
        int randomPiece2 = rg.nextInt(columnNumber);

        do {
          for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                print("[" + matrix[r][c] + "]");
            }
            println();
        }
          
          
                
            String movement = readLine("Move symbol (U)p, (D)own, (L)eft, (R)ight, or (Q)uit: ");
            if (tries < 2) {
            
            if (movement.equalsIgnoreCase("Q")) {
                println("Thanks.");
                break;
            } else if (movement.equalsIgnoreCase("R")) {
                matrix[rowStart][columnStart] = space;
                columnStart++;
                
                if (columnStart > columnNumber-1) {
                    columnStart--;
                }
                matrix[rowStart][columnStart] = sym;
                tries++;
                
                if (randomPiece == rowStart && randomPiece2 == columnStart) {
                    println("Congratulations you won!!");
                    break;
                }

            } else if (movement.equalsIgnoreCase("L")) {
                matrix[rowStart][columnStart] = space;
                columnStart--;
                if (columnStart < 0) {
                    columnStart++;
                }
                matrix[rowStart][columnStart] = sym;
                tries++;
                
                if (randomPiece == rowStart && randomPiece2 == columnStart) {
                    println("Congratulations you won!!");
                    break;
                }
            } else if (movement.equalsIgnoreCase("D")) {
                matrix[rowStart][columnStart] = space;
                rowStart++;
                if (rowStart > rowNumber-1 ) {
                    rowStart--;
                }
                  
                matrix[rowStart][columnStart] = sym;
                tries++;
                if (randomPiece == rowStart && randomPiece2 == columnStart) {
                    println("Congratulations you won!!");
                    break;
                }
 
            } else if (movement.equalsIgnoreCase("U")) {
               matrix[rowStart][columnStart] = space;
               rowStart--;
               if (rowStart < 0) {
                    rowStart++;
               } 
                matrix[rowStart][columnStart] = sym; 
                tries++;
               if (randomPiece == rowStart && randomPiece2 == columnStart) {
                   println("Congratulations you won!!");
                   break;
               }
            }
            } else {
              println("Ran out of tries.");
              break;
            }


 



        } while (true);
        
    }
}
        


           
