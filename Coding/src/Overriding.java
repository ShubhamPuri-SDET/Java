

class Animal {
    // Method in the superclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Overriding {
    public static void main(String[] args) {

        Animal animal1 = new Dog(); // Dog object is assigned to Animal reference
        Animal animal2 = new Cat(); // Cat object is assigned to Animal reference

        animal1.sound(); // Outputs: Dog barks
        animal2.sound(); // Outputs: Cat meows
    }
}
