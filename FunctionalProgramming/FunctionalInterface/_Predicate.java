package JavaPractice.FunctionalProgramming.FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String phoneNumber1 = "07433345699";
        System.out.println(isPhoneNumberValid("08543323"));

        // Using Predicate
        System.out.println(isPhoneNumberValidPredicate.test("07943569691"));

        System.out.println("Phone number: " + phoneNumber1 + " valid and contains number 3: "
                + isPhoneNumberValidPredicate.and(containsNumber3).test(phoneNumber1));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
