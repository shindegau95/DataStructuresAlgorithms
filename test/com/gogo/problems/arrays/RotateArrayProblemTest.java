package com.gogo.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayProblemTest {

    @Test
    void rotate() {
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, RotateArrayProblem.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    void rotateInPlace() {
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, RotateArrayProblem.rotateInPlace(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }
}