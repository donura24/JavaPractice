package JavaPractice.Streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
// Declarative approach

        // Filter
        // Sort
        // All match
        // Any match
        // None match
        // Max
        // Min
        // Group

    }


    private static List<Person> getPeople(){
        return List.of(
          new Person("Han Asparuh",45,Gender.MALE),
          new Person("Baba Tonka",75,Gender.FEMALE),
          new Person("Vasil Levski",26,Gender.MALE),
          new Person("Stefan Stambolov",45,Gender.MALE),
          new Person("Tsar Petar I",60,Gender.MALE),
          new Person("Masha",10,Gender.FEMALE)
        );
    }
}
