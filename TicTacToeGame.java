// Clovis Mushagalusa CIRUBAKADERHA
// Faith Rovina
// Innocent Chikwanda
// Konama Shulammite

import java.util.Scanner;

/**
 * This program implements a game of Tic Tac Toe.
 * It uses the TicTacToeBoard and TicTacToePlayer classes.
 * 
 * @author G. Ayorkor Korsah
 */
public class TicTacToeGame {

    /**
     * The function asks the user for a row and column,
     * and then attempts to play the player's symbol
     * at that position.
     * If the play is successful, the board is printed.
     * If the play is not * successful, the user is asked to try again
     * 
     * @param board  The board object that the game is being played on.
     * @param player The player who is making the move.
     */
    private static void play(TicTacToeBoard board, TicTacToePlayer player) {
        Scanner input = new Scanner(System.in);
        int row, col;
        boolean playSuccessful;

        System.out.println(player.getName() + ", in which row do you want to play?");
        System.out.print("Type it here: ");
        row = input.nextInt();

        System.out.println(player.getName() + ", in which column do you want to play?");
        System.out.print("Type it here: ");
        col = input.nextInt();

        playSuccessful = board.play(row, col, player.getSymbol());
        System.out.println(" ");

        if (playSuccessful) {
            System.out.println("The board now looks like this: ");
            board.printBoard();
            System.out.println(" ");
        }
        while (!playSuccessful) {
            System.out.println(player.getName() + " your play was not successful. Try again.");

            System.out.println("In which row do you want to play?");
            System.out.print("Type it here: ");
            row = input.nextInt();

            System.out.println("In which column do you want to play?");
            System.out.print("Type it here: ");
            col = input.nextInt();

            playSuccessful = board.play(row, col, player.getSymbol());

            if (playSuccessful) {
                System.out.println("The board now looks like this: ");
                board.printBoard();
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TicTacToeBoard board = new TicTacToeBoard();
        TicTacToePlayer player1, player2, curPlayer;
        int whoseTurn;

        player1 = new TicTacToePlayer();
        player2 = new TicTacToePlayer();

        System.out.println("Player1, please enter your information.");
        player1.getPlayerInfo();

        System.out.println("Player2, please enter your information.");

        do {
            player2.getPlayerInfo();

            if (player2.getName().equalsIgnoreCase(player1.getName())) {
                System.out.println("Sorry, that name is being used by Player 1.");
            }

            if (player2.getSymbol().equalsIgnoreCase(player1.getSymbol())) {
                System.out.println("Sorry, that symbol is being used by Player 1.");
            }

        } while (player2.getName().equalsIgnoreCase(player1.getName())
                || player2.getSymbol().equalsIgnoreCase(player1.getSymbol()));

        System.out.println(player1.getName() + " is player 1 and will use symbol " + player1.getSymbol());
        System.out.println(player2.getName() + " is player 2 and will use symbol " + player2.getSymbol());
        System.out.println(" ");

        System.out.println("Who will go first? (Enter 1 or 2) ");
        System.out.print("Type it here: ");

        whoseTurn = input.nextInt();

        System.out.println(" ");

        if ((whoseTurn % 2) != 0) {
            System.out.println(player1.getName() + " will go first.");
        }

        else {
            System.out.println(player2.getName() + " will go first.");
        }

        System.out.println(" ");
        System.out.println("Initially, the board looks like: ");
        board.printBoard();
        System.out.println(" ");

        do {
            if (whoseTurn == 1)
                curPlayer = player1;
            else
                curPlayer = player2;

            play(board, curPlayer);

            whoseTurn = whoseTurn % 2 + 1;

        } while (!board.isBoardFull() && !board.hasWinner());

        if (board.hasWinner()) {

            if (board.getWinningSymbol() == player1.getSymbol())
                System.out.println(player1.getName() + " wins!");
            else
                System.out.println(player2.getName() + " wins!");
        } else
            System.out.println("There is no winner.");

        input.close();
    }
}
