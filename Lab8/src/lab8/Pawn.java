package lab8;

public class Pawn extends Piece {
    private boolean isFirstMove;
    private boolean isFirstPosition;

    public Pawn(String name, PieceColor pieceColor, int currentRow, int currentCol) {
        super(name, pieceColor, currentRow, currentCol);
        isFirstMove = true;
        isFirstPosition = true;
    }

    public void move(Board board, int tarRow, int tarCol) {
        Piece[][] squares = board.getSquares();
        int boardSize = squares.length;

        // Store initial position if it's the first move
        if (isFirstPosition) {
            int initialRow = getCurrentRow();
            int initialCol = getCurrentCol();
            isFirstPosition = false;

            // Check for valid starting positions for pawns
            if ((pieceColor == PieceColor.BLACK && initialRow != 1) ||
                (pieceColor == PieceColor.WHITE && initialRow != 6)) {
                System.out.println(name + " must start at the correct row");
                return;
            }
        }

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

        // Check for valid movement
        int rowDifference = tarRow - curRow;
        int colDifference = Math.abs(tarCol - curCol);

        if (pieceColor == PieceColor.WHITE && rowDifference > 0) {
            System.out.println("Invalid move for white pawn");
            return;
        }

        if (pieceColor == PieceColor.BLACK && rowDifference < 0) {
            System.out.println("Invalid move for black pawn");
            return;
        }

        if (isFirstMove && Math.abs(rowDifference) == 2 && colDifference == 0) {
            if (squares[tarRow][tarCol] != null) {
                System.out.println("There's a piece blocking the path");
                return;
            }
            isFirstMove = false;
        } else if ((Math.abs(rowDifference) != 1 || colDifference > 1) && !(rowDifference == 1 && colDifference == 1 && squares[tarRow][tarCol] != null)) {
            System.out.println("Invalid move");
            return;
        }

        // Check for pieces blocking the path
        if (squares[tarRow][tarCol] != null && (colDifference == 1 && rowDifference == 1)) {
            // Diagonal movement to capture a piece
            if (squares[tarRow][tarCol].getPieceColor() == pieceColor) {
                System.out.println("This position is already occupied by the same side");
                return;
            } else {
                System.out.println(squares[tarRow][tarCol].getName() + " got captured");
                squares[tarRow][tarCol] = null; // Remove captured piece from the board
            }
        }

        // Move the piece
        squares[curRow][curCol] = null;
        squares[tarRow][tarCol] = this;
        setCurrentRow(tarRow); // Update currentRow
        setCurrentCol(tarCol); // Update currentCol
    }
}

