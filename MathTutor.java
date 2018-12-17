import acm.program.*;
import acm.util.*;

public class MathTutor extends ConsoleProgram {
    public void run () { 

 RandomGenerator rg = new RandomGenerator();
 int i1 = rg.nextInt(1,10);
 int i2 = rg.nextInt(1,10);
 int o = rg.nextInt(1,4);

 if (o==1) {
     int add = readInt("What is " + i1 + " + " + i2 + " ?");
     int addsol = i1 + i2;
     if (add==addsol) {
  println("Correct! ");
     }
     else { 
  println("Incorrect. ");
     }

 }

 else if (o==2) {
     int mul = readInt("What is " + i1 + " * " + i2 + " ?");
     int mulsol = i1 * i2;
     if (mul==mulsol) {
  println("Correct! ");
     }
     else {
  println("Incorrect. ");
     }
 }
 

 else if (o==3) {
     int sub = readInt("What is " + i1 + " - " + i2 + " ?");
     int subsol = i1 - i2;
     if (sub==subsol) {
  println("Correct! ");
     }
     else {
  println("Incorrect. ");
     }
 }

 else {
     int div = readInt("What is " + i1 + " / " + i2 + " ?");
     int divsol = i1 / i2;
     if (div==divsol) {
  println("Correct! ");
     }
     else {
  println("Incorrect. ");
     }
 }


 }
    }


 

