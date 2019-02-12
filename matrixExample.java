import acm.program.*;
import java.util.*;

public class matrixExample extends ConsoleProgram {
    public void run () {
        String sym;
        int rowNumber, columnNumber;

        println("Enter number rows: ");
        rowNumber = readInt();

        println("Enter number of columns: ");
        columnNumber = readInt();

        println("Enter symbol: ");
        sym = readLine();

        String mat[][] = new String[rowNumber][columnNumber];

        for (int i = 0; i < mat.length; i++) {
            Arrays.fill(mat[i], (sym));
        } 
        
        for (int row = 0; row < mat.length; row++) { 

            for (int column = 0; column < mat.length; column++) {
                print("[" + mat[row][column] + "]"); // Print symbol a certain amount of times, surrounded by brackets.
            }

            println(); // New row.


        }
    }
}



