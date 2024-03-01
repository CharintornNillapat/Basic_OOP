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
   
    Bishop b1 = new Bishop(PieceColor.WHITE,"WB");
    Bishop b2 = new Bishop(PieceColor.BLACK,"BB");
   
    
    // วางหมากลงกระดาน
    board.placePiece(b1, File.C, 1);
    board.placePiece(b2, File.C, 8);
    // ให้หมากเดินไปยังตำเเหน่งที่ต้องการ freeMove(board, ตัวหมาก, File A-H, rank1-8);
    
    freeMove(board, b1, File.A, 1);
    board.printBoard();
    
    freeMove(board, b1, File.C, 8);
    board.printBoard();
    
  
  }

}
