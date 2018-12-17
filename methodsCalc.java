import acm.program.*;

public class methodsCalc extends ConsoleProgram {
        public void run () {
                String operator;
                int firstInt;
                int secondInt;
                do {
                       operator = readLine("Choose operator (+)(-)(/)(*) or (q) to Quit: ");
                       
                       if (operator.equalsIgnoreCase("Q")) {
                         println("Quit.");
                         break;   
                       }
                       
                       firstInt = readInt("Enter first integer: ");
                       secondInt = readInt("Enter second integer: ");

                       if (operator.equals("+")) {
                           println(firstInt +  " + " + secondInt + " = " + addInts(firstInt, secondInt));
                       }

                       else if (operator.equals("-")) {
                            println(firstInt +  " - " + secondInt + " = " + subtractInts(firstInt, secondInt));
                       }

                       else if (operator.equals("/")) {
                           println(firstInt +  " / " + secondInt + " = " + divideInts(firstInt, secondInt));
                       }
                       
                       else if (operator.equals("*")) {
                           println(firstInt +  " * " + secondInt + " = " + multiplyInts(firstInt, secondInt));
                       }
                       

                } while (true);
        }


        public int addInts (int firstInt, int secondInt) {
                return(firstInt + secondInt);
                //println(firstInt + " + " + secondInt + " = " + (firstInt + secondInt));
       }

        public int subtractInts (int firstInt, int secondInt) {
                
                return(firstInt - secondInt);
                //println(firstInt + " - " + secondInt + " = " + (firstInt - secondInt));
       }
        public int multiplyInts (int firstInt, int secondInt) {
                return(firstInt * secondInt);
                //println(firstInt + " * " + secondInt + " = " + (firstInt * secondInt));
       }
        public int divideInts (int firstInt, int secondInt) {
                return(firstInt / secondInt);
                //println(firstInt + " + " + secondInt + " = " + (firstInt / secondInt));
       }
}



                



                       

 
                
