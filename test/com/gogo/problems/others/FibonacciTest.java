package com.gogo.problems.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void getFibonacciRecursive() {
        assertEquals(1, fibonacci.getFibonacciRecursive(1));
        assertEquals(1, fibonacci.getFibonacciRecursive(2));
        assertEquals(2, fibonacci.getFibonacciRecursive(3));
        assertEquals(3, fibonacci.getFibonacciRecursive(4));
        assertEquals(5, fibonacci.getFibonacciRecursive(5));
    }

    @Test
    void getFibonacciIterative() {
        assertEquals(1, fibonacci.getFibonacciIterative(1));
        assertEquals(1, fibonacci.getFibonacciIterative(2));
        assertEquals(2, fibonacci.getFibonacciIterative(3));
        assertEquals(3, fibonacci.getFibonacciIterative(4));
        assertEquals(5, fibonacci.getFibonacciIterative(5));
    }
}