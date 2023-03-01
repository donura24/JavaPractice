package JavaPractice;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        // Area = pi * r^2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Area of the circle is " + Math.PI * Math.pow(radius, 2));

    }
}
