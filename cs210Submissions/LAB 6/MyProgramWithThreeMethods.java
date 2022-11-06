// Samneet Singh
// November 9, 2020
// This is a code that uses 3 methods

package lab6;
//import statements
import java.util.Scanner;

public class MyProgramWithThreeMethods {
	//This method will not return a value, does not pass anything through its parameters, and is to print the instructions 
	public static void printInstructions() {
        // print to the screen, instructions
        System.out.println("This program calculates the nth power of a base integer input by the user.");
	}
	//a method that instantiates a Scanner class, listens to the keyboard
	//retrieves an integer, and returns the value 
	public static int getIntegerFromKeyboard() {
		Scanner keyboard = new Scanner(System.in);
		int keyboardInput = keyboard.nextInt();
		return keyboardInput;
	}
	//a method that takes two arguments, and calculates the first input 
	//argument raised to the power of the second argument
	public static int calcExponentValue(int integerValue, int exponentValue) {
		int integerPower = integerValue;
        for (int i = 2; i <= exponentValue; i++) {
            integerPower *= integerValue;
        }
        return integerPower;
	}
	//main program
	public static void main (String[]args) {
		//The method printInstructions is called to print the instructions 
		printInstructions();
        System.out.print("Please input your base; an integer less than 10 : ");
        // receive user's input by calling the getIntegerFromKeyboard method 
        int myInteger = getIntegerFromKeyboard();
        System.out.print("Please input your exponent; a positive integer less than 10 : ");
        // receive user's input by calling the getIntegerFromKeyboard method 
        int myExponent = getIntegerFromKeyboard();

        // output result
        System.out.println("The integer " + myInteger + " raised to the " + myExponent + "th power: " + calcExponentValue(myInteger,myExponent));

	}	
	
}