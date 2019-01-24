import acm.program.*;

public class array4 extends ConsoleProgram {
    public void run () {
        int howMany = readInt("How many students?: ");

        String name[] = new String[howMany];
        
        double mathGrade[] = new double[howMany];
        double englishGrade[] = new double[howMany];
        double computerGrade[] = new double[howMany];

        String mathLetter[] = new String[howMany];
        String englishLetter[] = new String[howMany];
        String computerLetter[] = new String[howMany];
              
        // for loop asks user grades.
        for (int x = 0; x <= howMany; x++) {
            name[x] = readLine("Enter name for student" + (x + 1) + ": ");
            
            mathGrade[x] = readDouble("Enter field goals made for "
            + name[x] + ": "); //Asks for math grade.

            englishGrade[x] = readDouble("Enter field goals made for "
            + name[x] + ": "); //Asks for english grade.

            computerGrade[x] = readDouble("Enter field goals made for "
            + name[x] + ": "); //Asks for computer grade.
        }

        println(
        "Name" + "\t" +
        "Math" + "\t" +
        "English" + "\t" +
        "Computer Science" + "\t" );


        for (int y = 0; y <= howMany; y++) {
            if (mathGrade[y] >= 90) {
                String (mathLetter[y]) = "A";
            }

            else if (mathGrade[y] >= 80) {
                String (mathLetter[y]) = "B";
            }

            else if (mathGrade[y] >= 70) {
                String (mathLetter[y]) = "C";
            }

            else if (mathGrade[x] >= 60) {
                String (mathLetter[y]) = "D";
            }

            else {
                String (mathLetter[y]) = "F";
            }

            println(mathLetter[y]);
        }
    }
}

        


        


            



