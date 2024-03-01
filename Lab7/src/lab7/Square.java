/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Eazymandiaz
 */
public class Square {

  private final Location location;

  private boolean isOccupied;
  Figure currentPiece;

  public Figure getCurrentPiece() {
    return currentPiece;
  }

  public void setCurrentPiece(Figure currentPiece) {
    this.currentPiece = currentPiece;
    this.isOccupied = true; // Set isOccupied ให้เป็น true เมื่อมีหมากอยู่ในตำเเหน่งนั้น
  }

  public Square(SquareColor squareColor, Location location) {

    this.location = location;
    this.isOccupied = false;
  }

  public void reset() {
    this.isOccupied = false;
    this.currentPiece = null;
  }

  public void setOccupied(boolean occupied) {
    isOccupied = occupied;
  }

  public Location getLocation() {
    return location;
  }

  public boolean isOccupied() {
    return isOccupied;
  }
 public Figure removePiece() {
    if (isOccupied()) {
      Figure removedPiece = currentPiece;
      currentPiece = null;
      return removedPiece;
    } else {
      // Handle the case where the square is not occupied (optional)
      // You could throw an exception, return null, or log a message
      return null;  // Example: returning null for an empty square
    }
  }
}
   

