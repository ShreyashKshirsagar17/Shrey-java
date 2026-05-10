package MatrixRotation;

//Polymorphism Example in Java

class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}

public class new7 {
 public static void main(String[] args) {
     Animal a1 = new Dog();   // Upcasting
     Animal a2 = new Cat();   // Upcasting
     Animal a3 = new Animal();

     a1.sound();   // Dog barks
     a2.sound();   // Cat meows
     a3.sound();   // Animal makes a sound
 }
}
