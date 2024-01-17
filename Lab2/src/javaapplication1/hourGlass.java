/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Eazymandiaz
 */
public class hourGlass {
    int pos1 = 1; // Top
    int pos2 = 2; // Right
    int pos3 = 3; // Bottom
    int pos4 = 4; // Left

    int flowRate = 1000;
    int sandA = 5000;
    int sandB = 6000;
    int middle;

    public void rotateRight90() {
        int temp = pos1;
        pos1 = pos4;
        pos4 = pos3;
        pos3 = pos2;
        pos2 = temp;
    }

    public void rotateRight180() {
        int temp1 = pos1;
        int temp2 = pos2;

        pos1 = pos3;
        pos2 = pos4;
        pos3 = temp1;
        pos4 = temp2;
    }

    public void displayHourglass() {
         System.out.println("Hourglass Position:");
         System.out.println("Pos1: " + (pos1 == 1 ? "Side A"  : (pos1 == 2 ?  "Middle"   : "Middle")) + " (Top)");
         System.out.println("Pos2: " + (pos2 == 2 ? "Middle"  : (pos2 == 3 ?  "Side B"   : "Side A")) + " (Right)");
         System.out.println("Pos3: " + (pos3 == 3 ? "Side B"  : (pos3 == 4 ?  "Middle"   : "Middle")) + " (Bottom)");
         System.out.println("Pos4: " + (pos4 == 4 ? "Middle"  : (pos4 == 1 ?  "Side A"   : "Side B")) + " (Left)");
         System.out.println("Sand in Side A: " + sandA + " units");
         System.out.println("Sand in Side B: " + sandB + " units");
    }

    public void flowAndRotation() {
        displayHourglass();

        // Flow sand to side B
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nFlowing sand to Side B...");
        while (sandA > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sandA -= flowRate;
            sandB += flowRate;
            displayHourglass();
        }

        // Rotate 90 degrees
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nRotating 90 degrees right...");
        rotateRight90();
        displayHourglass();

        // Rotate 180 degrees
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nRotating 180 degrees right...");
        rotateRight180();
        displayHourglass();
        
        
    }
}
