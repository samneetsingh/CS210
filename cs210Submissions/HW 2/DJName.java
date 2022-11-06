// Samneet Singh
// October 15, 2020
// Creating a program that outputs your DJ name

// create java scanner
import java.util.Scanner;

   public class DJName {
      public static void main(String[] args){
      
      // declare all variables using strings
      String FirstName = new String();
      String LastName = new String();
      String DJFirst = new String();
      String DJLast = new String();   
      Scanner Keyboard = new Scanner(System.in);
      
      // ask for first name and give String FirstName value
      System.out.println("What is your first name?   ");
      FirstName = Keyboard.next();
      
      // ask for last name and give String LastName value
      System.out.println("What is your last name?   ");
      LastName = Keyboard.next();
      
      // write if statements about first name
      if (FirstName.length() % 2 == 0) {
         DJFirst = FirstName.substring(0,FirstName.length() / 2);
      }
      else if (FirstName.length() % 2 != 0) {
         DJFirst = FirstName.substring(0,FirstName.length() / 2);
      }
      
      // write if statements about last name
      if (LastName.length() % 2 != 0) {
         DJLast = LastName.substring(LastName.length() / 2 - 1,LastName.length() - 1);
      }
      else if (LastName.length() % 2 == 0) {
         DJLast = LastName.substring(LastName.length() / 2,LastName.length() - 1);
      }
      
      // Output final result by appending String DJFirst and String DJLast with "JayJay"
      System.out.println("Your DJ name is " + DJFirst + DJLast + "JayJay");
      
      }
   }   