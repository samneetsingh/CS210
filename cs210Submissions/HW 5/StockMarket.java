// Samneet Singh
// November 14th, 2020
// Program that takes an inputted bet and calculates whether each trader lost or gained money

import java.util.Scanner;

// A "casino" class
public class StockMarket {

    public static void main(String Args[]) {
         
        // four reference variables, trader1, trader2, trader3, trader4,
        // each of which references a new instance of an object of type Trader,
        // created using the non-standard constructor
        Trader Sam = new Trader("Sam");
        Trader Aruna = new Trader("Aruna");
        Trader Shradha = new Trader("Shradha");
        Trader Mayank = new Trader("Mayank"); 
        
        String name;
        double percentage;
        
        // set stock change percentage (stockChangePercentage) for each player (sample percentages)
        Sam.setStockChangePercentage(0.61); // trader1 has stock change percentage of 0.61
        Aruna.setStockChangePercentage(0.19); // trader2 has stock change percentage of 0.19
        Shradha.setStockChangePercentage(0.81); // trader3 has stock change percentage of 0.81
        Mayank.setStockChangePercentage(0.42); // trader4 has stock change percentage of 0.42
               
        System.out.println("Here are the Traders, and their stock change percentages: ");
        
        Trader[]stockMarkets = new Trader[4];
        stockMarkets[0] = Sam;
        stockMarkets[1] = Aruna;
        stockMarkets[2] = Shradha;
        stockMarkets[3] = Mayank;
        
        for (int i = 0; i <= 3; i++) {
         Trader value = stockMarkets[i];
         name = value.getTraderName();
         percentage = value.getStockChangePercentage();
         System.out.println(name + "'s " + "stock change percentage: " + percentage);
        }
        // invoke the getTraderName and getStockChangePercentage methods
        
        
        // for each Trader object, to retrieve that information, and print
        // it to the screen

        // create a variable, keyboard, of type Scanner, and set it
        // equal to a new object of type Scanner, that "listens" to
        // System.in	
        Scanner keyboard = new Scanner(System.in);
        
        // a while loop, with a "true" conditional
        while (true) {
            // For each of the four traders, retrieve the trader's name, how much money he/she spent,
            // how much money he/she currently has, and the trader's net profit. Print that information
            // to the screen. Look at the homework handout for sample output					
            // use a System.out.print statement to ask how much money each trader should bet. 
            // Then declare a variable dollarsSpend of type double, and set its value to the keyboard's
            // keystroke (be sure to use keyboard.nextDouble()).
            // If the user enters 0, then issue a break statement, so that the while loop terminates
            // Else, invoke the tradeSomeMore method of each Trader, and pass it the variable dollarsSpend		
            System.out.println(Sam.getTraderName() + "; spent: $" + Sam.getDollarsSpent() + "; current: $" + Sam.getDollarsMade() + "; net: $" + Sam.getNetProfit());
            System.out.println(Aruna.getTraderName() + "; spent: $" + Aruna.getDollarsSpent() + "; current: $" + Aruna.getDollarsMade() + "; net: $" + Aruna.getNetProfit());
            System.out.println(Shradha.getTraderName() + "; spent: $" + Shradha.getDollarsSpent() + "; current: $" + Shradha.getDollarsMade() + "; net: $" + Shradha.getNetProfit());
            System.out.println(Mayank.getTraderName() + "; spent: $" + Mayank.getDollarsSpent() + "; current: $" + Mayank.getDollarsMade() + "; net: $" + Mayank.getNetProfit());
            System.out.print("How much should each Trader bet? Enter 0 to quit ");
            int userInput = keyboard.nextInt();
            
            if (userInput == 0) {
               break;
            }
            else {
               Sam.tradeSomeMore(userInput);
               Aruna.tradeSomeMore(userInput);
               Shradha.tradeSomeMore(userInput);
               Mayank.tradeSomeMore(userInput);
            }
        }

    }
}
