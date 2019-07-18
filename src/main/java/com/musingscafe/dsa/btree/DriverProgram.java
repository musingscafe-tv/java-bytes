package com.musingscafe.dsa.btree;

public class DriverProgram {
    public static void main(String[] args) {
        final Node root = getBST();
        TreeAlgos.findLCA(root, root.getLeft().getLeft(), root.getLeft().getRight());
    }

    private static Node getBinaryTree() {
        Node node = new Node();
        node.setData(1);

        Node left = new Node();
        left.setData(2);

        Node left2 = new Node();
        left2.setData(3);

        left.setLeft(left2);

        node.setLeft(left);
        return node;
    }

    private static Node getBST() {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        Node five = new Node();
        Node six = new Node();
        Node seven = new Node();

        one.setData(1);
        two.setData(2);
        three.setData(3);
        four.setData(4);
        five.setData(5);
        six.setData(6);
        seven.setData(7);

        four.setLeft(two);
        four.setRight(six);

        two.setLeft(one);
        two.setRight(three);

        six.setLeft(five);
        six.setRight(seven);

        return four;
    }
}
