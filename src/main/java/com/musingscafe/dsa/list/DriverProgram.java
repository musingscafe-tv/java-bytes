package com.musingscafe.dsa.list;

public class DriverProgram {
    public static void main(String[] args) {
        final List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.remove(3);

        System.out.println(list.contains(4));
        System.out.println(list.contains(3));
    }
}
