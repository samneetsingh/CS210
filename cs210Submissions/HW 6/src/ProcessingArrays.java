// Samneet Singh
// December 4th, 2020
// This program asks how many integers should be generate and uses arrays to store these values then displays statistics

import java.util.Random;
import java.util.Scanner;

public class ProcessingArrays { // Create ProcessingArrays class
    public static void Sum(int[] randomNumberArray) { // Create the Sum method

        int sumOfNumbers = 0; // declare integer sumOfNumbers and set it equal to 0

        for (int i = 0; i < randomNumberArray.length; i++) { // create a for loop to add up all the numbers
            sumOfNumbers += randomNumberArray[i];
        }

        System.out.println("You asked for " + randomNumberArray.length + " integers."); // print how many integers were asked for
        System.out.println("The sum of these integers is " + sumOfNumbers + "."); // print the sum of the integers
    }

    public static void Statistics(int[] randomNumberArray) { // create the Statistics method

        // create statistic variables
        int avg = 0;
        int max = 0;
        int min = randomNumberArray[0]; // set the value of min to array 0 in case the values are greater than 0
        int sum = 0;

        for (int i = 0; i < randomNumberArray.length; i++) { // create a for loop that finds the max and min values
            sum += randomNumberArray[i];

            if (max < randomNumberArray[i]) {
                max = randomNumberArray[i];
            }

            if (min > randomNumberArray[i]) {
                min = randomNumberArray[i];
            }
        }
        avg = (sum / randomNumberArray.length); // find the average

        System.out.println("The average of the integers is " + avg + "."); // print the average
        System.out.println("The largest integer is " + max + "."); // print the max
        System.out.println("The smallest integer is " + min + ".");// print the min
    }

    public static void main(String[] args) { // create the main method

        Scanner keyboard = new Scanner(System.in); // create a scanner
        Random random = new Random(); // create a random

        System.out.print("How many integer numerical entries do you have? "); // ask how many entries the user wants
        int sizeOfArray = keyboard.nextInt(); // store this in an integer sizeOfArray

        int[] randomNumberArray = new int[sizeOfArray]; // set the size of our array

        for (int i = 0; i < randomNumberArray.length; i++) { // create a for loop that gives values to the array's memory
            randomNumberArray[i] = random.nextInt();
        }
        Sum(randomNumberArray); // call the sum method
        Statistics(randomNumberArray); // call the statistics method
    }
}

// One thing that would break the code would be entering a double value for the sizeOfArray variable
// Another thing that would break the code would be entering a fraction
// I'm not sure if I needed 3, but it was worth 15 points so also entering any non-numerical values