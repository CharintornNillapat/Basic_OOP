package lab7;

import java.util.ArrayList;
import java.util.List;

public class Piece extends Figure implements MoveCheck {

  public Piece(PieceColor pieceColor, String name) {
    super(pieceColor);
    this.name = name;
  }

  @Override
  public List<Location> getValidMoves(Board board) {
    // Create an empty list to store valid moves
    List<Location> validMoves = new ArrayList<>();

    // Iterate through all squares on the board
    for (int i = 0; i < Board.BOARD_LENGTH; i++) {
      for (int j = 0; j < Board.BOARD_LENGTH; j++) {
        // Check if the current square is a valid destination
        if (isValidMove(board, this.getCurrentSquare(), board.boardSquares[i][j])) {
          validMoves.add(board.boardSquares[i][j].getLocation());
        }
      }
    }

    return validMoves;
  }

  @Override
  public List<Location> getValidMoves(Board board, Square square) {
    // Implement this method based on your game's logic
    return null;
  }

  private boolean isValidMove(Board board, Square source, Square destination) {
    // Check if the destination is within the board's bounds
    if (!destination.getLocation().isValidLocation()) {
      return false;
    }

    return !(destination.isOccupied() && destination.getCurrentPiece().getPieceColor() == this.getPieceColor());
  }
}
