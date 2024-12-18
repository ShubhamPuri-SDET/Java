import java.util.*;
import java.util.Map.Entry;

public class HashMapTest {
    public static void main(String[] args) {
     
        HashMap<String, Integer> nameage = new HashMap<>();

        nameage.put("John", 25);
        nameage.put("Jane", 30);
        nameage.put("Mike", 22);

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Add the data into the system: ");
//         System.out.print("Enter name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
//         sc.nextLine(); 

//     if (nameage.containsKey(name)) {
//         System.out.println("The name you have added already exists in the system with different age.");
//     } else {
//         nameage.put(name, age);
//         System.out.println("The data has been added successfully.");
// }

        for (String key : nameage.keySet()) {
            System.out.println(key + ": " + nameage.get(key));
        }

        for(Entry<String, Integer> e : nameage.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        Set <String> keys = nameage.keySet();
        for(String key: keys ){
            System.out.println(key + ": " + nameage.get(key));
        }
    }
}



/* class FrequencyCounter {
    public static void main(String[] args) {
        String str = "smbfgfidsfds";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequency of characters: " + frequencyMap);
    }
}
/*
public class Hashing {
    public static void main(String args[]) {
        //Creation
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);

        //Searching
        if(map.containsKey("Indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Indonesia")); //key doesn't exist 
        
        //Iteration (1)
        for( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
 
        //Iteration (2)
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }
            
        //Removing
       map.remove("China");
       System.out.println(map);
   }
}
*/