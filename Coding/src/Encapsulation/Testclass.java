package Encapsulation;

import java.util.Scanner;

public class Testclass {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Encapsulateclass obj = new Encapsulateclass();

        // Setting the age using the setter method
        System.out.print("Enter age: ");
        int a = sc.nextInt();  // Corrected: Added semicolon here
        obj.setage(a);

        // Getting the age using the getter method
        System.out.println("Age: " + obj.getage());

        // Optionally, setting and getting the name
        obj.setName("John Doe");
        System.out.println("Name: " + obj.getName());
    }
}
