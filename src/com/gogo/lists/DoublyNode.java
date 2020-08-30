package com.gogo.lists;

public class DoublyNode<T> {
    T data;
    DoublyNode<T> prev;
    DoublyNode<T> next;

    public DoublyNode(T data) {
        this.data = data;
    }
}
