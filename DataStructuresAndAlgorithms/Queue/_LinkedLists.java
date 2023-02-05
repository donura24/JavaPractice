package JavaPractice.DataStructuresAndAlgorithms.Queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class _LinkedLists {
    public static void main(String[] args) {

        // Linkedlist = Stores Nodes in 2 parts (data + address)
        //              Nodes are not in non-consecutive memory locations
        //              Elements are linked using pointers
        //TL;DR
        //small data set:                                                LinkedList = BAD
        //large data set + lots of searching:                            LinkedList = BAD
        //large data set + lots of inserting/deleting:                   LinkedList = GOOD

        LinkedList<String> linkedList = new LinkedList<String>();

        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.pop();
        */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(4,"E");
        linkedList.remove("E");

        //System.out.println(linkedList.peekFirst());
        //System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("9");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }
}
