package com.gogo.problems.recursion;

public class ReverseStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }

    private static void reverse(Stack stack) {
        if(stack.size() == 0){
            return;
        }
        int val = stack.pop();
        reverse(stack);
        insert(stack, val);
    }

    private static void insert(Stack stack, int val) {
        if(stack.size() == 0){
            stack.push(val);
            return;
        }
        int pop = stack.pop();
        insert(stack, val);
        stack.push(pop);
    }
}
