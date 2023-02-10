package JavaPractice.DataStructuresAndAlgorithms.Queue;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {


        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Teo");
        table.put(334, "Tea");
        table.put(222, "Bob");
        table.put(555, "Kate");
        table.put(767, "Gary");
        table.put(321, "Max");
        table.put(666, "Dea");

        // table.remove(666);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
            //System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key)); For String data type
        }
    }
}
