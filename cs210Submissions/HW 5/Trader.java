// Samneet Singh
// November 14th, 2020
// Program that creates a class Trader, which is then utilized in StockMarket.java

// Import the Random class
import java.util.Random;

// A Class that defines an object of type Trader
public class Trader {
    // fields; there are four of them, and each should be private:
    private String traderName; // traderName of type String
    private double stockChangePercentage; // stockChangePercentage of type double
    private double dollarsSpent; // dollarsSpent of type double
    private double dollarsMade; // dollarsMade of type double
    
    public double getStockChangePercentage() { // method: getStockChangePercentage, public
    // input: void
    // output: double
    // description: retrieves the value stockChangePercentage field
      return stockChangePercentage;
    }
    public void setStockChangePercentage(double percentage) { // method: setStockChangePercentage , public
    // input: percentage, which is of type double
    // output: void
    // description: assign the field stockChangePercentage to percentage
      stockChangePercentage = percentage;
    }
    public void tradeSomeMore(double dollars) {// method: tradeSomeMore, public
      
      Random randomNumbers = new Random();
      
      double randomDouble = randomNumbers.nextDouble();
      if (randomDouble < stockChangePercentage) {
         System.out.println(traderName + " made money");
         dollarsMade += (2 * dollars);
      }
      else {
         System.out.println(traderName + " lost money");
         dollarsMade -= (3 * dollars);
      }
    }
    
    public String getTraderName() {// method: getTraderName, public
    // input paramter: none
    // output: value of field traderName
      return traderName;
    }
    public double getDollarsSpent() {// method: getDollarsSpent, public
    // input paramter: none
    // output: value of field dollarsSpent
    return dollarsSpent;
    }
    public double getDollarsMade() {// method: getDollarsMade, public
    // input paramter: none
    // output: value of field dollarsMade;
    return dollarsMade;
    }
    public double getNetProfit() {// method: getNetProfit, public
    // input paramter: none
    // output: result of (dollarsMade - dollarsSpent)
    double result;
    result = (dollarsMade - dollarsSpent);
    return result;
    }

    public Trader(String name) {
        traderName = name;
        dollarsMade = 1000;
        dollarsSpent = 0;
    }
}
