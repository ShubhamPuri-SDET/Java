package OOPS;
import java.util.Scanner;
class Base {

    void abc(String name){

        System.out.println("Hey there, My name is " + name);
    }
}

class ages extends Base{
    void age (int age){
        System.out.println("I am " + age + " years old");
    }
}


class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name and Age");

        ages Inheritance = new ages();
        String name = sc.next();
        int age = sc.nextInt();

        Inheritance.abc(name);
        Inheritance.age(25);

        System.out.println();
    }
}


/*
 * When a class inherits another class, it is known as a single inheritance. 
 */