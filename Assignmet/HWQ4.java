//Q: Check for Uppercase & Lowercase

import java.util.Scanner;

public class HWQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word :");
        char word = input.next().trim().charAt(0);


        if (word >='a' && word <= 'z') {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
        
        /*
        if(word>='A' && word<='Z'){
            System.out.println("Uppercase");
            }

        else if(word>=1 && word<=9){
            System.out.println("Wrong keyword");
        }

        else{
            System.out.println("Lower case");
        }
        */
    }
}



