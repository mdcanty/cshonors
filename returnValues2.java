import acm.program.*;

public class returnValues2 extends ConsoleProgram {
        public void run () {
                int input = readInt("Enter an integer: ");
                println(o_e(input));

                int half_number = readInt("Enter a number: ");
                println("Half: " + h_n(half_number));

                int cubed_grade = readInt("Enter a grade: ");
                println("Cubed: " + c_g(cubed_grade));

                String password = readLine("Enter password: ");
                println("Result: " + pw(password));

        }

        public String o_e (int input) {
                if (input % 2 == 1) {
                        return ("Odd");
                }

                else {
                        return ("Even");
                }
        }

        public int h_n (int half_number) {
                return (half_number / 2);
        }

        public int c_g (int cubed_grade) {
                return (cubed_grade * cubed_grade * cubed_grade);
        }

        public String pw (String password) {
                if (password.equals("chickenfingers")) {
                        return("Correct");
                }

                else {
                        return("Incorrect");
                }
        }


}
