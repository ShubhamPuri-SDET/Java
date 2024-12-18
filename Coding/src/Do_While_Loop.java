

import java.util.Scanner;

public class Do_While_Loop {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        do{
            System.out.println("Test ABC");
            n+=1;
        } while(n<=10);
    
    }
}
