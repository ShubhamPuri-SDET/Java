//Q: Write a code to print the "*" butterfly pattern.

import java.util.Scanner;

public class HWQ17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        while (queries-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            printButterflyPattern(n, m, k);
        }

        scanner.close();
    }

    public static void printButterflyPattern(int n, int m, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < k || i >= n - k) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}