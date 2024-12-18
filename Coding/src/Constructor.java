public class Constructor {

    public static void main(String[] args) {

        Student test = new Student();
        test.greet("ABCSFD");
       test.data("abc", 23, "test"); 

    }
    
}

class Student{

    String names;
    int marks;
    String subjects;


    void data(String naam, int mark, String subject){

        this.names = naam;
        this.marks = mark;
        this.subjects = subject;

        System.out.println("Name: " + this.names + ", Marks: " + this.marks + ", Subjects: " + this.subjects);
    }

    void greet(String name){

        this.names = name;

        System.out.println("Hey there "+ name);
    }

}
