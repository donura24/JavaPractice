package JavaPractice.FunctionalProgramming.FunctionalInterface;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(2);
        System.out.println(increment);

        Function<Integer, Integer> incrementByOne = number -> number+=1;

        int increment2 = incrementByOne.apply(2);
        System.out.println(increment2);

    }



    static int increment(int number) {
        return number += 1;
    }
}
