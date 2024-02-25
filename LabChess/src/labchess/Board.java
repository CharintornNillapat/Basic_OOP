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
public class Board {
    public static final int BOARD_LENGTH = 8;
    Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];
    

public Board(){
    
    
}


public void displayBoard() {
       
        System.out.print(' ');
        for (int i = 0; i < BOARD_LENGTH; i++)
            
            System.out.print("  " + (char)(i + 'A')  + "");
            
        System.out.println();
        for (int j = 0; j < BOARD_LENGTH; j++) {
            
            System.out.print(8 - j);
            
            
           
            for (int k = 0; k < BOARD_LENGTH; k++)
                System.out.print("  -");
                System.out.println();
            
            
        }
        
    }
    
    
}

