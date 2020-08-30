package com.gogo.lists;

public class DoublyLinkedList<T> {
    T data;
    DoublyNode<T> head;
    DoublyNode<T> tail;

    public void append(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        tail = newNode;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            DoublyNode traversalNode = head;
            while (traversalNode.next != null) {
                traversalNode = traversalNode.next;
            }
            traversalNode.next = newNode;
            newNode.prev = traversalNode;
        }
    }

    public void prepend(T data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public Integer lookup(T data) {
        DoublyNode traversalNode = head;
        int i = 0;
        if (traversalNode == null) {
            return null;
        }
        while (traversalNode.next != null) {
            if (traversalNode.data == data) {
                return i;
            }
            traversalNode = traversalNode.next;
            i++;
        }
        return null;
    }

    public void insert(T data, int index) {
        if (index >= size()) {
            throw new RuntimeException("Invalid Index");
        } else {
            DoublyNode traversalNode = head;
            DoublyNode newNode = new DoublyNode(data);
            int i = 0;
            if (i == 0 && traversalNode == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            while (traversalNode != null) {
                if (i == index) {
                    newNode.prev = traversalNode.prev;
                    if (traversalNode.prev != null) {
                        traversalNode.prev.next = newNode;
                    } else {
                        head = newNode;
                    }
                    newNode.next = traversalNode;
                    traversalNode.prev = newNode;
                    break;
                }
                i++;
                traversalNode = traversalNode.next;
            }
        }
    }

    public void delete(int index) {
        if (index >= size()) {
            throw new RuntimeException("invalid Index");
        } else {
            DoublyNode traversalNode = head;
            int i = 0;
            while (traversalNode != null) {
                if (i == index) {
                    if (i == 0) {
                        head = null;
                        tail = null;
                        break;
                    }
                    traversalNode.prev.next = traversalNode.next;
                    if (traversalNode.next == null) {
                        tail = traversalNode.prev;
                    }
                }
                traversalNode = traversalNode.next;
                i++;
            }
        }
    }

    public int size() {
        DoublyNode traversalNode = head;
        if (traversalNode == null) {
            return 0;
        }
        int size = 0;
        while (traversalNode != null) {
            traversalNode = traversalNode.next;
            size++;
        }
        return size;
    }

    public void print() {
        DoublyNode traversalNode = head;
        if (traversalNode == null) {
            System.out.println("Empty List");
        }
        while (traversalNode != null) {
            System.out.print(traversalNode.data + " ");
            traversalNode = traversalNode.next;
        }
        System.out.println();
    }
}
