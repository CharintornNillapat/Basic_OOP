package lab8;

public abstract class Piece {
  protected String name;
  protected int currentRow;
  protected int currentCol;
  protected PieceColor pieceColor;

  public Piece(String name, PieceColor pieceColor, int currentRow, int currentCol) {
    this.name = name;
    this.currentRow = currentRow;
    this.currentCol = currentCol;
    this.pieceColor = pieceColor;
  }

  public int getCurrentRow() {
    return currentRow;
  }

  public void setCurrentRow(int currentRow) {
    this.currentRow = currentRow;
  }

  public int getCurrentCol() {
    return currentCol;
  }

  public void setCurrentCol(int currentCol) {
    this.currentCol = currentCol;
  }

  public String getName() {
    return name;
  }

  public PieceColor getPieceColor() {
    return pieceColor;
  }

}
