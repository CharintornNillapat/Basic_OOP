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
public class Myna {
    String name;
    int age;
    int bodyWeight = 120;
    int stomachWeight = 0;
    int overallWeight = bodyWeight + stomachWeight;

    public void init(String Iname, int Iage) {
        name = Iname;
        age = Iage;
    }

    public void speak() {
        System.out.println("I'm " + age + " years old");
    }

    public void speak(String word) {
        if (word != null) {
            System.out.println(name + ": " + word);
        }
    }

    public void eat(int dish) {
        stomachWeight += dish;
        if (stomachWeight < bodyWeight) {
            overallWeight = bodyWeight + stomachWeight;
            System.out.println("I ate " + dish + " grams of food");
            System.out.println("My weight is now " + overallWeight + " g");
            
        } else {
            System.out.println("You gave me too much food");
            excrete(stomachWeight);
        }
    }

    public void excrete(int exd) {
        stomachWeight -= exd;
        overallWeight = bodyWeight + stomachWeight;
        System.out.println("Excrete : " + exd + " grams");
        System.out.println("My weight is now " + overallWeight + " grams");
    }
}
