import acm.program.*;
import java.text.NumberFormat;

public class methodsParameters3 extends ConsoleProgram {
        public void run () {
                String name;
                double made, attempted;

                name = readLine("Enter Name: ");
                made = readDouble("Enter made: ");
                attempted = readDouble("Enter attempted: ");

                goalPercentage(name, made, attempted);
        }

        public void goalPercentage (String name, double made, double attempted) {
                NumberFormat percent = NumberFormat.getPercentInstance();
                println(name + " has a " + percent.format(made / attempted) + " field goal percentage.");
        }
}



