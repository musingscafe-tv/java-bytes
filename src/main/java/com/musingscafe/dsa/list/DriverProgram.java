package com.musingscafe.dsa.list;

public class DriverProgram {
    public static void main(String[] args) {
        final LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        printList(list.getHead());
        Node<Integer> result = Algos.swapAdjacent(list.getHead());
        printList(result);
    }

    private static void printList(Node<Integer> result) {
        Node<Integer> temp = result;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    private static void linkedListOperations() {
        final List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.remove(3);

        System.out.println(list.contains(4));
        System.out.println(list.contains(3));
    }
}
