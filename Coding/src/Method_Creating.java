import java.util.Scanner;

public class Method_Creating {
    public static void main(String args[]) {

         String abc = name();
         System.out.println(abc);

        greeting();

        //sum();
      //  addition(10, 25);
    }
    public void sum() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of two numbers = " + sum);
    }

    static void greeting() {
        System.out.println("How are you?");
    }

    static String name() {
        String wish = "hey there";
        return wish;
        // System.out.println("Hey there :");
    }

    public void addition(int a, int b) {

        int add = a + b;
        System.out.println("Addition of two numbers is " + add);
    }

   
}
