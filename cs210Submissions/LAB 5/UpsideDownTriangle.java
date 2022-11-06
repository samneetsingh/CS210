// Samneet Singh
// October 26, 2020
// A program that outputs a triangle of a user-entered height made out of @ symbols
import java.util.Scanner; // import scanner
public class UpsideDownTriangle { // define a new class
   public static void main (String[] args){ // the main routine
      
      Scanner keyboard = new Scanner(System.in); // create a scanner keyboard
      
      int triangleHeight; // declare a variable triangleHeight of type int
      System.out.println("How tall is the upside-down triangle"); // ask the user for the height of the triangle
      triangleHeight = keyboard.nextInt();
      
      for (int row = triangleHeight; row > 0; row--){ // create the outer for loop
         for (int column = 0; column < row; column++){ // create the inner for loop
            System.out.print("@");
         }
         System.out.println();
      }
   }
}