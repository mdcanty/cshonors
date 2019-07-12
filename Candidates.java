import java.text.NumberFormat;
import acm.program.*;

public class Candidates extends ConsoleProgram {
    public void run (){
    	NumberFormat percent = NumberFormat.getPercentInstance();
	
	double AwbreyNY = 314159;
	double AwbreyNJ = 89008;
	double AwbreyCT = 213451;

	double MartNY = 271860;
	double MartNJ = 121032;
	double MartCT = 231034;

	println("Awbrey 	" + (AwbreyNY+AwbreyNJ+AwbreyCT) + "	" + percent.format(AwbreyNY+AwbreyNJ+AwbreyCT/100));
	println("Martinez	" + (MartNY+MartNJ+MartCT) + "	" + percent.format(MartNY+MartNJ+MartCT/100));
	println("TOTAL VOTES:	" + (AwbreyNY+AwbreyNJ+AwbreyCT+MartNY+MartNJ+MartCT/100));
    }
}




