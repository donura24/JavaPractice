package JavaPractice.FunctionalProgramming.Imperative;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Teodor", Gender.MALE),
                new Person("Stefany", Gender.FEMALE),
                new Person("Andrey", Gender.MALE),
                new Person("Ivana", Gender.FEMALE)
        );
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
