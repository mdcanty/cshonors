import acm.program.*;

public class mathClass extends ConsoleProgram {
    public void run (){
 

 int firstInteger = readInt("Enter first integer: ");
 int secondInteger = readInt("Enter second integer: ");
 
 int multiplied=firstInteger*secondInteger;

 int divided=firstInteger/secondInteger;

 int subtracted=secondInteger-firstInteger;

 double exponent=Math.pow(firstInteger, secondInteger);

 int absoluteValue=Math.abs(firstInteger);
 
 double squareRoot=(Math.sqrt(firstInteger));
 
 println("");

 println(firstInteger + " * " + secondInteger +  " = " +  multiplied);
 
 println(firstInteger + " / " + secondInteger + " = " + divided);
 
 println(secondInteger + " - " + firstInteger + " = " + subtracted);
 
 println(firstInteger + " ^ " + secondInteger + " = " + exponent);
 
 println("");
 
 println("The absolute value of " + firstInteger + " is " + absoluteValue);
 
 println("The square root of " + firstInteger + " is " + squareRoot);


}
}






 


