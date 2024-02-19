/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Random; //เอามาสุ่มเพศลูกนก

enum Gender {MALE, FEMALE}

public class Bird {
  private String name;
  private int age;
  private Gender gender;
  int bodyWeight = 120; 
  int stomachWeight = 0;
  

  public Bird(String name, Gender gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    
    
  }
  public void eat(int food) {
    if (food <= 0) {
        throw new IllegalArgumentException("Food amount must be positive."+ " (" + getName() + ")" ); // เช็คความถูกต้องของการใส่ค่าอาหาร
    }

    stomachWeight += food;
 
    if (stomachWeight > bodyWeight) {
        
        System.out.println("I ate " + food + " grams of food."+ " (" + getName() + ")"); //ผมเลือกที่จะเพิ่มการเเสดงผลชื่อในทุกคำสั่งที่มีการเเสดงค่าออกมาจะได้ไม่สับสน
        System.out.println("You gave me too much food."+ " (" + getName() + ")");
        int excess = stomachWeight;
        stomachWeight = 0;
        System.out.println("Excreted " + excess + " grams of food."+ " (" + getName() + ")");
        System.out.println("My weight is now " + getOverallWeight() + " grams."+ " (" + getName() + ")");
    } else {
        System.out.println("I ate " + food + " grams of food."+ " (" + getName() + ")");
        System.out.println("My weight is now " + getOverallWeight() + " grams."+ " (" + getName() + ")");
    }
    
}
 public void excrete(int waste) {
    if (waste <= 0) {
        throw new IllegalArgumentException("Waste amount must be positive."+ " (" + getName() + ")"); // เช็คความถูกต้องของการใส่ค่าว่านกจะถ่ายเท่าไหร่
    }

    if (waste > stomachWeight) {
        System.out.println("You cannot excrete more than you have in your stomach."+ " (" + getName() + ")");
        excrete(stomachWeight); //ถ่ายอาหารในท้องออกมาทั้งหมด
        stomachWeight = 0;
    } else {
        stomachWeight -= waste;
        getOverallWeight(); //เรียก method เพื่อจะอัปเดตค่า overallWeight
        System.out.println("Excreted: " + waste + " grams."+ " (" + getName() + ")");
        System.out.println("My weight is now " + getOverallWeight() + " grams."+ " (" + getName() + ")");
    }
}
  public void speak() { //ถ้าไม่ได้ใส่อะไรนกจะบอกอายุตัวเอง
    System.out.println("I'm " + age + " years old"+ " (" + getName() + ")");
  }

  public void speak(String word) {
    if (word != null) {
      System.out.println(name + ": " + word);
    }
  }
  
  public int getOverallWeight() {
    return bodyWeight + stomachWeight;
}
public Bird breed(Bird partner) { //เรียกผสมพันธุ์
     System.out.println(this.getName() +  " is attempting to breed with " + partner.getName() + ".");
    if (this.gender == partner.gender) {
        throw new IllegalArgumentException("Birds must be different genders to breed"); //ถ้าเพศเดียวกันจะขึ้น error ผสมพันธุ์ไม่ได้
    }

    
   if (age==0) {
            throw new IllegalStateException("This bird is not yet able to breed."); //นกเกิดใหม่ยังผสมพันธุ์ไม่ได้
        }
    
    Bird child = new Child(this, partner);
    
    System.out.println("Child name: " + child.getName() + " Gender: " + child.getGender());
    return child;
}

 public String getName() {
  return this.name;
 }
 class Child extends Bird {
 private Bird parent1;
 private Bird parent2;

 public Child(Bird parent1, Bird parent2) {
  super(generateChildName(parent1, parent2), determineChildGender(), 0);
  this.parent1 = parent1;
  this.parent2 = parent2;
   
 }
}
 private static String generateChildName(Bird parent1, Bird parent2) { //ตั้งชื่อลูก
 String firstLetter = String.valueOf(Character.toUpperCase(parent1.getName().charAt(0)));
 String secondLetter = String.valueOf(Character.toUpperCase(parent2.getName().charAt(0)));

 return firstLetter + secondLetter;
}
  private static Gender determineChildGender(){ //สุ่มเพศลูกนก
  Random random = new Random();
  return random.nextBoolean() ? Gender.MALE : Gender.FEMALE;
 }
  
  public void growUp(int newAge) { //เพิ่มอายุนก
    if (newAge < 0) {
        throw new IllegalArgumentException("Age cannot be negative.");
    }
        this.age = newAge;
        System.out.println("The bird's age is now set to " + this.age + " years old.");
    }

  
  public Gender getGender() {
    return gender;
}
}
 

 

    








