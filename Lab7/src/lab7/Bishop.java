
package lab7;

import java.util.ArrayList;
import java.util.List;


public class Bishop extends Figure implements MoveCheck {

  public Bishop(PieceColor pieceColor, String name) {
    super(pieceColor);
    this.name = name;
  }

@Override
  public List<Location> getValidMoves(Board board) {
    // Create an empty list to store valid moves
    List<Location> validMoves = new ArrayList<>();

    

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

