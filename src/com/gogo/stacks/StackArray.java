package com.gogo.stacks;

public class StackArray {
    int[] data;
    int size;
    int top;
    int bottom;

    public StackArray(int size) {
        this.data = new int[size];
        top = -1;
        bottom = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (top == -1) {
            System.out.println("Empty stack");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void push(Integer newData) {
        if (size == data.length) {
            throw new RuntimeException("Stack Overflow");
        } else {
            if (top == -1) {
                bottom = 0;
            }
            data[++top] = newData;
            size++;
        }
    }

    public Integer pop() {
        if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        } else {
            if (top == 0) {
                bottom = -1;
            }
            size--;
            return data[top--];
        }
    }

    public Integer peek() {
        return data[top];
    }
}
