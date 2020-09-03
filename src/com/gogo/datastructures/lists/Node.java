package com.gogo.datastructures.lists;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T newData) {
        this.data = newData;
    }
}
