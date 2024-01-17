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
public class GlassOfWater {
    private int capacity;
    private int waterLevel;
    private String name; 
    

    public GlassOfWater(int capacity, String name) {
        this.capacity = capacity;
        this.waterLevel = 0;
        this.name = name;
        
    }

    public int getCapacity() {
        return capacity;
    }
    public void displayWaterLevel() { //เเสดงผลของปริมาณน้ำในเเก้ว
        System.out.println("Water level in the " + name + " " + waterLevel + "/" + capacity + " units.");
    
}
    public void pourToEmpty() { //เทหมดเเก้ว
        if (waterLevel > 0) {
            System.out.println("Pouring water in " + name + " to the ground " + waterLevel + " unit. ");
            waterLevel = 0;
        }else{
            System.out.println(name + " is already empty. ");
        }
    }
    public void pourToGround(int pour) { //เทลงพื้น(ระบุจำนวน)
        if (waterLevel > 0) {
            System.out.println("Pouring water in " + name + " to the ground " + pour + " unit. ");
            waterLevel -= pour;
        }else{
            System.out.println(name + " is empty. ");
        }
    }

    public void addWater(int amount) { //ระบุจำนวนน้ำ
    if (amount >= 0) {
        int actualAdded = Math.min(amount, capacity - waterLevel); // ดักน้ำล้น
        int overflow = amount - actualAdded;

        waterLevel += actualAdded;

        if (overflow > 0) {
            System.out.println("Add " + amount + " unit of water in " + name + ".");
            System.out.println("Overflowed " + overflow + " units of water in " + name + "." );
        }else
            System.out.println("Add " + amount + " unit of water in " + name + ".");

        
        
    } else{
        System.out.println("Invalid amount. Please add a valid amount of water.");
    }
}

    public void pourToOtherGlass(GlassOfWater otherGlass, int amountToPour) { //เทน้ำจากอีกเเก้วสู่อีกเเก้ว
    if (waterLevel > 0 && amountToPour > 0) { // เช็คความถูกต้อง
        int pourAmount = Math.min(amountToPour, waterLevel);
        int actualPour = Math.min(pourAmount, otherGlass.capacity - otherGlass.waterLevel); // ดักน้ำล้น
        int overflow = pourAmount - actualPour; 
        waterLevel -= actualPour;
        otherGlass.waterLevel += actualPour;
       
        if (overflow > 0) {
            System.out.println("Poured " + pourAmount + " units of water from " + name + " to " + otherGlass.name + ".");
            System.out.println("Overflowed " + overflow + " units of water.");
            waterLevel -= overflow;
        }else
            System.out.println("Poured " + pourAmount + " units of water from " + name + " to " + otherGlass.name + ".");

        
    } else {
        System.out.println("there is no water in " + name);
    }
}
  

    public void pourAllIn(GlassOfWater otherGlass) { //เทหมดเเก้วใส่อีกเเก้ว
        if (waterLevel > 0) {
            int pourAmount = waterLevel; // เทตามจำนวนน้ำที่เหลืออยู่ในเเก้วหลัก
            int overflow = Math.max(0, pourAmount - otherGlass.capacity + otherGlass.waterLevel);
            pourAmount -= overflow;

            waterLevel -= pourAmount;
            otherGlass.waterLevel += pourAmount;
            
            if (overflow > 0) {
                System.out.println("Pour all of the water in " + name + " into "+ otherGlass.name + " " + pourAmount + " unit.");
                System.out.println("Overflowed " + overflow + " units of water.");
                waterLevel = 0;
            }else
               System.out.println("Pour all of the water in " + name + " into "+ otherGlass.name + " " + pourAmount + " unit.");


        } else {
            System.out.println("There is no water in " + name + " to pour.");
        }
    }

   
   }

