package com.gogo.datastructures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DynamicArrayTest {

    DynamicArray<Integer> dynamicArray;

    @BeforeEach
    void setUp() {
        dynamicArray = new DynamicArray<>();
    }

    @Test
    void push() {
        dynamicArray.push(5);
        assertEquals(1, dynamicArray.size());
        assertEquals(5, dynamicArray.get(0));
    }

    @Test
    void pop() {
        dynamicArray.push(1);
        dynamicArray.push(2);
        dynamicArray.push(3);
        int popped = dynamicArray.pop();
        assertEquals(3, popped);
        assertEquals(2, dynamicArray.size());
    }

    @Test
    void unshift() {
        dynamicArray.push(2);
        dynamicArray.push(3);
        dynamicArray.unshift(1);
        assertEquals(3, dynamicArray.size());
        assertEquals(1, dynamicArray.get(0));
    }

    @Test
    void splice() {
        dynamicArray.push(1);
        dynamicArray.push(2);
        dynamicArray.push(3);
        dynamicArray.splice(2, 1);
        assertEquals(2, dynamicArray.size());
    }

    @Test
    void spliceStartThrowsException() {
        dynamicArray.push(1);
        dynamicArray.push(2);
        dynamicArray.push(3);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> dynamicArray.splice(3, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> dynamicArray.splice(3, 1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> dynamicArray.splice(1, 3));
    }
}