import java.util.Scanner;

public class Switch_Statements {

    public static void main(String[] args) {

        Practice();

    }
        public static void Practice(){ 

            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
        switch (name) {
            case "a" -> System.out.println("test 1");

            case "b" -> System.out.println("test 2");

            default -> System.out.println("invalid input");
        }

        Scanner vs = new Scanner(System.in);
        int day = vs.nextInt();

        switch (day) {
            case 1-> System.out.println("Monday");
            case 3 -> System.out.println("Wed");
            default -> System.out.println("sunday");
        }
    }
}