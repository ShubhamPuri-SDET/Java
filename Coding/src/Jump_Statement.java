public class Jump_Statement {

    public static void main(String[] args) {
        // Example of a jump statement: break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Iteration: " + i);
        }

        // Example of a jump statement: continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Iteration: " + i);
        }

        // Example of a jump statement: return
        // int result = calculateResult();
        // System.out.println("Result: " + result);
    }

    // public static int calculateResult() {
    //     return 10;
    // }
}      
