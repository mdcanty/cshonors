import acm.program.*;

public class looptext extends ConsoleProgram {
    public void run () {

 int hm = readInt("How many symbols: ");
 String sym = readLine("Enter symbol: ");

 //Loop function
 for (int x = 1; x <= hm; x++) {
     print(sym);
     println("");
 }
 
 //# 2
 int count = readInt("How high shall we count: ");
 for (int x = 1; x <= count; x++) {
   println(x + "\t" + Math.pow(x,2) + "\t" + Math.pow(x,3)+ "\t" + Math.pow(x,4) + "\t" + Math.pow(x,5));
 }
 
 //# 3
 int mod = readInt("how high shall we count: ");
   for (int x = 1; x <=mod; x++) {
   
   if ((x % 2) == 0) {
     println(x + "\tEVEN");
   }
   else if ((x % 2) == 1) {
     println(x + "\tODD");
   }
 }
 
 //# 4
 int boxes = readInt("How many boxes? ");
   for (int x = 1; x <= boxes; x++) {
     println("BOX " + x + " OF " + boxes);
   }
   
   


 
 
 
 
 

}
}


