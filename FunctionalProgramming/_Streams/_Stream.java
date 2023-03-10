package JavaPractice.FunctionalProgramming._Streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static JavaPractice.FunctionalProgramming._Streams._Stream.Gender.FEMALE;
import static JavaPractice.FunctionalProgramming._Streams._Stream.Gender.MALE;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Teodor", MALE),
                new Person("Stefani", FEMALE),
                new Person("Andrey", MALE),
                new Person("Ivana", FEMALE)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(name -> name.length())
//                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales );

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
