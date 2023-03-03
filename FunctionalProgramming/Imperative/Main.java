package JavaPractice.FunctionalProgramming.Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static JavaPractice.FunctionalProgramming.Imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Teodor", Gender.MALE),
                new Person("Stefany", FEMALE),
                new Person("Andrey", Gender.MALE),
                new Person("Ivana", FEMALE)
        );

        System.out.println("Imperative approach"); // Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
                System.out.println(person);
            }
        }

        System.out.println("Declarative approach"); //Declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
