/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labchess;

import static labchess.PieceColor.BLACK;
import static labchess.PieceColor.WHITE;
import labchess.Pieces.Bishop;

/**
 *
 * @author Eazymandiaz
 */
public class LabChess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();
        Piece a = new Bishop(BLACK,"BB");
        Piece b = new Bishop(WHITE,"BW");
        board.displayBoard();
        
        b.toString();
        
        
        
    }
    
}
