//Q: print the remainder

import java.util.Scanner;

public class HWQ9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count occurrences: ");
        int numberToFind = scanner.nextInt();

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        int count = 0;
        int i = 0;
        System.out.println("Enter " + n + " elements:");
        while (n>0) {
            int num = n%10;
            if (num == n) {
                count++;
            }
            n = n/10;
        }

        System.out.println("Number of occurrences of " + numberToFind + " in the list: " + count);

        System.out.println(count);

        scanner.close();
    }
}

    
/*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        while (n>0){

            int rem = n%10;
            count++;          
        }
        n = n/10;
    }   
    
    System.out.println(count);   

    */
