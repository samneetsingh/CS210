// Name: Samneet Singh
//  Date: 10/15/20 
//  Description: What to wear based on outside temperature

//import scanner
import java.util.Scanner;


public class ClothingPickerIfElseIf{
	public static void main (String[]args) {
		
      // declare a variable of type double 
		double tempOutsideF; 
		
      // create Scanner object 
		Scanner scan = new Scanner (System.in);
		
      // assign value to temperature variable 
		System.out.print("What is the temperature outside (in F)?  ");
		tempOutsideF = scan.nextDouble();
		
		// indicate what type of clothing to wear, based on temperature 
		if (tempOutsideF > 70) {
			System.out.println("Wear t-shirts, shorts, and sandals.");
		}
		else if (tempOutsideF < 30) {
			System.out.println("Wear boots, pants, sweater, and gloves.");			
		}
		else {
			System.out.println("Wear long-sleeve shirt, pants, and shoes.");
		}

	}
	
}

