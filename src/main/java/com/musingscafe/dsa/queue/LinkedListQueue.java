package com.musingscafe.dsa.queue;

import com.musingscafe.dsa.list.LinkedList;
import com.musingscafe.dsa.list.List;

public class LinkedListQueue<T> implements Queue<T> {
    private final List<T> list = new LinkedList<>();

    @Override
    public void enqueue(T value) {
        list.add(value);
    }

    @Override
    public T dequeue() {
        return list.remove(0);
    }

    @Override
    public T peek() {
        return list.get(0);
    }
}
