package com.gogo.problems.dynamicProgramming.knapsacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSubsetWithDifferenceTest {

    @Test
    void countSubSetWithDifference() {
        int[] arr = {1, 1, 3, 2};
        assertEquals(3, new CountSubsetWithDifference().countSubSetWithDifference(arr, 1));
    }
}