package com.gogo.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueAsStackTest {

    QueueAsStack<Integer> queueAsStack;

    @BeforeEach
    void setUp() {
        queueAsStack = new QueueAsStack<>();
    }

    @Test
    void push() {
        assertEquals(0, queueAsStack.size());
        queueAsStack.push(1);
        queueAsStack.push(2);
        queueAsStack.push(3);
        assertEquals(3, queueAsStack.size());
    }

    @Test
    void pop() {
        assertEquals(0, queueAsStack.size());
        queueAsStack.push(1);
        queueAsStack.push(2);
        queueAsStack.push(3);
        assertEquals(3, queueAsStack.size());
        assertEquals(1, queueAsStack.pop());
        assertEquals(2, queueAsStack.pop());
        assertEquals(3, queueAsStack.pop());
        assertEquals(null, queueAsStack.pop());
        queueAsStack.push(4);
        assertEquals(4, queueAsStack.pop());
        assertEquals(null, queueAsStack.pop());
    }
}