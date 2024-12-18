//Q: Create a program to calculate the some of two numbers

import java.util.Scanner;

public class HWQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
    
}
