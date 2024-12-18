package OOPS;

import java.util.Scanner;

class Base {
    String name;
    String type;
    int leg;

    void Animal(String name) {
        this.name = name;
        System.out.println("Enter your animal name: " + name);
    }

    void Animaltype(String type) {
        this.type = type;
        System.out.println("Enter your Animal type: ex: herbivores, omnivores, and carnivore " + type);
    }

    void legs(int leg) {
        this.leg = leg;
        System.out.println("Enter your Animal walk on how many legs: " + leg);
    }
}

class dog extends Base {
    void Dogs() {
        if (type.equals("carnivore") && name.equals("dog") && leg == 4) {
            System.out.println("I am dog");
        } else {
            System.out.println("I am not dog");
        }
    }
    
    void Chicken (){
        
        if (type.equals("Omnivores") && name.equals("Chicken") && leg == 2) {
            System.out.println("I am Chicken");
        } else {
            System.out.println("I am not Chicken");
        }
    }
}

public class PracticeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dog myDog = new dog();

        System.out.print("Enter animal name: ");
        String name = sc.nextLine();
        myDog.Animal(name);

        System.out.print("Enter animal type: ");
        String type = sc.nextLine();
        myDog.Animaltype(type);

        System.out.print("Enter number of legs: ");
        int leg = sc.nextInt();
        myDog.legs(leg);

        myDog.Dogs();
    }
}