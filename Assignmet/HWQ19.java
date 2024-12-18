//Q: write the calculator program, run the program until user press 'x' or 'X'

import java.util.Scanner;

public class HWQ19 { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter the operator: ");

        char op;
       // op = sc.next().charAt(0);

        int ans = 0;

        while (true) {

            System.out.println("Enter the operator: ");
            op = sc.next().charAt(0);

            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            // if (op =='+' || op == '-' || op == '*' || op == '/') {
                
            // }        

            if (op == '+') {
                System.out.println(ans = a+b);      
            }
            else if  (op == '-') {
                System.out.println(ans = a-b);    
            }   

            else if  (op == '*') {
                System.out.println(ans = a*b);
            }
            else if (op == '/'){
                System.out.println(ans = a/b);    
            }
            else{
                System.out.println("Invalid input: "+ op);
                break;
            }//System.out.println(ans);
        } //System.out.println(ans);
    }  
}
