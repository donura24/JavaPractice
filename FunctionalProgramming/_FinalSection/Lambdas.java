package JavaPractice.FunctionalProgramming._FinalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> {
         //logic
            if (name.startsWith("T")) throw new IllegalArgumentException("Can't start with \"T\"");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> biFunction = (name, age) -> {
            //logic
            if (name.startsWith("T")) throw new IllegalArgumentException("Can't start with \"T\"");
            return name.toUpperCase() + age;
        };

        System.out.println(upperCaseName.apply("Geodor"));
        System.out.println(biFunction.apply("Geodor", 26));
    }
}
