package Inheritance;

public class Animal {
    protected void sound() {
        System.out.println("The animal makes a sound.");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        animal.eat();
        animal.sleep();
    }
}