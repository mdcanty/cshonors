import acm.program.*;

public class arrayOne extends ConsoleProgram {
    public void run () {

        // first program.
        String studentNames [] = new String [3];

        for (int x = 0; x < studentNames.length; x++) {
            studentNames[x] = readLine("Enter name: ");
        }

        for (int y = 0; y < studentNames.length; y++) {
            println(studentNames[y]);
        }
            
        // second program.
        String studentNames2 [] = new String [3];
        int studentGrades [] = new int [3];
        
        for (int x = 0; x < studentNames2.length; x++) {
            studentNames2[x] = readLine("Enter name: ");
            studentGrades[x] = readInt("Enter grade for " + studentNames2[x] + ": ");
        }  
        
        for (int z = 0; z < studentNames2.length; z++) {
            println(studentNames2[z] + "\t" + studentGrades[z]);
            
        }
        
        // third program.
        int studentAmount = readInt("Enter number of students: ");
        String studentNames3 [] = new String [studentAmount];
        int studentGrades2 [] = new int [studentAmount];
        
        
        for (int x = 0; x < studentNames3.length; x++) {
            studentNames3[x] = readLine("Enter name: ");
            studentGrades2[x] = readInt("Enter grade for " + studentNames2[x] + ": ");
        }
        
        for (int y = 0; y < studentNames3.length; y++) {
            println(studentNames3[y] + "\t" + studentGrades2[y]);
        }



    }
    
}


