package com.musingscafe.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        basicOperations();
    }

    public static void basicOperations() {
        final Queue<Integer> queue = new LinkedList<>();

        // enqueue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);

        // get first element without removing
        Integer element = queue.peek();

        System.out.println(element);

        // dequeue
        element = queue.poll();

        System.out.println(element);

        System.out.println(queue);

        // dequeue second
        element = queue.poll();

        System.out.println(element);

        System.out.println(queue);
    }
}
