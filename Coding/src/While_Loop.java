import java.util.InputMismatchException;
import java.util.Scanner;

public class While_Loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        while (true) {
            try {
                System.out.print("Enter a number: ");
                i = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        while (i > 11) {
            System.out.println("Test abc");

            if (i < 100) {
                break;
            } else {
                System.out.print("Enter a new number: ");
                while (true) {
                    try {
                        i = sc.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        sc.next();
                    }
                }
            }
        }

    }

}
