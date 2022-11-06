// Samneet Singh
// November 12th, 2020
// Rock Paper Scissors which prints results into a file

// import driver classes
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// create public class
public class RockPaperScissors {
    public static void Game(Scanner scan) throws IOException { // create a method Game

        // Declare variables wins, losses, ties, another of type int
        int wins = 0;
        int losses = 0;
        int ties = 0;
        int another = 1;
        Random rand = new Random(); // create an instance of the random class

        String playerName = nameOfPlayer(); // create a string playerName and set playerName equal to the return of the nameOfPlayer method

        while (another == 1) { // create a while loop which will run the game as many times as the user chooses
            System.out.print("Enter 1)Rock, 2)Paper, or 3)Scissors "); // ask the user their input
            int usersChoice = error(scan); // check if the user's input is an error
            int computersChoice = rand.nextInt(3) + 1; // randomize the computer's choice

            if (usersChoice == computersChoice) { // create an if statement that outputs the result when there is a tie

                switch (usersChoice) {
// if both choose rock
                    case 1 -> {
                        System.out.println("We tied - we both chose Rock!");
                        ties++;
                    }
// if both choose paper
                    case 2 -> {
                        System.out.println("We tied - we both chose Paper!");
                        ties++;
                    }
// if both choose scissors
                    case 3 -> {
                        System.out.println("We tied - we both chose Scissors!");
                        ties++;
                    }
                }
            } else { // create an else statement for if the user loses
                if (usersChoice == 1 && computersChoice == 2) { // if the user chooses rock and loses
                    System.out.println("I win - paper beats rock!");
                    losses++;
                }
                if (usersChoice == 2 && computersChoice == 3) { // if the user chooses paper and loses
                    System.out.println("I win - scissors beats paper!");
                    losses++;
                }
                if (usersChoice == 3 && computersChoice == 1) { // if the user chooses scissors and loses
                    System.out.println("I win - rock beats scissors!");
                    losses++;
                } else {

                    if (usersChoice == 1 && computersChoice == 3) { // if the user chooses rock and wins
                        System.out.println("You win - rock beats scissors!");
                        wins++;
                    }
                    if (usersChoice == 2 && computersChoice == 1) { // if the user chooses paper and wins
                        System.out.println("You win - paper beats rock!");
                        wins++;
                    }
                    if (usersChoice == 3 && computersChoice == 2) { // if the user chooses scissors and wins
                        System.out.println("You win - scissors beats paper!");
                        wins++;
                    }

                }
            }

            System.out.println();
            System.out.print("Do you want to play again 1) yes 2) no: "); // ask if the user would like to play again
            another = error(scan); // check if the user said yes or no
            System.out.println();

        }

        Score(wins, losses, ties); // invoke the score method
        PrintScore(wins, losses, ties, playerName); // invoke the PrintScore method
    }

    public static void Score(int wins, int losses, int ties) { // create the score method

        int sum = wins + losses + ties; // create a variable sum of type int and set its value

        System.out.print("You played " + sum + " games: with " + wins); // print player stats

        // create if statements that print losses and ties and make it grammatically correct
        if (wins == 1)
            System.out.print(" win, " + losses);
        else
            System.out.print(" wins, " + losses);

        if (losses == 1)
            System.out.print(" loss, and " + ties);
        else
            System.out.print(" losses, and " + ties);

        if (ties == 1)
            System.out.println(" tie.");
        else
            System.out.println(" ties.");
    }

    public static int error(Scanner scan) { // create the error method

        int input = -1; // create a variable input of type int and set it's value
        while (input != 2 && input != 1 && input != 3) { // create a while loop to check if the user input is valid
            while (!scan.hasNextInt()) { // nest a while loop that makes sure scan is not an valid integer
                scan.next();
                System.out.print("Not an integer; try again"); // output that it is not an integer
            }
            input = scan.nextInt();
            if (input != 2 && input != 1 && input != 3) { // ask again for an integer 1, 2, or 3
                System.out.print("Please enter 1 for rock or 2 for paper or 3 for scissors and 1 for yes and 2 for no");
            }
        }
        return input; // return the value of input for future use
    }

    public static void PrintScore(int wins, int losses, int ties, String playerName) throws IOException { // create a method PrintScore
        int sum = wins + losses + ties; // set the value of an integer sum

        // create new instances of the statistic non-driver class
        Statistic numWins = new Statistic();
        Statistic numLosses = new Statistic();
        Statistic numTies = new Statistic();
        Statistic numGames = new Statistic();

        // invoke the setter methods of the class
        numWins.setNumberOfWins(wins);
        numLosses.setNumberOfLosses(losses);
        numTies.setNumberofTies(ties);
        numGames.setNumberOfGames(sum);

        FileWriter myWriter = new FileWriter("RPCStats.txt", true); // create a new instance of the FileWriter class

        myWriter.write("Player Name: " + playerName + "\r\n"); // write the player name to the file
        // write the player stats to the file
        myWriter.write("Total played: " + numGames.getNumberOfGames() + " Wins: " + numWins.getNumberOfWins() + " Losses: " + numLosses.getNumberOfLosses() + " Ties: " + numTies.getNumberofTies() + "\r\n");
        myWriter.close(); // close the file
    }

    public static String nameOfPlayer() { // create a method of type String

        Scanner keyboard = new Scanner(System.in); // create a new scanner 'keyboard'

        System.out.print("What is your name? "); // ask for player name

        return keyboard.nextLine(); // return the string player
    }

    public static void main(String[] args) throws IOException { // create the main class

        Scanner scan = new Scanner(System.in); // create a new scanner 'scan'
        Game(scan); // invoke the game method
    }
}