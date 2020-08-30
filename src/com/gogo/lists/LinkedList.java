package com.gogo.lists;

public class LinkedList<T> {
    Node<T> head;
    int size;

    public LinkedList() {
        size = 0;
    }

    public void append(T newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            size = 1;
        } else {
            Node endNode = getLastNode();
            endNode.next = newNode;
            size++;
        }
    }

    public void prepend(T newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            size = 1;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void insert(T newData, int index) {
        Node newNode = new Node(newData);
        if (head == null) {
            if (index != 0) {
                throw new Error("list is empty");
            } else {
                head = newNode;
                size++;
            }
        } else if (index >= size) {
            throw new Error("Invalid index");
        } else {
            Node traversalNode = head;
            Node prev = head;
            int i = 0;
            while (traversalNode != null) {
                if (index == i) {
                    prev.next = newNode;
                    newNode.next = traversalNode;
                    size++;
                    break;
                }
                i++;
                prev = traversalNode;
                traversalNode = traversalNode.next;
            }

        }
    }

    public void delete(T deleteNodeData) {
        if (head == null) {
            throw new UnsupportedOperationException();
        }
        /*
         * Cases to consider
         * 1) It is the first node itself
         * 2) its the last node
         * 3) deleteNodeData does not exist
         * */

        if (head.data == deleteNodeData) {
            if (head.next != null) {
                head = head.next;
                size--;
            } else {
                head = null;
                size = 0;
            }
        } else {
            Node traversalNode = head;
            Node prev = head;
            boolean found = false;
            while (traversalNode != null) {
                if (traversalNode.data == deleteNodeData) {
                    prev.next = traversalNode.next;
                    size--;
                    found = true;
                    break;
                }
                prev = traversalNode;
                traversalNode = traversalNode.next;
            }
            if (!found) {
                throw new Error("Data does not exist");
            }
        }

    }

    public T peek() {
        Node lastNode = getLastNode();
        if (lastNode == null) {
            return null;
        } else {
            return (T) lastNode.data;
        }
    }

    public Integer lookup(T data) {
        Node traversalNode = head;
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

    private Node getLastNode() {
        if (head == null) {
            return null;
        }
        Node traversalNode = head;
        while (traversalNode.next != null) {
            traversalNode = traversalNode.next;
        }
        return traversalNode;
    }
}
