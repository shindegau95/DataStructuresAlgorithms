package com.gogo.problems.dynamicProgramming.knapsacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSubsetDifferenceTest {

    @Test
    void minSubSet() {
        int[] arr = {1, 6, 11, 5};
        assertEquals(1, new MinimumSubsetDifference().minSubSet(arr));
    }
}