// Author: Samneet Singh
// Date: October 9th, 2020
// Description: What to wear based on outside temperature

public class WhatToWear{
   public static void main(String[] args) {
      // declare a variable of type double
      double tempOutsideF = 78;
      
      // indicate what clothing to wear, based on temperature
      if (tempOutsideF < 35) {
         System.out.println("Wear boots, pants, sweater, and gloves.");
      }
      if (tempOutsideF > 35) {
         System.out.println("Wear t-shirt, shorts, and sandals.");
      }
   }
}