package JavaPractice.FunctionalProgramming.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static JavaPractice.FunctionalProgramming.CombinatorPattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@")
                ? SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().contains("+0")
                ? SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isDateOfBirth() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16
                ? SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {

            ValidationResult validationResult = this.apply(customer);
            return validationResult.equals(SUCCESS) ? other.apply(customer) : validationResult;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
