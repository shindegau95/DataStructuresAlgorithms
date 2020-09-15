package com.gogo.problems.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class kLargestNumbersInArrayTest {

    kLargestNumbersInArray problem;

    @BeforeEach
    void setUp() {
        problem = new kLargestNumbersInArray();
    }

    @Test
    void getKLargest() {
        assertArrayEquals(new int[]{50, 30, 23}, problem.getKLargest(new int[]{1, 23, 12, 9, 30, 2, 50}, 3));
    }
}