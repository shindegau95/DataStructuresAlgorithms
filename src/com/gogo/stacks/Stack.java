package com.gogo.stacks;

import com.gogo.lists.Node;


public class Stack<T> {
    //LIFO
    Node<T> top;
    Node<T> bottom;
    int size = 0;

    public void push(T data) {
        Node newNode = new Node(data);
        if (size == 0) {
            top = newNode;
            bottom = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public T pop() {
        if (top != null) {
            Node<T> temp = top;
            top = top.next;
            if (top == null) {
                bottom = null;
            }
            size--;
            return temp.data;
        }
        return null;
    }

    public T peek() {
        return top.data;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node traversalNode = top;
        if (traversalNode == null) {
            System.out.println("Empty list");
            return;
        }
        while (traversalNode != null) {
            System.out.print(traversalNode.data + " ");
            traversalNode = traversalNode.next;
        }
        System.out.println();
    }
}
