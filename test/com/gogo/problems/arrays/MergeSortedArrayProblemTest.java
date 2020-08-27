package com.gogo.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayProblemTest {

    @Test
    void testMerge() {
        int[] a = {0, 3, 4, 31};
        int[] b = {4, 6, 30};

        int[] merged = MergeSortedArrayProblem.mergeSortedArray(a, b);
        int[] expected = {0, 3, 4, 4, 6, 30, 31};
        assertArrayEquals(expected, merged);
    }

    @Test
    void testMerge2() {
        int[] a = {4, 6, 30};
        int[] b = {0, 3, 4, 31};

        int[] merged = MergeSortedArrayProblem.mergeSortedArray(a, b);
        int[] expected = {0, 3, 4, 4, 6, 30, 31};
        assertArrayEquals(expected, merged);
    }
}