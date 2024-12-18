//Q: Print sum of first n natural numbers

import java.util.Scanner;

public class HWQ6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;

        for(int n=0; n<=a; n++){
            sum = sum + n;
        }
        System.out.println(sum);
    }
    
}
