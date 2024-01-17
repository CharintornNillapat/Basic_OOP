/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Eazymandiaz
 */
public class myna {
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
