package com.musingscafe.dsa.stack;

import com.musingscafe.dsa.list.LinkedList;
import com.musingscafe.dsa.list.List;

public class LinkedListStack<T> implements Stack<T> {
    private final List<T> list = new LinkedList<>();

    @Override
    public void push(T value) {
        list.add(value);
    }

    @Override
    public T pop() {
        return list.remove(list.count() - 1);
    }

    @Override
    public T peek() {
        return list.get(list.count() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.count() == 0;
    }

    @Override
    public long count() {
        return list.count();
    }
}
