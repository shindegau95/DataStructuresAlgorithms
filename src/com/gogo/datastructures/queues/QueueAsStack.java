package com.gogo.datastructures.queues;

import com.gogo.datastructures.lists.Node;
import com.gogo.datastructures.stacks.Stack;

public class QueueAsStack<T> {
    private final Stack<T> queueStack;
    private Stack<T> tempStack;

    public QueueAsStack() {
        queueStack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        queueStack.push(data);
        tempStack = new Stack<>();
    }

    public T pop() {
        //push in tempStack;
        while (queueStack.size() != 0) {
            tempStack.push(queueStack.pop());
        }

        T data = tempStack.pop();
        return data;
    }

    public int size() {
        return Math.max(queueStack.size(), tempStack.size());
    }
}
