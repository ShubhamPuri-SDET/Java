//Q:3 Make a program that prints the table of a number that is input by the user. 

import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number a: ");

        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("A is less than B");
        }

        else {
            System.out.println("A is equal to B");
        }

    }

}

// if (name.equals("a")) {
// System.out.println("test 1");
// } else if (name.equals("b")) {
// System.out.println("test 2");
// } else {
// System.out.println("invalid input");
// }

        
