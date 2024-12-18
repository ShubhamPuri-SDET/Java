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
