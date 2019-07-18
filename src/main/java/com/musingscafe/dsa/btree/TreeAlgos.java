package com.musingscafe.dsa.btree;

import java.util.Objects;

public class TreeAlgos {
    public static int getHeight(Node root) {
        if (Objects.isNull(root)) {
            return 0;
        }

        if (Objects.isNull(root.getLeft()) && Objects.isNull(root.getRight())) {
            return 0;
        }

        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public static void inorderRecursive(Node root) {
        if (Objects.isNull(root)) {
            return;
        }

        inorderRecursive(root.getLeft());
        System.out.println(root.getData());
        inorderRecursive(root.getRight());
    }

    public static void findLargestLeftChildOfBstNode(Node node) {
        if (Objects.isNull(node)) {
            System.out.println("Null node");
            return;
        }

        if (Objects.isNull(node.getLeft())) {
            System.out.println("Null left");
            return;
        }

        Node temp = node.getLeft();
        if (Objects.isNull(temp.getRight())) {
            System.out.println(temp.getData());
            return;
        }

        while (Objects.nonNull(temp.getRight())) {
            temp = temp.getRight();
        }

        System.out.println(temp.getData());
    }

    /**
     * Assumption: Valid & not null parameters
     * @param root
     * @param first
     * @param second
     */
    public static void findLCA(Node root, Node first, Node second) {
        Node temp = root;
        while (true) {
            if ((first.getData() < temp.getData() && second.getData() > temp.getData()) || (first.getData() > temp.getData() && second.getData() < temp.getData())) {
                System.out.println(temp.getData());
                return;
            }

            if (first.getData() < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
    }
}
