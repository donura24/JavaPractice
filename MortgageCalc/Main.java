package JavaPractice.MortgageCalc;

import java.text.NumberFormat;
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

        double monthlyPayment = principal * (
                monthlyInterestRate * ((Math.pow(1+ monthlyInterestRate, numberOfPayments))
                ) / ((Math.pow(1+ monthlyInterestRate, numberOfPayments)) -1 ));
        System.out.println("monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
    }
}
