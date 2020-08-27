package com.gogo.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumProblemTest {

    @Test
    void twoSumSorted() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};
        assertArrayEquals(expected, TwoSumProblem.twoSumSorted(nums, target));
    }

    @Test
    void twoSumUnSorted() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] expected = {1, 2};
        assertArrayEquals(expected, TwoSumProblem.twoSumUnSorted(nums, target));
    }
}