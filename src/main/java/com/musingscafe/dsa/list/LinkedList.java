package com.musingscafe.dsa.list;

import java.util.Objects;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private long count;

    @Override
    public void add(T value) {
        final Node<T> node = new Node<>(value);
        if (Objects.isNull(head)) {
            head = node;
            count++;
            return;
        }

        Node<T> temp = head;
        while (Objects.nonNull(temp.getNext())) {
            temp = temp.getNext();
        }

        temp.setNext(node);
        count++;
    }

    @Override
    public T get(long index) {
        final Node<T> node = find(index);
        return node.getValue();
    }

    @Override
    public T remove(long index) {
        if (index < 0 || index > count - 1) {
            throw new RuntimeException("Index out of bounds");
        }

        Node<T> temp;
        if (index == 0) {
            temp = find(0);
            head = temp.getNext();
        } else {
            final Node<T> previous = find(index - 1);
            temp = previous.getNext();
            if (Objects.nonNull(temp)) {
                previous.setNext(temp.getNext());
            } else {
                throw new RuntimeException("Index out of bounds");
            }
        }

        count--;
        return temp.getValue();
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public boolean contains(T value) {
        if (Objects.isNull(value)) {
            return false;
        }

        Node<T> temp = head;
        while (Objects.nonNull(temp)) {
            if (value.equals(temp.getValue())) {
                return true;
            }
            temp = temp.getNext();
        }

        return false;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getNode(long index) {
        return find(index);
    }

    private Node<T> find(long index) {
        Node<T> temp = head;
        int i = 0;
        if (index < 0 || index > count - 1) {
            throw new RuntimeException("Index out of bounds");
        }
        while (i <= index) {
            if (i == index) {
                break;
            }

            temp = temp.getNext();
            i++;
        }
        return temp;
    }
}
