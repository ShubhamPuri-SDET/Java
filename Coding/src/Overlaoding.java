
import java.util.Scanner;

class mathcal{

    int a;
    int b;
    int c;
    int d;

    void math (int a, int b){
        System.out.println("The addition is "+ (a+b));
    } 

    void math(int a, int b, int c){
        System.out.println("The multi of numbers is "+(a*b) );
    }

    void math(int a, int b, int c, int d){
        System.out.println("The substract of numbers is "+ (a-b));
    }
}

public class Overlaoding {
    public static void main(String[] args) {

        mathcal obj = new mathcal();
        Scanner sc = new Scanner(System.in);       
        System.out.println("Enter the required calculation (+, -, *, /): ");
        String math = sc.next();
        System.out.println("Enter numbers");

        if (math.equals("+")) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            obj.math(a, b);
        } else if (math.equals("*")) {
            System.out.println("Enter three numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            obj.math(a, b, c);
        } else if (math.equals("-")) {
            System.out.println("Enter four numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            obj.math(a, b, c, d);
        } else {
            System.out.println("Wrong input ");
        }
    }
}