package OOPS;


class compiletime{

    void abc (int a){

        System.out.println("This is Compile time polymorphisam");
        System.out.println(a);
    }

    void def (int a, int b){

        System.out.println("This is known as the compile time polymorphisam");
        System.out.println(a+b);
    }
}

public class Polymorphisam {

    public static void main(String[] args) {
        compiletime obj = new compiletime();

        obj.abc(45);
        obj.def(52,85);
    }    
}


/*
 * Polymorphism is one of the core concepts of Object-Oriented Programming (OOP), along with inheritance, abstraction, and encapsulation. The word "polymorphism" comes from Greek, meaning "many shapes" or "many forms." In Java, polymorphism allows one object to take on multiple forms, which is essential for writing flexible and reusable code.

Types of Polymorphism in Java:
Compile-Time Polymorphism (Static Polymorphism):

Also known as method overloading.
It occurs when multiple methods in the same class have the same name but different parameter lists (either in number, type, or both).
The method to be called is determined at compile-time.
It's achieved through method overloading and constructor overloading
 */