package com.gogo.arrays;

public class StaticArray<T> {

    private final T[] array;

    public StaticArray(T[] array) {
        this.array = array;
    }

    public void push(T newItem) {
        //O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = newItem;
                break;
            }
        }
    }

    public T pop() {
        //O(n)
        if (array[0] == null) {
            return null;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == null) {
                T popped = array[i];
                array[i] = null;
                return popped;
            }
        }
        array[array.length - 1] = null;
        return array[array.length - 1];
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
            }
        }
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        //O(n)
        int size;
        for (size = 0; size < array.length; size++) {
            if (array[size] == null) {
                break;
            }
        }
        return size;
    }
}
