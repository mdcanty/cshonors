import acm.program.*;
import acm.util.*;
import java.util.*;

// Random matrix program. 
public class matrixRandom extends ConsoleProgram {
    public void run () {

        int rowNumber = readInt("Enter number of rows: ");
        int columnNumber = readInt("Enter number of columns: ");
        int rangeStart = readInt("Enter beginning of random range: ");
        int rangeEnd = readInt("Enter end of random range: ");

        /*for (int i = 0; i < mat.length; i++) { 
            int mat[][] = new int[rowNumber][columnNumber];
            RandomGenerator rg = new RandomGenerator();
            int sym = rg.nextInt(rangeStart, rangeEnd);
            Arrays.fill(mat[i], (sym));
         } */
        
        int mat[][] = new int[rowNumber][columnNumber];
        
        for (int row = 0; row < mat.length; row++) { 
            
            for (int column = 0; column < mat.length; column++) {
                RandomGenerator rg = new RandomGenerator();
                mat[row][column] = rg.nextInt(rangeStart, rangeEnd);
                print("[" + mat[row][column] + "]"); // Print symbol a certain amount of times, surrounded by brackets.
            }

            println(); // New row.


        }
    }
}



