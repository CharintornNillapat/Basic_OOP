package lab7;

import static lab7.Board.freeMove;

/**
 *
 * @author Eazymandiaz
 */
public class Lab7 {
  public static void main(String[] args) {
    Board board = new Board();

    // สร้างตัวหมาก
    Piece p1 = new Piece(PieceColor.WHITE, "X");
    Piece p2 = new Piece(PieceColor.BLACK, "O");
    Piece p3 = new Piece(PieceColor.BLACK, "A");
    Piece p4 = new Piece(PieceColor.BLACK, "B");
    
    // วางหมากลงกระดาน
    board.placePiece(p1, File.A, 1);
    board.placePiece(p2, File.B, 1);
    board.placePiece(p3, File.C, 1);
    board.placePiece(p4, File.D, 1);

    
    board.printBoard();

    // ให้หมากเดินไปยังตำเเหน่งที่ต้องการ freeMove(board, ตัวหมาก, File A-H, rank1-8);
    
    freeMove(board, p1, File.H, 3);
    board.printBoard();
    freeMove(board, p2, File.A, 1);
    board.printBoard();
    freeMove(board, p3, File.A, 8);
    board.printBoard();
    freeMove(board, p1, File.A, 8);
    board.printBoard();
    freeMove(board, p1, File.A, 1);
    board.printBoard();
    freeMove(board, p1, File.D, 1);
    board.printBoard();

    

  }

}
