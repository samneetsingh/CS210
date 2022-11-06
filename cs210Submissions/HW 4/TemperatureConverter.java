// Samneet Singh
// November 7th, 2020
// Changes between temperature scales

// import scanner
import java.util.Scanner;
public class TemperatureConverter { // declare class

   public static void convertTemp(double temperature, String temperatureScale) { // create a method
            
      if (temperatureScale.equals("f")) { // check if temperature scale is equal to the letter f
         
         double celsius; // declare variable of type double celsius
         celsius = (5.0 / 9.0) * (temperature - 32.0);  // convert fahrenheit to celsius
         System.out.print(temperature + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius."); // print the new scale

      }  
      
      else if (temperatureScale.equals("c")) { // check if temperature is equal to the letter c
      
         double fahrenheit; // declare variable of type double fahrenheit
         fahrenheit = 32.0 + (temperature * 1.8); // convert celsius to fahrenheit
         System.out.print(temperature + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit."); // print the new scale
      }
      
      else { // create a default statement
      
         System.out.print("Sorry, you've entered a bad choice");
      }
   }
   
   public static void main (String[] args) { // create the main method
   
      Scanner keyboard = new Scanner(System.in); // create new scanner keyboard
   
      double userInput; // create a new variable of double userInput
      System.out.println("Hello. This program will convert Fahrenheit to Celsius, or vise-versa."); // tell the user the point of the code
      System.out.print("To get started, please enter a temperature: "); // get user input
      userInput = keyboard.nextDouble(); keyboard.nextLine();
      System.out.println("You have entered " + userInput); // tell the user what they've input
      
      String temperatureType = new String(); // create a new string temperatureType
      System.out.println("Did you submit Fahrenheit or Celsius?"); // ask what temperature type they submitted
      System.out.print("Type f for Fahrenheit, or c for Celsius: ");
      temperatureType = keyboard.nextLine();
      
      convertTemp(userInput, temperatureType); // invoke method convertTemp
   }
}
   
   