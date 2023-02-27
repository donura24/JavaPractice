package JavaPractice.Map_HashMap;

import java.util.HashMap;

public class Map_s {
    public static void main(String[] args) {

        HashMap<String, Integer> empIDs = new HashMap<>();

        empIDs.put("Teodor", 45829);
        empIDs.put("Andrey", 45123);
        empIDs.put("Tea", 45689);

        System.out.println(empIDs.get("Tea"));

        System.out.println(empIDs.containsKey("Teodor"));

        System.out.println(empIDs.containsValue(45123));

        empIDs.put("Teodor",12345); // will update and overwrite the current value
        empIDs.replace("John",23555);
        empIDs.putIfAbsent("John",23458);
        empIDs.remove("John");

        System.out.println(empIDs);
    }
}
