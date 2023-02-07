package JavaPractice.DataStructuresAndAlgorithms.Queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class _LinkedList_VS_ArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        // linkedList
        startTime = System.nanoTime();

        // TODO
        //linkedList.get(50000);
        linkedList.remove(500000);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("linkedList\t"+ elapsedTime + " ns");
        // arrayList
        startTime = System.nanoTime();

        // TODO
        //arrayList.get(50000);
        arrayList.remove(500000);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("arrayList\t"+ elapsedTime + " ns");

    }
}
