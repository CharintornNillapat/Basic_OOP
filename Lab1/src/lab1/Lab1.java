/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Eazymandiaz
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
    {
        Myna Jooggru = new Myna();
        Jooggru.init("Jooggru", 3);
        Jooggru.eat(30);
        Jooggru.eat(120);
        Jooggru.speak();
        Jooggru.speak("Hello");
        Jooggru.eat(100);
        Jooggru.excrete(100);  // Pass the weight value to excrete
    }
}
