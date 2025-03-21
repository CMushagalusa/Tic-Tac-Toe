// Clovis Mushagalusa CIRUBAKADERHA
// Faith Rovina
// Innocent Chikwanda
// Konama Shulammite

/**
 * This class represents the board for a game of
 * TicTacToe
 * 
 * @author G. Ayorkor Korsah
 */
public class TicTacToeBoard {

    private String[][] board; // the board
    private int numEmpty; // The number of empty slots
    private boolean detectedWin; // Whether or not a winner has been seen
    private String winningSymbol; // The symbol of the winner
    public static final int SIZE = 3;
    public static final String EMPTY = ".";

    /**
     * The constructor for the class.
     * It instantiates the 3x3 board and initializes the board to be empty.
     * You should also initialize the number of empty slots
     * 
     */
    public TicTacToeBoard() {

        board = new String[SIZE][SIZE];

        for (int b = 0; b < board.length; b++) {
            for (int i = 0; i < board[b].length; i++) {
                board[b][i] = EMPTY;
            }
        }
        numEmpty = 9;
        detectedWin = false;
        winningSymbol = "";
    }

    /**
     * It prints the board
     */
    public void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < board[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * If the number of empty spaces is 0, then the board is full
     * 
     * @return whether or not the board is full.
     */
    public boolean isBoardFull() {

        if (numEmpty == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Return true if a given location on the board,
     * specified by a given row index and column index, is empty
     * 
     * @param row The row of the board.
     * @param col the column of the board
     * @return Whether or not the location is empty.
     */
    public boolean isEmpty(int row, int col) {

        if (board[row][col] == EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * check the game for a win
     * If all the elements a row, column, or diagonal are the same,
     * then a win has been detected.
     * 
     * If a win is detected, the detectedWin instance variable should be set to
     * true,
     * and the winningSymbol instance variable should be set to the symbol of the
     * winner.
     */

    private void detectWin() {
        int cell = 0;

        // Checking if we have the same symbol on a certain row.
        for (int row = 0; row < board.length; row++) {
            if ((board[row][cell] != EMPTY) && (board[row][cell].equals(board[row][cell + 1]))
                    && (board[row][cell].equals(board[row][cell + 2]))) {

                detectedWin = true;
                winningSymbol = board[row][cell];
            }
        }

        // Checking if we have the same symbol on a certain colon.
        for (int col = 0; col < board.length; col++) {
            if ((board[cell][col] != EMPTY) && (board[cell][col].equals(board[cell + 1][col]))
                    && (board[cell][col].equals(board[cell + 2][col]))) {

                detectedWin = true;
                winningSymbol = board[cell][col];
            }
        }

        // Checking if we have the same symbol on the first diagonal [0][0] to [2][2].
        if ((board[cell][cell] != EMPTY) && (board[cell][cell].equals(board[cell + 1][cell + 1]))
                && (board[cell][cell].equals(board[cell + 2][cell + 2]))) {

            detectedWin = true;
            winningSymbol = board[cell][cell];
        }

        // Checking if we have the same symbol on the second diagonal [2][0] to [0][2].
        if ((board[cell][cell + 2] != EMPTY) && (board[2 - cell][cell].equals(board[1 - cell][cell + 1]))
                && (board[2 - cell][cell].equals(board[cell][cell + 2]))) {

            detectedWin = true;
            winningSymbol = board[2 - cell][cell];
        }
    }

    /**
     * If the board is empty at the given row and column,
     * then place the symbol on the board,
     * decrement the number of empty spaces,
     * and check for a win
     * 
     * If the board is not empty at the given row and column,
     * then the play is not successful and the method returns {@code false}.
     * 
     * 
     * @param row    the row of the board (0 indexed)
     * @param col    The column number of the board (0 indexed).
     * @param symbol the symbol to be placed on the board
     * @return Whether a move was successful or not.
     */
    public boolean play(int row, int col, String symbol) {

        if ((row < board.length) && (col < board.length) && (board[row][col] == EMPTY)) {
            board[row][col] = symbol;

            numEmpty--;
            detectWin();
            return true;
        }
        return false;
    }

    // If the game is over,and has a winner, return true. Otherwise, return false.
    public boolean hasWinner() {

        if (detectedWin) {
            return true;
        } else {
            return false;
        }
    }

    // This function returns the winning symbol.
    // It is only valid to call this method if hasWinner returns true.

    public String getWinningSymbol() {
        if (detectedWin) {
            return winningSymbol;
        }
        return EMPTY;
    }

    public int getNumEmpty() {
        return numEmpty;
    }
}