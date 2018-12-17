import acm.program.*;
public class GameShow extends ConsoleProgram {
  public void run () {
int score = 0;

//Question 1
String a1 = readLine("Is Java a good language?");
if (a1.equalsIgnoreCase("No") || (a1.equalsIgnoreCase("Hell no"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 2
String a2 = readLine("Is Micah a god?");
if (a2.equalsIgnoreCase("Yes") || (a2.equalsIgnoreCase("No"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 3
String a3 = readLine("Is Golang obsolete");
if (a3.equalsIgnoreCase("Yes") || (a3.equalsIgnoreCase("Hell yeah"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 4
String a4 = readLine("Can Silv use spacing in his code? ");
if (a4.equalsIgnoreCase("No") || (a4.equalsIgnoreCase("Hell no"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 5
String a5 = readLine("Is Rivera the best Spanish teacher? ");
if (a5.equalsIgnoreCase("Yes") || (a5.equalsIgnoreCase("Hell yeah"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 6
String a6 = readLine("Is bash better than ksh? ");
if (a6.equalsIgnoreCase("No") || (a6.equalsIgnoreCase("Hell no"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 7
String a7 = readLine("Is CS Prin bad? ");
if (a7.equalsIgnoreCase("Yes") || (a7.equalsIgnoreCase("Hell yeah"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 8
String a8 = readLine("Why do I exist? ");
if (a8.equalsIgnoreCase("Yes") || (a8.equalsIgnoreCase("No"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 9
String a9 = readLine("Is the GPLv2 better than v3? ");
if (a9.equalsIgnoreCase("Yes") || (a9.equalsIgnoreCase("Hell yeah"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

//Question 10
String a10 = readLine("Is Elijah cheating the system? ");
if (a10.equalsIgnoreCase("Yes") || (a10.equalsIgnoreCase("Hell yeah"))) {
    score = score + 1000;
    println("Correct, you won 1000 points. You now have " + score + " points.");
}

else {
    score = score - 500;
    println("Incorrect, you lost 500 points. You now have " + score + " points.");
}

println("Your total score is: " + score );

}
}




    
