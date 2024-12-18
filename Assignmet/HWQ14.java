//Q: Print Inverted Half Pyramid (Rotated by 180 degree)

import java.util.Scanner;

public class HWQ14 {

    public static void main(String[] args) {
        
        Scanner av = new Scanner(System.in);
        int a = av.nextInt();

        for(int i = 1; i<=a; i++){

            for(int j=1; j<=a-1; j++){

                System.out.print(" ");

            for(j=1; j<=1; j++){    

            System.out.print("*");
        } 
     } System.out.println();
    }
}
}