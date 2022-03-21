package com.gogo.problems.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Stack {
    List<Integer> numbers;
    int top;

    public int size() {
        return numbers.size();
    }

    public void push(int n) {
        if (numbers == null) {
            numbers = new ArrayList<>();
        }
        numbers.add(n);
        top = n;
    }

    public int pop() {
        if (numbers == null) {
            throw new UnsupportedOperationException();
        } else {
            int val = numbers.remove(numbers.size() - 1);
            top = numbers.size() > 0 ? numbers.get(numbers.size() - 1) : -1;
            return val;
        }
    }

    @Override
    public String toString() {
        return this.numbers.toString();
    }
}

public class StackSort {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
    }

    private static void sort(Stack stack) {
        if (stack.size() == 0) {
            return;
        }
        int pop = stack.pop();
        sort(stack);
        insert(stack, pop);
    }

    private static void insert(Stack stack, int pop) {
        if (stack.size() == 0 || stack.top >= pop) {
            stack.push(pop);
        } else {
            int val = stack.pop();
            insert(stack, pop);
            stack.push(val);
        }
    }
}
