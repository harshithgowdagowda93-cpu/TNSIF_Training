package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue: " + queue);

        System.out.println("Front element: " + queue.peek());

        System.out.println("Contains 20: " + queue.contains(20));

        System.out.println("Size: " + queue.size());

        System.out.println("Removed element: " + queue.remove());

        System.out.println("Queue after remove: " + queue);

        System.out.println("Is queue empty: " + queue.isEmpty());

        queue.clear();

        System.out.println("Queue after clear: " + queue);
    }
}