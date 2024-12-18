package OOPS;


class Base{

    String name;
    String city;
    int age;
}


class persondata extends Base{

    void rahul(String name, String city, int age){

        this.name = name;
        this.city = city;
        this.age = age;
    
    System.out.print("hello my nme is "+ name + "\nMy hometown is in " + city + "\nI am " + age + " old");}
}


class dyanmicpolymorphisam extends persondata{  
@Override
    void rahul(String name, String city, int age){

        // this.name = name;
        // this.city = city;
        // this.age = age;
    System.out.println(name + city + age);}
}

public class Polymorphisam2 {

    public static void main(String[] args) {
        persondata obj = new persondata();
        persondata obj2 = new persondata();
        obj2.rahul("test", "abc", 58);
        //obj.rahul("rahul","amaravati", 23);
    }
    
}

