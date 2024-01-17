/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Eazymandiaz
 */
public class Lab4 {

    public static void main(String[] args) {
        GlassOfWater glass1 = new GlassOfWater(10, "First Glass");
        GlassOfWater glass2 = new GlassOfWater(15, "Second Glass");
        
        glass1.addWater(5000);
        glass2.addWater(5000);
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
       
        glass2.pourToGround(1);
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
        glass2.pourToOtherGlass(glass1, 10);
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
        glass1.pourAllIn(glass2);
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
        glass1.pourToEmpty();
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
        glass2.pourAllIn(glass1);
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
        glass1.addWater(5000);
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
        glass1.pourAllIn(glass2);
        glass1.displayWaterLevel();
        glass2.displayWaterLevel();
        
        
        
    }
    
}
