package JavaPractice.FunctionalProgramming.CombinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(
                "Teo",
                "tedi@gmail.com",
                "+085437223",
                LocalDate.of(1999, 3, 23)
        );
        //CustomerValidatorService validatorService = new CustomerValidatorService();
        //System.out.println(validatorService.isValid(customer1));

        // Using combinator pattern

        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isDateOfBirth())
                .apply(customer1);
        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {
            throw new IllegalArgumentException();
        }
    }
}
