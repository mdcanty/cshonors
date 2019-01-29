import acm.program.*;

public class computerStore extends ConsoleProgram {
    public void run () {
        // Asks for the number of PCs.
        int howmanyMachines = readInt("How many machines: ");
        
        println("Welcome to computer configure wizard.");

        String customerName [] = new String[howmanyMachines];
        String cpuName [] = new String[howmanyMachines];
        String ramName [] = new String[howmanyMachines];
        String driveName [] = new String[howmanyMachines];
        String gpuName [] = new String[howmanyMachines];

        double price [] = new double[howmanyMachines];


        for (int x = 0; x < howmanyMachines; x++) {
            customerName[x] = readLine("Please enter customer's name: ");
            cpuName[x] = readLine("Please choose CPU: " +
            "Intel Core (i3), " +
            "Intel Core (i5), " +
            "Intel Core (i7), " );

            if ((cpuName[x].equalsIgnoreCase("i3")) || 
                (cpuName[x].equalsIgnoreCase("3"))) {
                price[x] += 149.99;
            } else if ((cpuName[x].equalsIgnoreCase("i5")) || 
                (cpuName[x].equalsIgnoreCase("5"))) {
                price[x] += 229.50;
            } else if ((cpuName[x].equalsIgnoreCase("i7")) || 
                (cpuName[x].equalsIgnoreCase("7"))) {
                price[x] += 339.99;
            } 


            ramName[x] = readLine("Please choose RAM amount: (8)GB, (16)GB: ");
            
            if ((ramName[x].equalsIgnoreCase("8")) || 
                (ramName[x].equalsIgnoreCase("8GB"))) {
                price[x] += 69.00;
            } else if ((ramName[x].equalsIgnoreCase("16")) || 
                (ramName[x].equalsIgnoreCase("16GB"))) {
                price[x] += 148.99;
            } 
            
            driveName [x] = readLine("Please choose hard drive: (4)TB, (1)TB, 500GB (S)SD: ");
            
            if ((driveName[x].equalsIgnoreCase("4")) || 
                (driveName[x].equalsIgnoreCase("4TB"))) {
                driveName[x] = " 4TB HDD";
                price[x] += 179.99;
            } else if ((driveName[x].equalsIgnoreCase("1")) || 
                (driveName[x].equalsIgnoreCase("1TB"))) {
                driveName[x] = "1TB HDD";
                price[x] += 54.00;
            } else if ((driveName[x].equalsIgnoreCase("S")) || 
                (driveName[x].equalsIgnoreCase("SSD"))) {
                driveName[x] = "500GB SSD";
                price[x] += 243.99;
            }

            gpuName [x] = readLine("Your video is an integrated 1GB, would you like to upgrade to a 2GB (Y/N): ");

            if (gpuName[x].equalsIgnoreCase("N")) {
                price[x] += 150.00;
                gpuName[x] = "1GB";
            } else {
                price[x] += 259.00;
                gpuName[x] = "2GB";
            }
        }
            
           

           do {
             String displayChoice = readLine("Display (A)ll Records, (O)ne Record, (S)earch Records, (Q)uit: ");
             while (!displayChoice.equalsIgnoreCase("Q") && !displayChoice.equalsIgnoreCase("S") && !displayChoice.equalsIgnoreCase("O") && !displayChoice.equalsIgnoreCase("A")) {
             displayChoice = readLine("Display (A)ll Records, (O)ne Record, (S)earch Records, (Q)uit: ");
           }   
             if (displayChoice.equalsIgnoreCase("Q")) {
                    break;
                } else if (displayChoice.equalsIgnoreCase("S")) {
                    String nameChoice = readLine("Enter name to search for: ");
                    println("Number\tName\tCPU\tRAM\tHDD\tVID\tPrice");
                    for (int y = 0; y < howmanyMachines; y++) {
                        if (nameChoice.equals(customerName[y])) {
                            println((y + 1) + "\t" + 
                            customerName[y] + "\t" + 
                            cpuName[y] + "\t" +
                            ramName[y] + "\t" +
                            driveName[y] + "\t" +
                            gpuName[y] + "\t" +
                            price[y]);
                        } 
                    }


                } else if (displayChoice.equalsIgnoreCase("O")) {
                      for (int z = 0; z < howmanyMachines; z++) {
                          println((z + 1) + "\t" + customerName[z]);
                      }
                      
                      int numChoice = readInt("Enter (number) choice: ");
                      numChoice--;
                      
                      println((numChoice + 1) + "\t" +
                      customerName[numChoice] + "\t" +
                      cpuName[numChoice] + "\t" +
                      ramName[numChoice] + "\t" +
                      driveName[numChoice] + "\t" +
                      price[numChoice] );
                      
                      }
           
                      
                 else if (displayChoice.equalsIgnoreCase("A")) {
                    for (int a = 0; a < howmanyMachines; a++) { 
                      println(customerName[a] + "\t" +
                      cpuName[a] + "\t" +
                      ramName[a] + "\t" +
                      driveName[a] + "\t" +
                      price[a] );
                    }
                        
                       
                }
                    
               
            


            } while (true);
            
            println("Thanks for shopping! Now die.");

            
            


        } 
    }

            


            
            

