package com.musingscafe.dsa.queue;

public interface Queue<T> {
    void enqueue(T value);
    T dequeue();
    T peek();
}
