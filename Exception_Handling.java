package JavaPractice;

import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter a whole number: ");
            int a = scanner.nextInt();
            System.out.println("Please, enter a whole number to divide by:");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by ZERO!");
            ;
        } catch (Exception e) {
            System.out.println("Please, try again!");
        } finally {
            System.out.println("This is a \"finally\" block.");
        }


    }
}
