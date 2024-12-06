package collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        //FIFO queue
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(1);
        queue2.add(2);
        System.out.println(queue2);

        // we add element in both sides
        Deque<Integer> deque = new LinkedList<>();
        deque.add(3);
        deque.add(1);
        deque.add(2);
        System.out.println(deque);


        Deque<Integer> deque2 = new ArrayDeque<>();
        deque2.add(3);
        deque2.add(1);
        deque2.add(2);
        System.out.println(deque2);
        deque2.offer(1);
        System.out.println(deque2);
        deque2.push(2);
        System.out.println(deque2);

    }
}
