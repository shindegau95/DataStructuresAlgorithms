package com.gogo.problems.dynamicProgramming.knapsacks;

import com.gogo.problems.dynamicProgramming.zeroOneknapsacks.SubsetSumExistsProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SubsetSumExistsProblemTest {

    SubsetSumExistsProblem subsetSumExistsProblem;

    @BeforeEach
    void setUp() {
        subsetSumExistsProblem = new SubsetSumExistsProblem();
    }

    @Test
    void isSumPresent() {
        int[] arr = {2, 3, 7, 8, 10};
        int expectedSum = 11;
        assertTrue(subsetSumExistsProblem.isSumPresent(arr, expectedSum, arr.length));
    }
}