import acm.program.*;

public class methodsParameters4 extends ConsoleProgram {
        public void run () {
                String sym;
                int hm;

                sym = readLine("Enter symbol: ");
                hm = readInt("Enter how many: ");

                drawspot(sym, hm);
        }

        public void drawspot (String sym, int hm) {
                for (int x = 1; x <= hm; x++) {
                        print(sym);
                }
        }
}


                
                
