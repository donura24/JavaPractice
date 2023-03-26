package JavaPractice.MortgageCalc;

import java.util.Scanner;

public class Main {
    private static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the term in years: ");
        int termInYears = scanner.nextInt();

        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
        int numberOfPayments = termInYears * MONTHS_IN_YEAR;

        double monthlyPayment =
    }
}
