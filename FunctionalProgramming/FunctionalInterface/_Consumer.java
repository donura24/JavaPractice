package JavaPractice.FunctionalProgramming.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Teo", "088888812");
        // Normal Java function
        // greetCustomer(cus1);

        // Consumer functional interface
        greetCustomerConsumer.accept(cus1);
        greetCustomerBiConsumer.accept(cus1,false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPN) ->
            System.out.println("Hello " + customer.customerName
                    + ", you registered phone number: "
                    + (showPN ? customer.customerPhoneNumber : "**********"));
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + ", you registered phone number: "
                    + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", you registered phone number: "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
