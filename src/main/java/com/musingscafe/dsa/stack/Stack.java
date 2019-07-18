package com.musingscafe.dsa.stack;

public interface Stack<T> {
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    long count();
}
