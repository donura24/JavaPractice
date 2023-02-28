package JavaPractice.Sets_Hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Teodor");
        names.add("Tea");
        names.add("Andrey");
        //names.add("Teodor"); // Sets do not allow duplicates
        names.remove("Teodor");

        System.out.println(names.size());
    }
}
