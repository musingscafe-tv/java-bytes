package com.musingscafe.dsa.stack;

public class DriverProgram {
    public static void main(String[] args) {
        final Stack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.count());
    }
}
