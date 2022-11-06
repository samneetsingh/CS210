// Samneet Singh
// October 16, 2020
// Tells my boss what would happen if his bank account increased 10,000 fold

// import java scanner
import java.util.Scanner;
public class DecimalMathUsingIntegers {

   public static void main(String args[]){
   
      // declare variables and introduce keyboard scanner
      int wholePart = 0, fractionalPart = 0;
      double composedDecimalValue = 0.0;
      Scanner keyboard = new Scanner(System.in);
      
      // Collect user input on the values they want to use
      System.out.print("Input an integer for digits left of the decimal: ");
      wholePart = keyboard.nextInt();
      
      System.out.print("Input an integer >= for digits right of the decimal: ");
      fractionalPart = keyboard.nextInt();
      
      // Display said user input
      System.out.println("The wholePart variable has the value: " + wholePart);
      System.out.println("The fractionalPart variable has the value: " + fractionalPart);
      
      composedDecimalValue = wholePart + fractionalPart / 100.0;
      System.out.println("The composedDecimalValue is: " + composedDecimalValue);
      
      // Display final product
      System.out.printf("The formatted compostedDecimalValue times 10,000 is: %,.6f \n",(composedDecimalValue * 10000.0));
   
   }
}