// Name: Samneet Singh
//  Date: 10/15/20 
//  Description: What to wear based on outside temperature


public class WhatDoIWear{
	public static void main (String[]args) {
		//declare a variable of type double 
		double tempOutsideF = 78; 
		
		//indicate what type of clothing to wear, based on temperature 
		if (tempOutsideF < 35) {
			System.out.println("Wear boots, pants, sweater, and gloves.");			
		}
		if (tempOutsideF > 35) {
			System.out.println("Wear t-shirts, shorts, and sandals.");
		}
	}
	
}