/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.List;

public interface MoveCheck {
  default List<Location> getValidMoves(Board board) {
    List<Location> validMoves = new ArrayList<>();
    for (File file : File.values()) {
      for (int rank = 1; rank <= Board.BOARD_LENGTH; rank++) {
        validMoves.add(new Location(file, rank));
      }
    }
    return validMoves;
  }

  default List<Location> getValidMoves(Board board, Square square) {
    return getValidMoves(board);
  }

}
