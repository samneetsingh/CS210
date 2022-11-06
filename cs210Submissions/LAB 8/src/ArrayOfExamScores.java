// Name : Samneet Singh
// Date : December 3rd, 2020
// Description: A simple program demonstrating the use of arrays

// import driver classes
import java.util.Scanner;
import java.util.Random;
import java.text.*;

public class ArrayOfExamScores { // create class ArrayOfExamScores

    public static void main(String[] args) { // the main method

        Scanner keyboard = new Scanner(System.in); // create a new Scanner keyboard

        System.out.print("How many students are in the class? "); // ask how many students are in the class
        int numStudentsInClass = keyboard.nextInt(); // initialize an integer numStudentsInClass which is equal to the user's input

        int[] arrayOfTestScores = new int[numStudentsInClass]; // create an array of type int called arrayOfTestScores

        // initialize necessary variables
        int runningTotal = 0;
        int maximumScore = 0;
        int maximumScoreStudent = 0;

        Random studentScores = new Random(); // create a new instance of the random class studentScores

        for (int i = 0; i < numStudentsInClass; i++) { // create a for loop for each student's information

            arrayOfTestScores[i] = studentScores.nextInt(101); // set the value of arrayOfTestScores for each student

            System.out.println("Student number " + (i + 1) + " has a score of " + arrayOfTestScores[i] + "%"); // print each student's score

            runningTotal += arrayOfTestScores[i]; // add all the student's scores together

            if (arrayOfTestScores[i] > maximumScore) { // create an if statement that finds which student has the highest score

                maximumScore = arrayOfTestScores[i];
                maximumScoreStudent = i + 1;

            }
        }

        double result = (double) runningTotal / numStudentsInClass; // create a variable result of type double and set it's value

        DecimalFormat avgScore = new DecimalFormat("#.##"); // create a new instance of the DecimalFormat class avgScore
        System.out.println("The average score is " + avgScore.format(result)); // Print the average class score
        System.out.println("The maximum score of " + maximumScore + "% was attained by Student " + maximumScoreStudent); // Print the highest score

    }
}
