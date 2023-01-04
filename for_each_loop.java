package JavaPractice;

import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {
        /*
        String[] dogs = {"Alabai", "BelgianShepherd", "Collie"};

        for (String i : dogs) {
            System.out.println(i);
        }
         */

        ArrayList<String> dogs = new ArrayList<String>();

        dogs.add("Dog1");
        dogs.add("Dog2");
        dogs.add("Dog3");

        for (String i : dogs) {
            System.out.println(i);
        }
    }
}
