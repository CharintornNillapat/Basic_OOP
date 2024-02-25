package lab7;

import java.util.HashMap;
import java.util.Map;

public class Board {

  private static boolean isValidLocation(File file, int rank) {
    return file.ordinal() >= 0 && file.ordinal() < 8 && rank >= 1 && rank <= 8;
  }

  public static final int BOARD_LENGTH = 8;
  Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];
  private final Map<Location, Square> locationSquareMap;

  public Board() {

    locationSquareMap = new HashMap<>();
    for (int i = 0; i < boardSquares.length; i++) {
      int column = 0;
      SquareColor currentColor = (i % 2 == 0) ? SquareColor.LIGHT : SquareColor.DARK;
      for (File file : File.values()) {
        Square newSquare = new Square(currentColor, new Location(file, BOARD_LENGTH - i));
        locationSquareMap.put(newSquare.getLocation(), newSquare);

        boardSquares[i][column] = newSquare;
        currentColor = (currentColor == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;
        column++;
        
        
        
      }
    }
  }

  public void placePiece(Piece piece, File file, int rank) {
      
    // Check if location is valid
    if (!isValidLocation(file, rank)) {
      throw new IllegalArgumentException("Invalid location: " + file + rank);
    }

    // Get the corresponding Square object from the board array
    Square square = boardSquares[BOARD_LENGTH - rank][file.ordinal()];
    
    if (square.isOccupied()) {
      throw new IllegalStateException("Square already occupied: " + square.getLocation());
    }

    // Place the piece on the square and set its current square
    square.setCurrentPiece(piece); // Set the current piece for the square
    piece.setCurrentSquare(square); // Set the current square for the piece
    System.out.println("move " + piece.getName() + " at location: " + file + rank);
   
    
    
    
  }

  public Map<Location, Square> getLocationSquareMap() {
    return locationSquareMap;
    
  }

  public void printBoard() {
    for (int i = 0; i < boardSquares.length; i++) {
      System.out.print(BOARD_LENGTH - i + " ");
      for (int j = 0; j < boardSquares[i].length; j++) {
        if (boardSquares[i][j].isOccupied()) {
          Figure piece = boardSquares[i][j].getCurrentPiece();
          // เเสดงผลตัวอักษรเเรกของชื่อ
          System.out.print(piece.getName().charAt(0) + " ");
        } else {
          System.out.print("- ");
        }
      }
      System.out.println();
    }
    System.out.print("  ");
    for (File file : File.values()) {
      System.out.print(file.name() + " ");
    }
    System.out.println();
    System.out.println();
  }

  public Square getSquare(File file, int rank) {
    // Ensure the file and rank are within the bounds of the board
    if (file.ordinal() >= 0 && file.ordinal() < BOARD_LENGTH && rank >= 1 && rank <= BOARD_LENGTH) {
      return boardSquares[BOARD_LENGTH - rank][file.ordinal()];
    } else {
      throw new IllegalArgumentException("Invalid file or rank: " + file + ", " + rank);
    }
  }
  
  public static void freeMove(Board board, Piece piece, File file, int rank) {
    // Check if the destination location is valid
    if (isValidLocation(file, rank)) {
      Square destinationSquare = board.getSquare(file, rank); // Retrieve the destination square

      // Check if the destination square is occupied by a piece of different color
      if (destinationSquare.isOccupied()
          && destinationSquare.getCurrentPiece().getPieceColor() != piece.getPieceColor()) {
        // Capture the piece by removing it from the board
        destinationSquare.reset();
        System.out.println("Piece captured!");
      }

      // Reset the square where the piece was originally located
      Square originalSquare = piece.getCurrentSquare();
      originalSquare.reset();

      
      board.placePiece(piece, file, rank);
      
    } else {
      System.out.println("Invalid move!");
    }
  }
}