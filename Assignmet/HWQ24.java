
import java.util.Scanner;

//Write a code to print a remainder 


public class HWQ24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num: ");
        int a = sc.nextInt();
        System.out.println("enter second num: ");
        int b = sc.nextInt();

        int rem = a%b;

        System.out.println("The remainder is: "+rem);

    }
    
}
