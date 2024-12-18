
// Implementing Cloneable Interface
class Person implements Cloneable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Overriding the clone method to clone this object
    @Override
    public Person clone() {
        try {
            // Create a shallow copy of this object
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

public class ObjectCloning {
    public static void main(String[] args) {
        // Creating a new Person object
        Person person1 = new Person("John", 25);

        // Cloning person1 into person2
        Person person2 = person1.clone();

        // Output the original and cloned objects
        System.out.println("Original Person: " + person1);
        System.out.println("Cloned Person: " + person2);

        // Modify the clone to show it's a separate object
        person2 = new Person("Alice", 30);
        System.out.println("After modification - Original: " + person1);
        System.out.println("After modification - Cloned: " + person2);
    }
}
