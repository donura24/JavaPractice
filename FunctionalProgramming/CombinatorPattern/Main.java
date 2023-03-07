package JavaPractice.FunctionalProgramming.CombinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(
                "Teo",
                "tedi@gmail.com",
                "+085437223",
                LocalDate.of(1999,3,23)
        );
        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isValid(customer1));
    }
}
