package JavaPractice.Sets_Hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Teodor");
        names.add("Tea");
        names.add("Andrey");
        //names.add("Teodor"); // Sets do not allow duplicates
        names.remove("Teodor");
        //names.clear();


        //System.out.println(names.contains("Teodor"));

//        for (String name : names){
//            System.out.println(name);
//        }
        //names.forEach(System.out::println);

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
// Using sets -
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        Set<Integer> numSet = new HashSet<>();
        numSet.addAll(numberList);
        System.out.println(numSet);

        //Set<String> name = new TreeSet<>();
        //Set<String> name = new LinkedHashSet<>();
    }
}
