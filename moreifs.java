import acm.program.*;

public class moreifs extends ConsoleProgram {
    public void run () {
 
 //Ex. 1
 int age = readInt("Enter age: ");
 int lb = readInt("Enter age in pounds: ");

 if (age < 7 || lb < 60) {
     println("Use a Seat");
 }

 else {
     println("No seat required");
 }

 //Ex. 2
 String grade = readLine("Did you (P)ass or (F)ail?");
 
 if (grade.equals("p") || grade.equals("P")) {
     println("No summer school");
 }

 else if (grade.equals("f") || grade.equals("F")) {
     println("Summer School Required");
 }

 else {
     println("Invalid number. Use either 'P/p' or 'F/f'.");
 }

 //Ex. 3
 int age2 = readInt("Enter age: ");
 int height = readInt("Enter height: ");

 if (age2 >= 16 && height >= 50){
     println("You may drive");
 }

 else {
     println("You may not drive.");
 }

 //Ex. 4
 int temp = readInt("Enter temperature: ");
 int hum = readInt("Enter humidity: ");

 if (temp < 36 && hum > 80) {
     println("It will snow");
 }

 else {
     println("No snow in the forecast");
 }

 //Ex. 5
 String state = readLine("Montgomery is the capital of what state: ");

 if (state.equals("Alabama") || state.equals("alabama")){
     println("Correct");
 }

 else {
     println("Incorrect");
 }

//Ex. 6
int seats = readInt("How many Seats: ");
String day = readLine("(S)unday, (F)ull, (W)eekday: ");

if (day.equals("W") || day.equals("w")) {
  int price = 700 * seats;
  println("Your price for " + seats + " for a Weekday package is " + "$" + price);
}

else if (day.equals("F") || day.equals("f")) {
  int price = 3300 * seats;
  println("Your price of " + seats + " for a full package is " + "$" + price);
}

else if (day.equals("S") || day.equals("s")) {
  int price = 620 * seats;
  println("Your price of " + seats + " for a full package " + "$" + price);
}

else {
  println("Invalid string name.");
}
   
 
 

 



    }
}
