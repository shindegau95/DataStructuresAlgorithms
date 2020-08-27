package com.gogo.lists;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T newData) {
        this.data = newData;
    }
}
