import acm.program.*;

public class methodsParameters extends ConsoleProgram {
        public void run () {

                int len, wid, hei;
                
                len = readInt("Enter length in feet: ");
                wid = readInt("Enter width in feet: ");
                hei = readInt("Enter height in feet: ");

                volume(len, wid, hei);

                }

        public void volume (int len, int wid, int hei) {
            println("The volume in feet is: " + (len*wid*hei));
        }
}

                
