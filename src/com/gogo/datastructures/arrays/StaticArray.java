package com.gogo.datastructures.arrays;

public class StaticArray<T> {

    private final T[] array;
    private int length;

    public StaticArray(T[] array) {
        this.array = array;
        this.length = 0;
    }

    public void push(T newItem) {
        //O(1)
        array[length++] = newItem;
    }

    public T pop() {
        //O(1)
        T item = array[length - 1];
        array[length - 1] = null;
        length--;
        return item;
    }

    public void unshift(T newItem) {
        //O(n)
        if (array[array.length - 1] != null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = newItem;
        length++;
    }

    public void splice(int start, int numberOfElementsToBeDeleted) {
        //O(n)
        if (start + Math.max(0, numberOfElementsToBeDeleted - 1) >= size()) {
            //['a','b']
            //splice(1,1)
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = start + Math.max(0, numberOfElementsToBeDeleted - 1); i >= start; i--) {
                array[i] = null;
                length--;
            }
        }
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        //O(1)
        return length;
    }
}
