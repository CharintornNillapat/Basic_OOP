package lab8;

public class Bishop extends Piece {

  public Bishop(String name, PieceColor pieceColor, int currentRow, int currentCol) {
    super(name, pieceColor, currentRow, currentCol);
  }

  public void move(Board board, int tarRow, int tarCol) {
    Piece[][] squares = board.getSquares();
    int boardSize = squares.length;

    if (tarRow < 0 || tarRow >= boardSize || tarCol < 0 || tarCol >= boardSize) {
      System.out.println("Out of range");
      return;
    }

    // Get current position
    int curRow = getCurrentRow();
    int curCol = getCurrentCol();

    // Check if the move is to the same position
    if (curRow == tarRow && curCol == tarCol) {
      System.out.println("Piece is already at the target position");
      return;
    }

    // Check if the move is diagonal
    if (Math.abs(tarRow - curRow) != Math.abs(tarCol - curCol)) {
      System.out.println("Bishops can only move diagonally on the board");
      return;
    }

    // Check for pieces blocking the path
    int incrementRow = Integer.compare(tarRow, curRow);
    int incrementCol = Integer.compare(tarCol, curCol);
    for (int i = 1; i < Math.abs(tarRow - curRow); i++) {
      int checkRow = curRow + i * incrementRow;
      int checkCol = curCol + i * incrementCol;
      if (squares[checkRow][checkCol] != null) {
        System.out.println("There's a piece blocking the path");
        return;
      }
    }

    // Check for friendly piece at target position
    if (squares[tarRow][tarCol] != null && squares[tarRow][tarCol].getPieceColor() == pieceColor) {
      System.out.println("This position is already occupied by the same side");
      return;
    }
    Piece capturedPiece = squares[tarRow][tarCol];
    // Move the bishop
    if (capturedPiece != null) {
      System.out.println(capturedPiece.getName() + "got captured");
    }
    squares[curRow][curCol] = null;
    squares[tarRow][tarCol] = this;
    setCurrentRow(tarRow); // Update currentRow
    setCurrentCol(tarCol); // Update currentCol
  }

}
