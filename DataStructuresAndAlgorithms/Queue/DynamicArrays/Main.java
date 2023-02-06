package JavaPractice.DataStructuresAndAlgorithms.Queue.DynamicArrays;

public class Main {
    public static void main(String[] args) {

        DynamicArrays dynamicArrays = new DynamicArrays(5);

        dynamicArrays.add("A");
        dynamicArrays.add("B");
        dynamicArrays.add("C");
        dynamicArrays.add("D");
        dynamicArrays.add("E");
        dynamicArrays.add("F");

        //dynamicArrays.insert(0,"X");
        dynamicArrays.delete("B");
        dynamicArrays.delete("C");
        dynamicArrays.delete("E");


        //System.out.println(dynamicArrays.search("C"));
        System.out.println(dynamicArrays);
        System.out.println("Empty: " + dynamicArrays.isEmpty());
        System.out.println("Size: "+dynamicArrays.size);
        System.out.println("Capacity: "+dynamicArrays.capacity);
    }
}
