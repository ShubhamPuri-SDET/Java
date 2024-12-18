import java.util.Scanner;

public class Enhance_Switch_Statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");

        int num = sc.nextInt();

        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Workdays");
            
            case 6, 7 -> System.out.println("Weekends");

            default -> System.out.println( "Holiday" );

            // break; // Not necessary here but added to showcase a
                
        }
    }
}
