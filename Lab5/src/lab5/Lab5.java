/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Eazymandiaz
 */
public class Lab5 {
    public static void main(String[] args) {
        Bird b1 = new Bird("Big Eggo", Gender.MALE, 2);
        Bird b2 = new Bird("Tweety", Gender.MALE, 2);
        Bird b3 = new Bird("Olivia", Gender.FEMALE, 2);
        Bird b4 = new Bird("Kenny", Gender.FEMALE, 2);
        
        Bird c1 = b3.breed(b1);
        Bird c2 = b4.breed(b2); 
        Bird c3 = b2.breed(b3);
        // Bird c4 = c1.breed(b3); //นกเด็กไปที่จะผสมพันธุ์ไม่ได้ จะขึ้น error ต้องเพิ่มอายุก่อน
        
        
        c1.speak();
        c2.speak();
        c3.speak();
        
        b1.eat(120);
        b1.eat(1);
        c2.eat(200);
        
        c2.growUp(20);
        c2.speak();
        
        Bird c5 = c2.breed(b1);
        
        c5.growUp(2);
        c5.speak();
        
        
      
        
         
    
    
    
    
   
    
    
    }
}