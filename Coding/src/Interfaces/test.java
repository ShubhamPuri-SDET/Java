package Interfaces;
public class test extends E implements A, B, C{

    @Override
    public void C() {
        // TODO Auto-generated method stub
          System.out.println("Unimplemented method 'C'");
    }

    @Override
    public void B() {
        // TODO Auto-generated method stub
       System.out.println("Unimplemented method 'B'");
    }

    @Override
    public void A() {
        // TODO Auto-generated method stub
          System.out.println("Unimplemented method 'A'");
    }
}

class testclass{
    public static void main(String[] args) {
        
        test obj = new test();
        obj.A();
        obj.B();

    }
}