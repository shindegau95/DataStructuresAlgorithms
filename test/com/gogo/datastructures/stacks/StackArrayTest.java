package com.gogo.datastructures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StackArrayTest {
    StackArray stack;

    @BeforeEach
    void setUp() {
        stack = new StackArray(5);
    }

    @Test
    void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        assertEquals(5, stack.size);
        assertThrows(RuntimeException.class, () -> stack.push(6));
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    void peek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.peek());
        assertEquals(4, stack.peek());
    }
}