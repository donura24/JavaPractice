package JavaPractice.FunctionalProgramming._FinalSection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Teo", null , value -> {
            System.out.println("no lastName provided for " + value);
        });

    }
    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
