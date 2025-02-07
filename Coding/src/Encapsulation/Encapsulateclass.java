package Encapsulation;

public class Encapsulateclass {
    private int age;
    private String name;


    public int getage(){
        return age;
    }


    public void setage(int abc){
        this.age = abc;
    }    
    
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name; // Correctly assigns the parameter to the instance variable
    }
}

public class ThisExample {
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