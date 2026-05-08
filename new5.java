package MatrixRotation;

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class new5 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
