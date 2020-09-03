package com.gogo.datastructures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StaticArrayTest {

    StaticArray<Integer> staticArray;

    @BeforeEach
    void setUp() {
        Integer[] a = new Integer[5];
        staticArray = new StaticArray<>(a);
    }

    @Test
    void push() {
        staticArray.push(5);
        assertEquals(1, staticArray.size());
        assertEquals(5, staticArray.get(0));
        staticArray.push(7);
        assertEquals(2, staticArray.size());
        assertEquals(7, staticArray.get(1));
    }

    @Test
    void pop() {
        staticArray.push(1);
        staticArray.push(2);
        staticArray.push(3);
        int popped = staticArray.pop();
        assertEquals(3, popped);
        assertEquals(2, staticArray.size());
    }

    @Test
    void unshift() {
        staticArray.push(2);
        staticArray.push(3);
        staticArray.unshift(1);
        assertEquals(3, staticArray.size());
        assertEquals(1, staticArray.get(0));
    }

    @Test
    void unshiftThrowsException() {
        staticArray.push(2);
        staticArray.push(3);
        staticArray.push(4);
        staticArray.push(5);
        staticArray.push(6);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> staticArray.unshift(1));
    }

    @Test
    void splice() {
        staticArray.push(1);
        staticArray.push(2);
        staticArray.push(3);
        staticArray.splice(2, 1);
        assertEquals(2, staticArray.size());
    }

    @Test
    void spliceStartThrowsException() {
        staticArray.push(1);
        staticArray.push(2);
        staticArray.push(3);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> staticArray.splice(3, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> staticArray.splice(3, 1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> staticArray.splice(1, 3));
    }
}