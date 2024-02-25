/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labchess;

/**
 *
 * @author Eazymandiaz
 */
public abstract class Piece {
   protected String name;
   protected PieceColor pieceColor;
 
   
   public Piece(PieceColor pieceColor){
       this.pieceColor = pieceColor;
   }

    public String getName() {
        return name;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    
   @Override
    public String toString() {
        return "Piece{" + "name=" + name + ", pieceColor=" + pieceColor + '}';
    }

    

   

   
   
    
    
    
    
    
}

   
