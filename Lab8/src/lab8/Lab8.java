package lab8;

/**
 *
 * @author Eazymandiaz
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();

        board.placePiece();
        board.displayBoard();
        board.movePawn("WP1", 5, 0);
        board.displayBoard();
        board.movePawn("WP1", 4, 0);
        board.displayBoard();
        board.movePawn("WP1", 3, 0);
        board.displayBoard();
        board.movePawn("WP1", 2, 0);
        board.displayBoard();
        board.movePawn("WP1", 1, 0);
        board.displayBoard();

        board.movePawn("WP2", 4, 1);
        board.displayBoard();
        board.movePawn("WP2", 3, 1);
        board.displayBoard();
        board.movePawn("WP2", 2, 1);
        board.displayBoard();
        board.movePawn("WP2", 1, 1);
        board.displayBoard();

        board.movePawn("WP3", 4, 2);
        board.displayBoard();
        board.movePawn("WP3", 3, 3);
        board.displayBoard();
        board.movePawn("WP3", 2, 4);
        board.displayBoard();
        board.movePawn("WP3", 1, 5);
        board.displayBoard();

        board.movePawn("WP1", 1, 1);
        board.displayBoard();
        board.movePawn("WP2", 1, 0);
        board.displayBoard();
        board.movePawn("WP2", 0, 0);
        board.displayBoard();
        board.movePawn("WP1", 0, 1);
        board.displayBoard();
    }
}
