package Interfaces;

public class D {

    public static interface nestedinterface{
        boolean isOdd(int num);
    }
}
class E implements D.nestedinterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) != 0;
    }
}

class main {

    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.isOdd(10)); // prints: false
    }
}