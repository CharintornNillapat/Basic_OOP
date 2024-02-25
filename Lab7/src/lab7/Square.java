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
  private Figure currentPiece;

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
}
