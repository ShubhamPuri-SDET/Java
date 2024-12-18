
import java.util.Scanner;



public class Dynamic_Function {

    public static void main(String[] args) {
      
       System.out.println("Enter the two numbers");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(multi(a, b));

        //System.out.println(multi(2, 5));

        // Method_Creating abc = new Method_Creating();

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // abc.addition(a, b);
    }

    static int multi(int a, int b) {

        int multiplication = a * b;
        // System.out.println(multiplication);

        return multiplication;
    }

    /*  static int addition(int a, int b){

        int addition = a +b;
        return addition;

    }  */

}
