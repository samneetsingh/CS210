public class Statistic { // create the Statistic class

    int[] score = new int[4]; // create an array score of type int and allocate 4 slots of memory

    // create a getter method for number of wins
    public int getNumberOfWins() {
        return score[0];
    }

    public void setNumberOfWins(int wins) { // create a setter method for number of wins
        // declare the private variables
        score[0] = wins;
    }

    // create a getter method for number of losses
    public int getNumberOfLosses() {
        return score[1];
    }

    public void setNumberOfLosses(int losses) { // create a setter method for number of losses
        score[1] = losses;
    }

    // create a getter method for number of ties
    public int getNumberofTies() {
        return score[2];
    }

    public void setNumberofTies(int ties) { // create a setter method for the number of ties
        score[2] = ties;
    }

    // create a getter method for number of games
    public int getNumberOfGames() {
        return score[3];
    }

    public void setNumberOfGames(int sum) { // create a setter method for the number of games
        score[3] = sum;
    }
}
