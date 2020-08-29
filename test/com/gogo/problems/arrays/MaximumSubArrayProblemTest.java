package com.gogo.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubArrayProblemTest {

    @Test
    void findMaxSumUsingContiguousArray() {
        assertEquals(5, MaximumSubArrayProblem.findMaxSumUsingContiguousArray(new int[]{-1, 2, 3, -5, 4}));
        assertEquals(6, MaximumSubArrayProblem.findMaxSumUsingContiguousArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}