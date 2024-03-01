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
    board.movePawn("WP1", 4, 0);
    board.displayBoard();
    board.movePawn("WP1", 3, 0);
    board.displayBoard();
    board.movePawn("WP1", 2, 0);
    board.displayBoard();
    board.movePawn("WP1", 1, 0);
    board.displayBoard();
    
    //มีปัญหาเบี้ยกูเดินตรงเเสรส
    
  }

}
