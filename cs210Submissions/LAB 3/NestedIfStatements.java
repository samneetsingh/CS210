// Name: Samneet Singh
// Date: 10/15/20 
// Description: What to wear based on outside temperature

// import scanner
import java.util.Scanner;


public class NestedIfStatements{
	public static void main (String[]args) {
   
		// declare a variable of type double 
		double tempOutsideF; 
		
      // declare boolean variable
		int raining;
	
   	// create Scanner object 
		Scanner scan = new Scanner (System.in);
	
   	// assign value to temperature variable 
		System.out.print("What is the temperature outside (in F)?  ");
		tempOutsideF = scan.nextDouble();
		
      // assign value to raining variable 
		System.out.print("Is it raining? (enter 1 for yes, 0 for no)? ");
		raining = scan.nextInt();	
		
		// indicate what type of clothing to wear, based on temperature 
		if (tempOutsideF > 70) {
			if (raining == 1) {
				System.out.println("Wear shorts and shirt, and bring an umbrella");
			}
			else {
				System.out.println("Wear shorts and shirt, and bring sunglasses");
			}
		}
		else if (tempOutsideF < 30) {
			if (raining == 1) {
				System.out.println("Wear long-sleeve shirt, pants, shoes, and bring umbrella.");
			}
			else {
				System.out.println("Wear long-sleeve shirt, pants, shoes, and bring sunglasses.");
			}		
		}
		else {
			if (raining == 1) {
				System.out.println("Wear long-sleeve shirt, pants, shoes, and bring umbrella.");
			}
			else {
				System.out.println("Wear long-sleeve shirt, pants, shoes, and bring sunglasses.");
			}
		}

	}
	
}

