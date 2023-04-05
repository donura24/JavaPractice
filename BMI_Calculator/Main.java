package JavaPractice.BMI_Calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight  = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        double bmi = weight / Math.pow(height, 2) * 703;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("Your BMI is:"+ df.format(bmi));
    }
}
