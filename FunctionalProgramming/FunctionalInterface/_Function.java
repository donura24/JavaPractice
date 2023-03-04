package JavaPractice.FunctionalProgramming.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function example - 1 argument
        int increment = increment(2);
        //System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(2);
        //System.out.println(increment2);

        int multiplyBy10 = multiplyBy10Function.apply(increment2);
        //System.out.println(multiplyBy10Function);

        Function<Integer, Integer> addByOnePlusMultiplyBy10Func = incrementByOneFunction.andThen(multiplyBy10Function);
        //System.out.println(addByOnePlusMultiplyBy10Func.apply(2));

        //BiFunction - 2 arguments
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));


    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number += 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int increment(int number) {
        return number += 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
