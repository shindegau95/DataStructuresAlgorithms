package com.gogo.problems.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    void findFactorialRecursive() {
        assertEquals(1, factorial.findFactorialRecursive(1));
        assertEquals(120, factorial.findFactorialRecursive(5));
    }

    @Test
    void findFactorialIterative() {
        assertEquals(1, factorial.findFactorialIterative(1));
        assertEquals(120, factorial.findFactorialIterative(5));
    }
}