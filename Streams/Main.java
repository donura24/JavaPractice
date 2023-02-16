package JavaPractice.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
// Declarative approach

        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        //females.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
                .collect(Collectors.toList());
        //sorted.forEach(System.out::println);

        // All match
        boolean all = people.stream()
                .allMatch(person -> person.getAge() > 5);
        //System.out.println(all);

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 70);
        //System.out.println(anyMatch);

        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Tea"));
        //System.out.println(noneMatch);

        // Max
        /*people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);*/

        // Min
        /*people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);*/

        // Group
        Map<Gender, List<Person>> groupGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });
    }


    private static List<Person> getPeople() {
        return List.of(
                new Person("Han Asparuh", 45, Gender.MALE),
                new Person("Baba Tonka", 75, Gender.FEMALE),
                new Person("Vasil Levski", 26, Gender.MALE),
                new Person("Stefan Stambolov", 45, Gender.MALE),
                new Person("Tsar Petar I", 60, Gender.MALE),
                new Person("Masha", 10, Gender.FEMALE),
                new Person("Andrey", 1, Gender.MALE),
                new Person("Tea", 4, Gender.FEMALE)
        );
    }
}
