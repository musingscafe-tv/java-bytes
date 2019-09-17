package com.musingscafe.dsa.list.simple;

class Node {
    public int data;
    public Node next;
}

class LinkedList {
    public Node head;
}

public class LinkedListTraversal {
    public static void main(String[] args) {
        final LinkedList list = new LinkedList();

        final Node head = new Node();
        head.data = 100;

        final Node nOne = new Node();
        nOne.data = 200;

        final Node nTwo = new Node();
        nTwo.data = 300;

        head.next = nOne;
        nOne.next = nTwo;

        // traversal
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


