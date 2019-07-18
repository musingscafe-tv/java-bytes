package com.musingscafe.dsa.queue;

public class DriverProgram {
    public static void main(String[] args) {
        final Queue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek().intValue());
        System.out.println(queue.dequeue().intValue());
    }
}
