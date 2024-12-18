
import java.util.Scanner;


public class Constructor2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String inputname = sc.nextLine();
        System.out.println("Enter your age ");
       int inputage = sc.nextInt();

        greet test = new greet(inputname, inputage);

        //greet test = new greet();

        test.wish(inputname);

       // greet.test();

      
    }
}

class greet{
    String name;

    greet(String inputname, int age ) {

        name = inputname;
        age = age;
        
        System.out.println("Hello, how are you " + name + " your age is "+age);

    }

    void wish(String naam){
        name = naam;
        System.out.println("Hey there "+naam);
    }

    
}

        class Constructors{
            String name;
            int age;
        
            // Constructor with no parameters
            
            Constructors() {
                this.name = "Unknown";
                this.age = 0;
            }
        
            // Constructor with one parameter
            Constructors(String name) {
                this.name = name;
                this.age = 0;
            }
        
            // Constructor with two parameters
            Constructors(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

// class student{
//     String name;
//     int age;  
//     float marks;
    
//     // Creating the constructor 

//     student(){

//         this.name = "abc";
//         this.age = 54;
//         this.marks = 31;
//     }

//     void names(String newname){
//         name = newname;

//     }

//     void greeting(){

//         System.out.println("Hello, how are you " + name);
//     }
// }

  // student s1 = new student();
        // System.out.println(s1.age + s1.marks);

        // s1.names("shubham");
        // s1.greeting();


