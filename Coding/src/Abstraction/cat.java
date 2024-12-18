package Abstraction;

public class cat extends animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
    

    void animal(){
        System.out.println("This might be the cat");
    }
}
