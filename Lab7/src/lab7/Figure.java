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
public abstract class Figure {

  protected String name;
  protected PieceColor pieceColor;
  protected Square currentSquare;

  public Figure(PieceColor pieceColor) {
    this.pieceColor = pieceColor;

  }

  public String getName() {
    return name;
  }

  public PieceColor getPieceColor() {
    return pieceColor;
  }

  public Square getCurrentSquare() {
    return currentSquare;
  }

  public void setCurrentSquare(Square currentSquare) {
    this.currentSquare = currentSquare;
  }

  @Override
  public String toString() {
    return "Figure{" + "name=" + name + ", pieceColor=" + pieceColor + ", currentSquare=" + currentSquare + '}';
  }

}
