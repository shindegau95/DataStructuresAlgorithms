package com.gogo.problems.recursion;

public class MidDeleteStack {
    // Delete the middle element in a stack
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        midDelete(stack);
        System.out.println(stack);
    }

    private static void midDelete(Stack stack) {
        if(stack.size() == 0){
            return;
        }
        int k = (stack.size()/2 + 1);
        solve(stack, k);
    }

    private static void solve(Stack stack, int k) {
        if(k == 1){
            stack.pop();
            return;
        }
        int val = stack.pop();
        solve(stack, k-1);
        stack.push(val);
    }
}
