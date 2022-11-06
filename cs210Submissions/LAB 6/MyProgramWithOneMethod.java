// Samneet Singh
// November 9, 2020
// This is a program with one method

package lab6;
//import statements
import java.util.Scanner;

public class MyProgramWithOneMethod {
	//This method will not return a value, does not pass anything through its parameters, and is to print the instructions 
	public static void printInstructions() {
        // print to the screen, instructions
        System.out.println("This program calculates the nth power of a base integer input by the user.");
	}
	
	//main program
	public static void main (String[]args) {
		//The method printInstructions is called to print the instructions 
		printInstructions();
        System.out.print("Please input your base; an integer less than 10 : ");
        // receive user's input
        Scanner keyboard = new Scanner(System.in);
        int myInteger = keyboard.nextInt();
        System.out.print("Please input your exponent; a positive integer less than 10 : ");
        int myExponent = keyboard.nextInt();
        int myIntegerPower = myInteger;

        // perform calculation
        for (int i = 2; i <= myExponent; i++) {
            myIntegerPower *= myInteger;
        }

        // output result
        System.out.println("The integer " + myInteger + " raised to the " + myExponent + "th power: " + myIntegerPower);

	}
	
}