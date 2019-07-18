package com.musingscafe.dsa.list;

public interface List<T> {
    void add(T value);
    T get(long index);
    T remove(long index);
    long count();
    boolean contains(T value);
}
