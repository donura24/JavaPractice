package JavaPractice.DataStructuresAndAlgorithms.Queue;

import java.util.*;
import java.util.Queue;

public class _PriorityQueue {
    public static void main(String[] args) {

        // Priority Queue = A FIFO data structure that serves elements
        //                  with the highest priorities first
        //                  before elements with lower priority

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        //queue.offer(5.0);
        //queue.offer(7.0);
        //queue.offer(4.5);
        //queue.offer(3.0);
        //queue.offer(1.5);

        queue.offer("C");
        queue.offer("B");
        queue.offer("A");
        queue.offer("E");
        queue.offer("D");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }



    }
}
