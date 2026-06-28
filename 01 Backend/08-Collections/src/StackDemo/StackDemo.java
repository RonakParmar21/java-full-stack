package StackDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack is : " + stack);
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Stack is : " + stack);

        stack.push(60);
        stack.push(70);

        System.out.println("Stack is : " + stack);
        System.out.println("Random access : " + stack.get(3));

        System.out.println(stack.peek()); // get last inserted element
        System.out.println(stack.search(20)); // give index of this value
    }
}
