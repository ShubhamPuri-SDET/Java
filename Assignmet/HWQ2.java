//Q:2 Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

import java.util.Scanner;

public class HWQ2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the radium of circle");

        double AreaOfCircle = sc.nextDouble();

        System.out.println("The area of the cirlce with radius 5" + AreaOfCircle + " is " + 3.14*AreaOfCircle*AreaOfCircle);


    }
    
}
