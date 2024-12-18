
public class Inheritance2 {

    public static void main(String[] args) {

    }        
}

    class Student{

        String names;
        int marks;
        String subjects;
        
    
    public void data(String naam, int mark, String subject){
            this.names = naam;
            this.marks = mark;
            this.subjects = subject;
    
            System.out.println("Name: " + this.names + ", Marks: " + this.marks + ", Subjects: " + this.subjects);
        }
    }

