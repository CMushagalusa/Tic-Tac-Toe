// Clovis Mushagalusa CIRUBAKADERHA
// Faith Rovina
// Innocent Chikwanda
// Konama Shulammite

import java.util.Scanner;

/**
 * This class represents a player in the game of Tic-Tac-Toe.
 * 
 * @author G. Ayorkor Korsah
 */
public class TicTacToePlayer {
    private String name;
    private String symbol;

    /**
     * This method reads in the player's name and desired symbol.
     * It allows only non-digit single-character symbols.
     */
    public void getPlayerInfo() {
        Scanner input = new Scanner(System.in);
        String pattern = "[^\\d]";
        String answer;

        System.out.println("What is your name?");
        System.out.print("Type it here: ");
        name = input.next();
        System.out.println(" ");

        do {
            System.out.println("What symbol would you like to use?");
            System.out.print("Type it here: ");
            answer = input.next();
            System.out.println(" ");

            if (!answer.matches(pattern)) {
                System.out.println("Your symbol must be exactly one character, " +
                        "and cannot be a digit");
            } else
                symbol = answer;
        } while (!answer.matches(pattern));
    }

    /**
     * Retrieves the name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the symbol of the player.
     */
    public String getSymbol() {
        return symbol;
    }
}