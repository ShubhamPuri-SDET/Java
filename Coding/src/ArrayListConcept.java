import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {
        
        ArrayList<Integer> data = new ArrayList<>();

        //Adding the data into the arrays..

        data.add(1);
        data.add(2);
        data.add(3);
        System.out.println(data);


        //Adding the data inbetween the elements

        data.add(0, 0);
        data.add(2, 5);
        System.out.println(data);


        //Get element

        int element = data.get(3);
        System.out.println(element);


        //Set value of index

        data.set(0, 3);
        System.out.println(data);


        //Removing the element in Arraylist

        data.remove(3);
        System.out.println(data);

        //Print Size of arraylist

        System.out.println(data.size());


        //Printing the array data by using the Forloop

        for(int i =0; i<data.size(); i++){
            System.out.println(data.get(i));
        }


    
    }
    
}
