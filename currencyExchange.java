import acm.program.*;

public class currencyExchange extends ConsoleProgram {
        public void run () {
                do {      
                        String answer = readLine("Do you want to convert (E) Euros, (C) Canadian Dollars, (Y) Yen or (Q)?");

                        if (answer.equalsIgnoreCase("Q")) {
                                println("The exchange thanks you.");
                                break;
                        }

                        else if (answer.equalsIgnoreCase("Y")) {
                                int amount = readInt("Dollars to convert $: ");
                                println(usd_yen(amount));
                        }

                        else if (answer.equalsIgnoreCase("C")) {
                                int amount = readInt("Dollars to convert $: ");
                                println(usd_can(amount));
                        }

                        else if (answer.equalsIgnoreCase("E")) {
                                int amount = readInt("Dollars to convert $: ");
                                println(usd_eur(amount));
                        }
                        
                } while(true);

                }

       public double usd_yen(int amount) {
               return(amount * 101);
       }

       public double usd_can(int amount) {
               return(amount * 0.7);
       }

       public double usd_eur(int amount) {
               return(amount * 2);
       }


        }







