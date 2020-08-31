package com.gogo.lists;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T newData) {
        this.data = newData;
    }
}
