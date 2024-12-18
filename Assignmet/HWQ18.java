// write a code to reverse the number

import java.util.Scanner;

import java.util.Scanner;

public class HWQ18 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        int a = sc.nextInt(); // Read an integer from the user

        int num =0; // Initialize a variable to store the reversed number

        while(a>0){ // Repeat until the input number is 0

            int rem = a%10; // Calculate the remainder of the input number when divided by 10
            a/=10; // Divide the input number by 10 to remove the last digit

            num = num*10+rem; // Append the last digit to the reversed number
        }

        System.out.println(num); // Print the reversed number
        
    }
}