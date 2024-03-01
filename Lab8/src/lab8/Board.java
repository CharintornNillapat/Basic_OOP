package lab8;

public class Board {
  Piece[][] squares = new Piece[8][8];

  public void placePiece() {
    //squares[0][0] = new Bishop("WB1", PieceColor.WHITE, 0, 0);
   // squares[1][1] = new Bishop("BB1", PieceColor.BLACK, 1, 1);
    //squares[2][2] = new Bishop("WB2", PieceColor.WHITE, 2, 2);
    //squares[3][3] = new Bishop("BB2", PieceColor.BLACK, 3, 3);
      //squares[1][1] = new Queen("WQ1", PieceColor.WHITE, 1,1);
      //squares[2][2] = new Rook("WR1", PieceColor.WHITE, 2,2);
    squares[1][0] = new Pawn("BP1", PieceColor.BLACK, 1,0);
    squares[1][1] = new Pawn("BP2", PieceColor.BLACK, 1,1);
    squares[1][2] = new Pawn("BP3", PieceColor.BLACK, 1,2);
    squares[1][3] = new Pawn("BP4", PieceColor.BLACK, 1,3);
    squares[1][4] = new Pawn("BP5", PieceColor.BLACK, 1,4);
    squares[1][5] = new Pawn("BP6", PieceColor.BLACK, 1,5);
    squares[1][6] = new Pawn("BP7", PieceColor.BLACK, 1,6);
    squares[1][7] = new Pawn("BP8", PieceColor.BLACK, 1,7);
    squares[6][0] = new Pawn("WP1", PieceColor.WHITE, 6,0);
    squares[6][1] = new Pawn("WP2", PieceColor.WHITE, 6,1);
    squares[6][2] = new Pawn("WP3", PieceColor.WHITE, 6,2);
    squares[6][3] = new Pawn("WP4", PieceColor.WHITE, 6,3);
    squares[6][4] = new Pawn("WP5", PieceColor.WHITE, 6,4);
    squares[6][5] = new Pawn("WP6", PieceColor.WHITE, 6,5);
    squares[6][6] = new Pawn("WP7", PieceColor.WHITE, 6,6);
    squares[6][7] = new Pawn("WP8", PieceColor.WHITE, 6,7);
    
    
    
    // Place other pieces as needed
  }

  public void displayBoard() {
    System.out.println("Display Board: ");
    System.out.println("      A      B      C      D      E      F      G      H");
    for (int i = 0; i < squares.length; i++) {
      System.out.print((8 - i) + " ");
      for (int j = 0; j < squares[i].length; j++) {
        if (squares[i][j] != null) {
          System.out.printf("  [%s]", squares[i][j].getName());
        } else {
          System.out.print("  [   ]");
        }
      }
      System.out.println();
    }
    System.out.println("      A      B      C      D      E      F      G      H");
  }

  public void moveBishop(String name, int tarRow, int tarCol) {
    char[] files = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
    System.out.println("Move " + name + " to " + files[tarCol] + (8 - tarRow)); // Convert to chess file and rank
                                                                                // notation
    boolean flag = false;
    for (int i = 0; i < squares.length; i++) {
      for (int j = 0; j < squares[i].length; j++) {
        if (squares[i][j] == null)
          continue;
        if (squares[i][j].getName().equals(name)) {
          flag = true;
          if (squares[i][j] instanceof Bishop) { // Check if it's a Bishop
            ((Bishop) squares[i][j]).move(this, tarRow, tarCol); // Call move method with tarRow and tarCol
          } else {
            System.out.println("Piece is not a Bishop and cannot be moved.");
          }
          break;
        }
      }
      if (flag)
        break;
    }

    if (!flag) {
      System.out.println("There is no piece named " + name);
    }
  }
  
    public void moveQueen(String name, int tarRow, int tarCol) {
    char[] files = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
    System.out.println("Move " + name + " to " + files[tarCol] + (8 - tarRow)); // Convert to chess file and rank
                                                                                // notation
    boolean flag = false;
    for (int i = 0; i < squares.length; i++) {
      for (int j = 0; j < squares[i].length; j++) {
        if (squares[i][j] == null)
          continue;
        if (squares[i][j].getName().equals(name)) {
          flag = true;
          if (squares[i][j] instanceof Queen) { // Check if it's a Queen
            ((Queen) squares[i][j]).move(this, tarRow, tarCol); // Call move method with tarRow and tarCol
          } else {
            System.out.println("Piece is not a Queen and cannot be moved.");
          }
          break;
        }
      }
      if (flag)
        break;
    }

    if (!flag) {
      System.out.println("There is no piece named " + name);
    }
  }
     public void moveRook(String name, int tarRow, int tarCol) {
    char[] files = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
    System.out.println("Move " + name + " to " + files[tarCol] + (8 - tarRow)); // Convert to chess file and rank
                                                                                // notation
    boolean flag = false;
    for (int i = 0; i < squares.length; i++) {
      for (int j = 0; j < squares[i].length; j++) {
        if (squares[i][j] == null)
          continue;
        if (squares[i][j].getName().equals(name)) {
          flag = true;
          if (squares[i][j] instanceof Rook) { // Check if it's a Queen
            ((Rook) squares[i][j]).move(this, tarRow, tarCol); // Call move method with tarRow and tarCol
          } else {
            System.out.println("Piece is not a Queen and cannot be moved.");
          }
          break;
        }
      }
      if (flag)
        break;
    }

    if (!flag) {
      System.out.println("There is no piece named " + name);
    }
  }
     public void movePawn(String name, int tarRow, int tarCol) {
    char[] files = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
    System.out.println("Move " + name + " to " + files[tarCol] + (8 - tarRow)); // Convert to chess file and rank
                                                                                // notation
    boolean flag = false;
    for (int i = 0; i < squares.length; i++) {
      for (int j = 0; j < squares[i].length; j++) {
        if (squares[i][j] == null)
          continue;
        if (squares[i][j].getName().equals(name)) {
          flag = true;
          if (squares[i][j] instanceof Pawn) { // Check if it's a Pawn
            ((Pawn) squares[i][j]).move(this, tarRow, tarCol); // Call move method with tarRow and tarCol
          } else {
            System.out.println("Piece is not a Pawn and cannot be moved.");
          }
          break;
        }
      }
      if (flag)
        break;
    }

    if (!flag) {
      System.out.println("There is no piece named " + name);
    }
  }

  public Piece[][] getSquares() {
    return squares;
  }

  public void setSquares(Piece[][] squares) {
    this.squares = squares;
  }

}
