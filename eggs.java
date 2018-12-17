import acm.program.*;

  public class eggs extends ConsoleProgram  {
  public void run (){
    
    int e=readInt("Enter # of eggs purchased:  ");
    double c; 
    int doz=e/12;

    if(doz<4){
      c=0.50;   
    }
     
    else if(doz<6){
    c=0.45;   
    }
    else if(doz<11){
    c=0.40;   
    }

    else{
    c=0.35; 
    }
    
    println("The total bill is: "+ ((c/12)*e));
      
  }
  }
  