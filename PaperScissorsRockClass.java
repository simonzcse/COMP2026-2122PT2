/**
 * Work on this file for Paper-Scissors-Rock again.
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PaperScissorsRockClass {
    public static void main(String[] arg) {
        new PaperScissorsRockClass().runApp();
    }

    //Similar to pt1, your task here is to decide which player
    //wins the game. P1 or P2
    //Possible output: "<P1 name> wins!" or "<P2 name> wins!" or "Draw!"
    public void findResult(Player p1, Player p2) {
        //TODO
    }

    //Decide if there is only one player remains in the game
    //if it is true, return true
    //Otherwise return false
    public boolean onlyOnePlayerLeft(Player players[]) {
        //TODO
    }

    //Similar to pt1, this method will generate 6 computer players
    //and play a group paper scissor rock game.
    //These player should keep playing until one player remains.
    //Write code inside TODO only.
    //Hint: not too many things you need to put here. 
    //Use the method of player very carefully.
    public void groupGame(int numberOfPlayer) {
        Player players[] = new ComputerPlayer[numberOfPlayer];
        
        int round = 1;
        while (/** TODO */) { 
            System.out.printf("Round %d\n----------------\n",round++);
            //TODO

        }
        System.out.println("\nFinal Result\n--------------");
        //Print the winning player
    }


    public void runApp() {
        System.out.println("In two players game - Step 1");
        Player player1 = new Player("Kevin");
        player1.prepareValue();
        System.out.println(player1);
        System.out.println("Step 2");
        Player computer = new ComputerPlayer();
        computer.prepareValue();
        System.out.println(computer);
        System.out.println("Step 3");
        findResult(player1, computer); 

        System.out.println("\nGroup game\n------------");
        groupGame(6); //play a six players game

    }
}

class Player {
    /**
     * The String of Paper Scissor Rock
     */
    public static final String[] WORDS = {"Paper", "Scissor", "Rock"};
    /**
     * Name of the player
     */
    private final String name;
    /**
     * The value that a player plays. 
     * 1 = paper, 2 = scissor, 3 = rock
     */
    protected int value;
    /**
     * Indicate that if a person is out for a group game.
     */
    private boolean isOut = false;
    /**
     * Constructor 
     */

        //TODO

    /**
     * Other getter - You can add any getter in this program.
     * You are not supposed to have any setter method.
     */

    /**
     * This method let the player to assign a number to this.value. 
     * 1 = paper, 2 = scissor, 3 = rock
     * We assume a player is a human player, therefore, according to the
     * output of the program, perform the suitable code
     */
    public void prepareValue() {
        //TODO
    }
    
    /**
     * This method will says either
     * "<player's name> is out" - if he is out for the game
     * "<player's name> is not ready" - if the player has never called the prepareValue() method
     * "<player's name> plays [Paper|Scissor|Rock]" - if the player plays paper/scissor/or rock.
     */
    public String toString() {
        //TODO
    }


    /** 
    * This method compares the value of a player against the value of other non-eliminated players
    * The result of the comparison decide if this player should be eliminated.
    * For example, if the value of this player is 1, i.e., paper, and all other players play either paper or scissors
    * this player is going to be eliminated for next round.
    * This method does not compare against player that has been eliminated.
    */
    public void compareValueWithOtherPlayers(Player[] players) {
        //TODO

        //Hint,  you want to do something like the following somewhere in your code
        isOut = true;
    }
}

/** 
 * The ComputerPlayer is a subclass of Player such that it plays randomly.
 * You should minimize the amount of code in this class.
 */
class ComputerPlayer extends Player {
    //TODO
}