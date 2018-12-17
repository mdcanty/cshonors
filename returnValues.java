import acm.program.*;

public class returnValues extends ConsoleProgram {
        public void run () {
                int grade = readInt("Enter a grade: ");
                println(p_f(grade));
        }

        public String p_f (int grade) {
                if (grade <= 65) {
                        return ("Fail");
                }

                else {
                        return ("Pass");
                }
        }
}

