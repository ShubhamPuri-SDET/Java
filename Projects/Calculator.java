package Projects;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter operator -> '+'', '-'', '*'', '/' ");
    String operator = sc.nextLine();

    System.out.println("Enter input 1 ");
    int a = sc.nextInt();
    System.out.println("Enter input 2 ");
    int b = sc.nextInt();
    
    System.out.println("Your output is: ");

    switch (operator) {
        case "+" -> System.out.println(a+b);    
        case "-" -> System.out.println(a-b);
        case "*" -> System.out.println(a*b);
        case "/" -> System.out.println(a/b);
        default -> throw new AssertionError("You entered the wrong operator\ntry again with valid operator");
    }
}
    
}
