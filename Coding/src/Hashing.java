
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet <String> test = new HashSet<>();
        test.add("Apple");
        test.add("banana");
        test.add("guava");
        test.add("apple");
        test.add("banana");

        System.out.println(test.size());

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the fruit element that want to search in data");
        // String inp = sc.next();

        // if(test.contains(inp)){
        //     System.out.println("It have an element");
        // }
        // if(!test.contains(inp)) {
        //     System.out.println("it doesn't contains the element");
        // }  

     
        Iterator it = test.iterator();

        while (it.hasNext()) { 
                System.out.println(it.next());      
        }
    }
}