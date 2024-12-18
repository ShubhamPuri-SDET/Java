import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values ");
        int a;
        int b;
        String p;

        while(true){

        try{
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Enter operator -> '+'', '-'', '*'', '/' ");
            p = sc.next();

            switch (p) {
                case "+" -> System.out.println(a+b);
                case "-" -> System.out.println(a-b);
                case "*" -> System.out.println(a*b);
                case "/" -> System.out.println(a/b);
 
                default -> throw new AssertionError("Invalid operator Entered");
            }
        }
        catch(
            ArithmeticException e){
            System.out.println("You can't divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a number.");
        }
        finally{
            System.out.println("Thank you for using this calulcator program ");
            sc.close();
        }
    }
}
}