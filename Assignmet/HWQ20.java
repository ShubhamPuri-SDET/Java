// Q:8 [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:]

import java.util.Scanner;

public class HWQ20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks for subject 1: ");
        int c = sc.nextInt();

        System.out.print("Enter the marks for subject 2: ");
        int d = sc.nextInt();

        int a = (c + d) / 2; // average of two subjects

        String grade;

        if (a >= 91 && a <= 100) {
            grade = "AA";

        } else if (a >= 81 && a < 91) {
            grade = "AB";
        } else if (a >= 71 && a < 80) {
            grade = "BB";
        } else if (a >= 81 && a < 60) {
            grade = "BC";
        } else if (a >= 61 && a < 50) {
            grade = "CD";
        } else if (a >= 51 && a < 40) {
            grade = "DD";
        } /*
           * else if (d > 100 && d < 0 || c > 100 && c < 0 || a > 100 && a < 0) {
           * // grade = "Invalid input"; }
           */
        else {
            grade = "FF";
        }
        System.out.println("Your total marks is " + a + " and your grade is " + grade);

        switch (grade) {
            case "AA" -> System.out.println("Excellent!!!");

            case "AB" -> System.out.println("Well done");

            case "BB" -> System.out.println("Good job");

            case "BC" -> System.out.println("Not bad");

            case "CD" -> System.out.println("You Passed");

            case "DD" -> System.out.println("Need to improve");

            case "FF" -> System.out.println("Failed");

            default -> System.out.println("Invalid Input\nPlease enter valid marks");
        }

    }

}
