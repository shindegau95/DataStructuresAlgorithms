package com.gogo.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    Array<Integer> array;

    @BeforeEach
    void setUp() {
        array = new Array<Integer>();
    }

    @Test
    void push() {
        array.push(5);
        assertEquals(1, array.size());
        assertEquals(5, array.get(0));
    }

    @Test
    void pop() {
        array.push(1);
        array.push(2);
        array.push(3);
        int popped = array.pop();
        assertEquals(3, popped);
        assertEquals(2, array.size());
    }

    @Test
    void unshift() {
        array.push(2);
        array.push(3);
        array.unshift(1);
        assertEquals(3, array.size());
        assertEquals(1, array.get(0));
    }

    @Test
    void splice() {
        array.push(1);
        array.push(2);
        array.push(3);
        array.splice(2, 1);
        assertEquals(2, array.size());
    }

    @Test
    void spliceStartThrowsException(){
        array.push(1);
        array.push(2);
        array.push(3);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.splice(3,0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.splice(3,1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.splice(1,3));
    }
}