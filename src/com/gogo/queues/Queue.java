package com.gogo.queues;

import com.gogo.lists.Node;

public class Queue<T> {
    Node<T> start;
    Node<T> end;
    private int size;

    public void enqueue(T newData) {
        Node newNode = new Node(newData);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (start == null) {
            return null;
        } else {
            if (start == end) {
                end = null;
            }
            T data = start.data;
            start = start.next;
            size--;
            return data;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (start == null) {
            System.out.println("Empty queue");
        } else {
            Node traversalNode = start;
            while (traversalNode != null) {
                System.out.print(traversalNode.data + " ");
                traversalNode = traversalNode.next;
            }
        }
        System.out.println();
    }
}
