class This_Keyword {
    
}
class ThisExample {
    int a;
    int b;

    ThisExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + this.a + ", b: " + this.b);
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10, 20);
        obj.display();
    }
}
public class ThisConstructorExample {
    int a;
    int b;

    ThisConstructorExample() {
        this(10, 20);
    }

    ThisConstructorExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        ThisConstructorExample obj = new ThisConstructorExample();
        obj.display();
    }
}