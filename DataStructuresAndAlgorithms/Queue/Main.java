package JavaPractice.DataStructuresAndAlgorithms.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue = FIFO data structure. First-In, First-Out
        // A collection designed for holding elements prior to processing
        // Linear data structure

        // to add = enqueue, offer();
        // to remove - dequeue, poll();

        Queue<String> queue = new LinkedList<String>();

        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());


        queue.offer("Krum");
        queue.offer("Asparuh");
        queue.offer("Teodor");
        queue.offer("Asen");

        //System.out.println(queue.contains("Teodor"));
        //System.out.println(queue);
        //System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        System.out.println(queue);

        // Queue use - Keyboard Buffer, Printer queue, LinkedLists, PriorityQueues, Breadth-first search
    }
}
