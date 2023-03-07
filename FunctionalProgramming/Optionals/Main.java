package JavaPractice.FunctionalProgramming.Optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<IllegalArgumentException> exceptionSupplier = () -> new IllegalArgumentException("exception");

//        Object o = Optional.ofNullable(null)
//                .orElseThrow(exceptionSupplier);

        Optional.ofNullable(null)
                //.ifPresent(name -> System.out.println("Your name is: " + name));
                .ifPresentOrElse(name -> System.out.println("Your name is: " + name),
                        () -> System.out.println("Please enter a name."));
    }
}
