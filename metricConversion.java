import acm.program.*;

public class metricConversion extends ConsoleProgram {
        public void run () {
                double num = readDouble("Enter a number: ");
                int choice;
                
                                
                do {
                choiceDisplay();
                choice = readInt("Enter your choice: ");

                if (choice == 1) {
                        in_c(num);
                }

                else if (choice == 2) {
                        f_c(num);
                }

                else if (choice == 3) {
                        y_m(num);
                }

                else if (choice == 4) {
                        m_k(num);
                }

                else if (choice == 5) {
                        c_in(num);
                }

                else if (choice == 6) {
                        c_f(num);
                }

                else if (choice == 7) {
                        m_y(num);
                }

                else if (choice == 8) {
                        k_m(num);
                }

                else {
                        break;
                }

        } while(true);
        }

        // Displays the choice prompt.  
        public void choiceDisplay () {
                println("Convert: ");
                println("1. Inches to centimeters\t 5. Centimeters to inches");
                println("2. Feet to centimeters\t 6. Centimeters to feet");
                println("3. Yards to meters              7. Meters to yards");
                println("4. Miles to kilometers\t 8. Kilometers to miles");
                println();
        }

        // Inches and centimeters 
        public void in_c (double num) {
                println(num + " inches equals " + (num * 2.54) + " centimeters.");
        }

        public void c_in (double num) {
                println(num + "centimeters equals " + (num / 2.54) + " inches.");
        }

        // Feet and centimeters
        public void f_c (double num) {
                println(num + " feet equals " + (num * 30) + " centimeters.");
        }

        public void c_f (double num) {
                println(num + " centimeters equals " + (num / 30) + " feet.");
        }

        // Yards and meters
        public void y_m (double num) {
                println(num + " yards equals " + (num * 0.91) + " meters.");
        }

        public void m_y (double num) {
                println(num + " meters equals " + (num / 0.91) + " meters.");
        }

        // Miles and kilometers
        public void m_k (double num) {
                println(num + " miles equals " + (num * 1.6) + " kilometers.");
        }

        public void k_m (double num) {
                println(num + " kilometers equals " + (num / 1.6) + " kilometers.");
        }
        }




                


                
