// Samneet Singh
// October 28, 2020
// This program outputs a triangle of a user-entered height and character typ
import java.util.Scanner; // import the Scanner class
public class AsciiTriangle { // Define a new class
   public static void main (String[] args){     // the main routine
   
      int triangleHeight = 0;                      // variable declaration and assignment
      String aSCIICharacter = "*";                 // variable declaration and assignment
      Scanner keyboard = new Scanner(System.in);   // create a scanner
      
      // print instructions and ask the user to input the triangle height
      System.out.println("This program prints a simple ASCII triangle. ");
      System.out.print("How tall should the triangle be? ");
      triangleHeight = keyboard.nextInt() + 1;
      
      // receive as input the ASCII character that should be used to print the ASCII art
      System.out.print("What ASCII character should be used to draw the triangle? ");
      aSCIICharacter = keyboard.next();
      
      int triangleRow = 1; // keep track of which row of the triangle you are printing
      String triangleRowChars = "";
      int rowCharacterPosition = 1;
      
      // at this point, triangleRow is 1
      while (triangleRow < triangleHeight){           // set up the outer while loop
         triangleRowChars = "";
         rowCharacterPosition = 1;
         while (rowCharacterPosition <= triangleRow){ // set up the inner while loop
            triangleRowChars = triangleRowChars + aSCIICharacter;
            rowCharacterPosition++;
         }
         System.out.println(triangleRowChars);
         triangleRow++;
      }
   }
}