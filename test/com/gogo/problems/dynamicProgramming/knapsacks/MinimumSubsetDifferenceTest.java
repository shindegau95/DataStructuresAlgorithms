package com.gogo.problems.dynamicProgramming.knapsacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSubsetDifferenceTest {

    /*
     * Given an array, count the number of subsets
     * eg.
     * Input arr[] = {2, 3, 5, 6, 8, 10}
     * sum = 10
     * Output
     * */

    @Test
    void minSubSet() {
        int[] arr = {1, 6, 11, 5};
        assertEquals(1, new MinimumSubsetDifference().minSubSet(arr));
    }
}