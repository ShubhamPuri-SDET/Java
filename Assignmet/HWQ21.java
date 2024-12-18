//Q: Create a function to swap the value of two number

import java.util.Scanner;

public class HWQ21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num2: ");
        int num2 = sc.nextInt();

        swap_numbers(num1, num2);

    }

    static void swap_numbers(int num1, int num2) {

        System.out.println("Before Swapping :");
        System.out.print("num1 = " + num1);
        System.out.print(", num2 = " + num2);

        int temp = num1;

        System.out.println("\nAfter Swapping : ");
        num1 = num2;
        num2 = temp;
        System.out.print("num1 = " + num1);
        System.out.print(", num2 = " + num2);

    }

}
