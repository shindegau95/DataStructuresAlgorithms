package com.gogo.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveZeroProblemTest {
    @Test
    void testMoveZeros() {
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, RemoveZeroProblem.moveZeros(new int[]{0, 1, 0, 3, 12}));
        assertArrayEquals(new int[]{1, 3, 12, 0, 0, 0}, RemoveZeroProblem.moveZeros(new int[]{0, 1, 0, 0, 3, 12}));
    }
}