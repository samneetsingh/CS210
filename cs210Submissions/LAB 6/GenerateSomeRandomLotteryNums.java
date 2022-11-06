// Samneet Singh
// November 9, 2020
// This is a code that generates some random lottery numbers

package lab6;
//Import statements 
import java.util.Scanner;
import java.util.Random;

public class GenerateSomeRandomLotteryNums {
	public static void main (String[]args) {
		//The integers to determine the number of guesses and highest possible lottery number are instantiated 
		int numberOfGuesses;
		int maximumLotteryNum;
		
		System.out.println("I know you are busy, so I will guess");
		System.out.println("your lottery number for you!");
		System.out.println("How many numbers should I guess?");
		//Scanner Object 'keyboard' is created
		Scanner keyboard = new Scanner(System.in);
		//The Scanner object is used to assign the user response to the integer 'numberOfGuesses'
		numberOfGuesses = keyboard.nextInt();
		System.out.println("What is the highest possible lottery number?");
		//The Scanner object is used to assign the next user response to the integer 'maximumLotteryNum' 
		maximumLotteryNum = keyboard.nextInt();
		//The random class in java is created to generate a random number
		Random randomNumbers = new Random();
		//A for-loop that iterates from 0 to number of guesses is created 
		for (int i = 1; i <= numberOfGuesses; i++) {
			//The integer randomNum is created 
			int randomNum;
			//The integer is assigned the random number generated with a maximum determined by the 'maximumLotteryNum' variable
			randomNum = randomNumbers.nextInt(maximumLotteryNum);
			//If i has a value of 0, the random number will be shown as the first lottery number
			if ( i == 1) {
				System.out.println("The first lottery Number is: " + randomNum);
			} else if ( i == numberOfGuesses) {
				//If i has the value of numberOfGuesses, the random number will be shown as the last lottery number
				System.out.println("The last lottery Number is: " + randomNum);
			} else {
				//else the random number will be shown as the next lottery number
				System.out.println("The next lottery Number is: " + randomNum);
			}
				
		}
		System.out.println("Good Luck!");
	}
	
	
}