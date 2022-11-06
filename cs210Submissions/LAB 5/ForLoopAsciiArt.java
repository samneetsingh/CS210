// Samneet Singh
// October 26, 2020
// A program that outputs a triangle made out of @ symbols
import java.util.Scanner; // import a scanner
public class ForLoopAsciiArt { // Define a new class
   public static void main (String[] args){ // the main routine
      
      int triangleHeight; // declare a new variable triangleHeight of type int
      Scanner keyboard = new Scanner(System.in); // create scanner keyboard
      
      System.out.println("How tall is the triangle? "); // ask the user to input the triangle height
      triangleHeight = keyboard.nextInt();
      
      for (int row = 0; row <= triangleHeight; row++){ // create the outer for loop
         for (int column = 0; column < row; column++){ // create the inner for loop
            System.out.print("@");
         }
         System.out.println();
      }
   }
}