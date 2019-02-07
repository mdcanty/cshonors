import acm.program.*;
import java.text.NumberFormat;

public class beverageStore extends ConsoleProgram {
    public void run () {
        int howMany = readInt("How many orders: ");

        println("Welcome to Micah's coffee database.");

        String customerName [] = new String[howMany];
        String beverageName [] = new String[howMany]; 
        String sugarName [] = new String[howMany];
        String sizeName [] = new String[howMany];
        int ice [] = new int[howMany];

        double price [] = new double[howMany];

        // Initial questions.
        for (int x = 0; x < howMany; x++) {
            customerName[x] = readLine("Please enter customer's name: ");
            println();

            // Asks for type of beverage.
            println("What kind of beverage would you like?");
            println();
            println("Your options are: ");
            println();
            println("Coca-Cola: \tSmall - $1.00, \tMedium $1.25, \tLarge $1.50 \t(CC)");
            println("Dasani Water: \tSmall - $1.00, \tMedium $1.25, \tLarge $1.50 \t(DW)");
            println("Fanta Orange: \tSmall - $1.50, \tMedium $1.75, \tLarge $2.00 \t(FO)");
            println("Lemonade: \t\tSmall - $1.50, \tMedium - $2.00, \tLarge - $2.15 \t(MM)");
            println("Mountain Dew: \tSmall - $2.00, \tMedium - $2.50, \tLarge - $2.75 \t(MD)");
            println();

            beverageName[x] = readLine("Enter code for your choice of drink: ");
            
            // If you type an invalid string.
            if ((beverageName[x].equalsIgnoreCase("CC"))) {
                println("You ordered a Coke.");
                println();
                beverageName[x] = "Coca-Cola";
                sizeName[x] = readLine("Small ($1.00), Medium ($1.25), Large ($1.50) ");
                if (sizeName[x].equalsIgnoreCase("S")) {
                    println("You ordered a small cup.");
                    sizeName[x] = "Small";
                    price[x] += 1.00;
                } else if (sizeName[x].equalsIgnoreCase("M")) {
                    println("You ordered a medium cup.");
                    sizeName[x] = "Medium";
                    price[x] += 1.25;
                } else if (sizeName[x].equalsIgnoreCase("L")) {
                    println("You ordered a large cup.");
                    sizeName[x] = "Large";
                    price[x] += 1.50;
                } else {
                    println("Invalid string. You get a small Coke.");
                    sizeName[x] = "Small";
                    price[x] += 1.00;
                }
            } else if (beverageName[x].equalsIgnoreCase("DW")) {
                println("You ordered Dasani Water.");
                println();
                beverageName[x] = "Dasani";
                sizeName[x] = readLine("Small ($1.00), Medium ($1.25), Large ($1.50) ");
                if (sizeName[x].equalsIgnoreCase("S")) {
                    println("You ordered a small cup.");
                    sizeName[x] = "Small";
                    price[x] += 1.00;
                } else if (sizeName[x].equalsIgnoreCase("M")) {
                    println("You ordered a medium cup.");
                    sizeName[x] = "Medium";
                    price[x] += 1.25;
                } else if (sizeName[x].equalsIgnoreCase("L")) {
                    println("You ordered a large cup.");
                    sizeName[x] = "Large";
                    price[x] += 1.50;
                } else {
                    println("Invalid string. You get a small Coke.");
                    sizeName[x] = "Small";
                    price[x] += 1.00;
                }
            } else if (beverageName[x].equalsIgnoreCase("FO")) {
                println("You ordered Fanta Orange.");
                println();
                beverageName[x] = "Fanta";
                sizeName[x] = readLine("Small ($1.00), Medium ($1.75), Large ($2.00) ");
                if (sizeName[x].equalsIgnoreCase("S")) {
                    println("You ordered a small cup.");
                    sizeName[x] = "Small";
                    price[x] += 1.50;
                } else if (sizeName[x].equalsIgnoreCase("M")) {
                    println("You ordered a medium cup.");
                    sizeName[x] = "Medium";
                    price[x] += 1.75;
                } else if (sizeName[x].equalsIgnoreCase("L")) {
                    println("You ordered a large cup.");
                    sizeName[x] = "Large";
                    price[x] += 2.00;
                } else {
                    println("Invalid string. You get a small Coke.");
                    sizeName[x] = "Small";
                    price[x] += 1.50;
                }
            } else if (beverageName[x].equalsIgnoreCase("MM")) {
                println("You ordered lemonade.");
                println();
                beverageName[x] = "Lemonade";
                sizeName[x] = readLine("Small ($1.50), Medium ($2.00), Large ($2.15) ");
                if (sizeName[x].equalsIgnoreCase("S")) {
                    println("You ordered a small cup.");
                    sizeName[x] = "Small";
                    price[x] += 1.50;
                } else if (sizeName[x].equalsIgnoreCase("M")) {
                    println("You ordered a medium cup.");
                    sizeName[x] = "Medium";
                    price[x] += 2.00;
                } else if (sizeName[x].equalsIgnoreCase("L")) {
                    println("You ordered a large cup.");
                    sizeName[x] = "Large";
                    price[x] += 2.00;
                } else {
                    println("Invalid string. You get a small Coke.");
                    sizeName[x] = "Small";
                    price[x] += 2.15;
                }
            } else if (beverageName[x].equalsIgnoreCase("MD")) {
                println("You ordered Mountain Dew.");
                println();
                beverageName[x] = "Dew";
                sizeName[x] = readLine("Small ($1.50), Medium ($2.00), Large ($2.15) ");
                if (sizeName[x].equalsIgnoreCase("S")) {
                    println("You ordered a small cup.");
                    sizeName[x] = "Small";
                    price[x] += 1.50;
                } else if (sizeName[x].equalsIgnoreCase("M")) {
                    println("You ordered a medium cup.");
                    sizeName[x] = "Medium";
                    price[x] += 2.00;
                } else if (sizeName[x].equalsIgnoreCase("L")) {
                    println("You ordered a large cup.");
                    sizeName[x] = "Large";
                    price[x] += 2.00;
                } else {
                    println("Invalid string. You get a small Coke.");
                    sizeName[x] = "Small";
                    price[x] += 2.15;
                } 
            } else {
                println("Incorrect string. You get a small Dasani Water.");
                println();
                beverageName[x] = "Dasani";
                sizeName[x] = "Small";
                price[x] += 1.00;
            }

            sugarName[x] = readLine("How much sugar? ");
            ice[x] = readInt("How much ice? ");
           
           

        } do {
            String displayChoice = readLine("Display (A)ll Records, (O)ne Record, (S)earch Records, (E)dit Records, (Q)uit: ");
            /*while (!displayChoice.equalsIgnoreCase("Q") && 
            !displayChoice.equalsIgnoreCase("E") && 
            !displayChoice.equalsIgnoreCase("S") && 
            !displayChoice.equalsIgnoreCase("O") &&
            !displayChoice.equalsIgnoreCase("A")) {
            }*/ if (displayChoice.equalsIgnoreCase("Q")) {
                break;
            } else if (displayChoice.equalsIgnoreCase("E")) { // Edit function.
                for (int z = 0; z < howMany; z++) {
                    println((z + 1) + "\t" + customerName[z]);
                }

                int numChoice = readInt("Enter (number) choice to edit: ");
                numChoice--;
                String editChoice = readLine("Edit (N)ame or (B)everage? ");
                if (editChoice.equalsIgnoreCase("N")) {
                    customerName[numChoice] = readLine("Please enter new customer's name: ");
                } if (editChoice.equalsIgnoreCase("B")) {
                    println("What kind of beverage would you like? ");
                    println();
                    println("Your options are: ");
                    println();
                    println("Coca-Cola: \tSmall - $1.00, \tMedium $1.25, \tLarge $1.50 \t(CC)");
                    println("Dasani Water: \tSmall - $1.00, \tMedium $1.25, \tLarge $1.50 \t(DW)");
                    println("Fanta Orange: \tSmall - $1.50, \tMedium $1.75, \tLarge $2.00 \t(FO)");
                    println("Lemonade: \t\tSmall - $1.50, \tMedium - $2.00, \tLarge - $2.15 \t(MM)");
                    println("Mountain Dew: \tSmall - $2.00, \tMedium - $2.50, \tLarge - $2.75 \t(MD)");
                    println();
                    beverageName[numChoice] = readLine("Please choose beverage: ");
                    if (beverageName[numChoice].equalsIgnoreCase("CC")) {
                        println("You ordered a Coke.");
                        println();
                        beverageName[numChoice] = "Coca-Cola";
                        sizeName[numChoice] = readLine("Small ($1.00), Medium ($1.25), Large ($1.50) ");
                        if (sizeName[numChoice].equalsIgnoreCase("S")) {
                            println("You ordered a small cup.");
                            sizeName[numChoice] = "Small";
                            price[numChoice] += 1.00;
                        } else if (sizeName[numChoice].equalsIgnoreCase("M")) {
                            println("You ordered a medium cup.");
                            sizeName[numChoice] = "Medium";
                            price[numChoice] += 1.25;
                        } else if (sizeName[numChoice].equalsIgnoreCase("L")) {
                            println("You ordered a large cup.");
                            sizeName[numChoice] = "Large";
                            price[numChoice] += 1.50;
                        } else {
                            println("Invalid string. You get a small Coke.");
                            sizeName[numChoice] = "Small";
                            price[numChoice] += 1.00;
                        }
                    } else if (beverageName[numChoice].equalsIgnoreCase("DW")) {
                        println("You ordered Dasani Water.");
                        println();
                        beverageName[numChoice] = "Dasani";
                        sizeName[numChoice] = readLine("Small ($1.00), Medium ($1.25), Large ($1.50) ");
                    if (sizeName[numChoice].equalsIgnoreCase("S")) {
                        println("You ordered a small cup.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 1.00;
                    } else if (sizeName[numChoice].equalsIgnoreCase("M")) {
                        println("You ordered a medium cup.");
                        sizeName[numChoice] = "Medium";
                        price[numChoice] += 1.25;
                    } else if (sizeName[numChoice].equalsIgnoreCase("L")) {
                        println("You ordered a large cup.");
                        sizeName[numChoice] = "Large";
                        price[numChoice] += 1.50;
                    } else {
                        println("Invalid string. You get a small Coke.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 1.00;
                    }
                } else if (beverageName[numChoice].equalsIgnoreCase("FO")) {
                    println("You ordered Fanta Orange.");
                    println();
                    beverageName[numChoice] = "Fanta";
                    sizeName[numChoice] = readLine("Small ($1.00), Medium ($1.75), Large ($2.00) ");
                    if (sizeName[numChoice].equalsIgnoreCase("S")) {
                        println("You ordered a small cup.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 1.50;
                    } else if (sizeName[numChoice].equalsIgnoreCase("M")) {
                        println("You ordered a medium cup.");
                        sizeName[numChoice] = "Medium";
                        price[numChoice] += 1.75;
                    } else if (sizeName[numChoice].equalsIgnoreCase("L")) {
                        println("You ordered a large cup.");
                        sizeName[numChoice] = "Large";
                        price[numChoice] += 2.00;
                    } else {
                        println("Invalid string. You get a small Coke.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 1.50;
                }
                } else if (beverageName[numChoice].equalsIgnoreCase("MM")) {
                    println("You ordered lemonade.");
                    println();
                    beverageName[numChoice] = "Lemonade";
                    sizeName[numChoice] = readLine("Small ($1.50), Medium ($2.00), Large ($2.15) ");
                    if (sizeName[numChoice].equalsIgnoreCase("S")) {
                        println("You ordered a small cup.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 1.50;
                    } else if (sizeName[numChoice].equalsIgnoreCase("M")) {
                        println("You ordered a medium cup.");
                        sizeName[numChoice] = "Medium";
                        price[numChoice] += 2.00;
                    } else if (sizeName[numChoice].equalsIgnoreCase("L")) {
                        println("You ordered a large cup.");
                        sizeName[numChoice] = "Large";
                        price[numChoice] += 2.00;
                    } else {
                        println("Invalid string. You get a small Coke.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 2.15;
                    }
                } else if (beverageName[numChoice].equalsIgnoreCase("MD")) {
                    println("You ordered Mountain Dew.");
                    println();
                    beverageName[numChoice] = "Dew";
                    sizeName[numChoice] = readLine("Small ($1.50), Medium ($2.00), Large ($2.15) ");
                    if (sizeName[numChoice].equalsIgnoreCase("S")) {
                        println("You ordered a small cup.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 1.50;
                    } else if (sizeName[numChoice].equalsIgnoreCase("M")) {
                        println("You ordered a medium cup.");
                        sizeName[numChoice] = "Medium";
                        price[numChoice] += 2.00;
                    } else if (sizeName[numChoice].equalsIgnoreCase("L")) {
                        println("You ordered a large cup.");
                        sizeName[numChoice] = "Large";
                        price[numChoice] += 2.00;
                    } else {
                        println("Invalid string. You get a small Coke.");
                        sizeName[numChoice] = "Small";
                        price[numChoice] += 2.15;
                    } 
                } else {
                    println("Incorrect string. You get a small Dasani Water.");
                    println();
                    beverageName[numChoice] = "Dasani";
                    sizeName[numChoice] = "Small";
                    price[numChoice] += 1.00;
            }
                }
            }

                                                                                                                                                                       

                
            else if (displayChoice.equalsIgnoreCase("S")) { // search function
                String nameChoice = readLine("Enter name to search for: ");
                println("Number\t\t" + "Name\t\t" + "Beverage\t\t" + "Sugar\t\t" + "Size\t\t" + "Ice");
                for (int y = 0; y < howMany; y++) {
                    if (nameChoice.equals(customerName[y])) {
                        println((y + 1) + "\t\t" +
                        customerName[y] + "\t\t" +
                        beverageName[y] + "\t" +
                        sugarName[y] + "\t\t" +
                        sizeName[y] + "\t\t" +
                        ice[y]);
                    }
                }
            } else if (displayChoice.equalsIgnoreCase("O")) { // display one
                for (int z = 0; z < howMany; z++) {
                    println((z + 1) + "\t" + customerName[z]);
                }
                
                NumberFormat money = NumberFormat.getCurrencyInstance();

                int numChoice = readInt("Enter (number) choice: ");
                numChoice--;
                
                println("Number\t\t" + "Name\t\t" + "Beverage\t\t" + "Sugar\t\t" + "Size\t\t" + "Ice\t\t" + "Price\t\t");
                
                println((numChoice + 1) + "\t\t" +
                  customerName[numChoice] + "\t\t" +
                  beverageName[numChoice] + "\t\t" +
                  sugarName[numChoice] + "\t\t" +
                  sizeName[numChoice] + "\t\t" +
                  ice[numChoice] + "\t\t" +
                  money.format(price[numChoice]));


            } else if (displayChoice.equalsIgnoreCase("A")) {
              NumberFormat money = NumberFormat.getCurrencyInstance();
              
              println("Number\t\t" + "Name\t\t" + "Beverage\t\t" + "Sugar\t\t" + "Size\t\t" + "Ice\t\t" + "Price\t\t");
              
              for (int a = 0; a < howMany; a++) {
                  println((a + 1) + "\t\t" +
                  customerName[a] + "\t\t" +
                  beverageName[a] + "\t\t" +
                  sugarName[a] + "\t\t" +
                  sizeName[a] + "\t\t" +
                  ice[a] + "\t\t" +
                  money.format(price[a]));
              }
            }
                
              
                



                        




        
            
                
         




    } while (true);
}
    }


