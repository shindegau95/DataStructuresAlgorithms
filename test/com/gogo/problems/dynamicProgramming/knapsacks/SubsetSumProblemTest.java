package com.gogo.problems.dynamicProgramming.knapsacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SubsetSumProblemTest {

    SubsetSumProblem subsetSumProblem;

    @BeforeEach
    void setUp() {
        subsetSumProblem = new SubsetSumProblem();
    }

    @Test
    void isSumPresent() {
        int[] arr = {2, 3, 7, 8, 10};
        int expectedSum = 11;
        assertTrue(subsetSumProblem.isSumPresent(arr, expectedSum, 4));
    }
}