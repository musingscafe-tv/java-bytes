package com.musingscafe.dsa.list;

public class Algos {
    /*
        Given a linked list, swap every two adjacent nodes and return its head.
     */
    public static Node<Integer> swapAdjacent(Node<Integer> head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node<Integer> next = null;
        next = head.getNext();
        head.setNext(next.getNext());
        next.setNext(head);

        Node<Integer> temp = null;
        temp = swapAdjacent(head.getNext());

        head.setNext(temp);

        return next;
    }
}
