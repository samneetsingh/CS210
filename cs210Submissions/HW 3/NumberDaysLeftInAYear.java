// Samneet Singh
// October 22, 2020
// Code that allows user input of the date which outputs the number of days left in the (non)leap year

import java.util.Scanner;

public class NumberDaysLeftInAYear {
   public static void main(String[] args){
   
      int dayOfMonth; // declare variables dayOfMonth 
      int year; // and year of type int
      String monthName = new String(); // declare variable monthName of type String
   
      Scanner keyboard = new Scanner(System.in); // set up scanner
      
      System.out.println("What month is it?   "); // and ask user to provide month, day of month, and year
      monthName = keyboard.nextLine(); // using nextLine() for monthName
      System.out.println("What day of the month is it?   "); // and nextInt() methods for dayOfMonth
      dayOfMonth = keyboard.nextInt();
      System.out.println("What year is it?   "); // and year
      year = keyboard.nextInt();
   
      int daysLeftInYear = 0; // declare variables daysLeftInYear of type int, and assign it the value 0
      
      boolean isLeapYear = false; // declare variable isLeapYear of type boolean, and assign it the value false
      
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) isLeapYear = true; // Determine whether the year is a leap year using the given rules
      else isLeapYear = false; // I looked at the example in the lecture rather than writing, so my code for this section is shorter than all the if statements I could write
   
      switch (monthName) { // Use a switch statement to determine the number of days left in the year.
         case "January":
            if (isLeapYear == true) // For January, if it is a leap year,
            {
               daysLeftInYear = 366 - dayOfMonth; // then daysLeftInYear = 366 - dayOfMonth.
            }
            else if (isLeapYear == false) // If it is not a leap year
            {
               daysLeftInYear = 365 - dayOfMonth; // then daysLeftInYear = 365 - dayOfMonth.
            }
            break;
         case "February":
            if (isLeapYear == true) // For Febraury, If it is a leap year,
            {
               daysLeftInYear = 335 - dayOfMonth; // then daysLeftInYear = 335 - dayOfMonth.
            }
            else if (isLeapYear == false) // if it is NOT a leap year
            {
               daysLeftInYear = 334 - dayOfMonth; // then daysLeftInYear = 334 - dayOfMonth.
            }
            break;
         // You will need to look up the number of days in each month
         case "March":
            daysLeftInYear = 305 - dayOfMonth;
            break;
         case "April":
            daysLeftInYear = 275 - dayOfMonth;
            break;
         case "May":
            daysLeftInYear = 244 - dayOfMonth;
            break;
         case "June":
            daysLeftInYear = 214 - dayOfMonth;
            break;
         case "July":
            daysLeftInYear = 183 - dayOfMonth;
            break;
         case "August":
            daysLeftInYear = 153 - dayOfMonth;
            break;
         case "September":
            daysLeftInYear = 122 - dayOfMonth;
            break;
         case "October":
            daysLeftInYear = 92 - dayOfMonth;
            break;
         case "November": // For November, there are 30 days + 31 days in December, so if user inputs November,
            daysLeftInYear = 61 - dayOfMonth; // daysLeftInYear = 61 - dayOfMonth.
            break;
         case "December": // For example, December has 31 days,
            daysLeftInYear = 31 - dayOfMonth; // so daysLeftInYear = 31 - dayOfMonth.
            break;
         default:
            System.out.println("You have entered an unrecognizable month. Please check your spelling and try again, or try another month.");
      }
      
      // output the correct text, to indicate how many days there are left in the year.
      if (isLeapYear == true && daysLeftInYear != 1)
      {
         System.out.println("There are " + daysLeftInYear + " complete days left in the leap year " + year);
      }
      else if (isLeapYear == false && daysLeftInYear != 1)
      {
         System.out.println("There are " + daysLeftInYear + " complete days left in the non-leap year " + year);
      }
      // add in extra if statements to make your output grammatically correct
      if (isLeapYear == true && daysLeftInYear == 1)
      {
         System.out.println("There is " + daysLeftInYear + " complete day left in the leap year " + year);
      }
      else if (isLeapYear == false && daysLeftInYear == 1)
      {
         System.out.println("There is " + daysLeftInYear + " complete day left in the non-leap year " + year);
      }
      
      // One input that would crash the code is if one input non integer values for dayOfMonth
      // Another input that would crash the code is if one input non integer values for year
   }
}