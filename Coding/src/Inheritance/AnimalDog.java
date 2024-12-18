package Inheritance;
/**
 * Represents a dog, a type of animal.
 */
public class AnimalDog extends Animal {

    /**
     * Constructs a new AnimalDog object.
     */
    public AnimalDog() {
        super();
    }

    /**
     * Makes the dog bark.
     */
    public void bark() {
        sound();
        System.out.println("The dog is barking. This sound was imported from the protected class.");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}