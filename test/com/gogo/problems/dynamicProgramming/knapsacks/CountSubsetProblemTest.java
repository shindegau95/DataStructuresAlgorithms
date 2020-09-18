package com.gogo.problems.dynamicProgramming.knapsacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountSubsetProblemTest {

    CountSubsetProblem countSubsetProblem;

    @BeforeEach
    void setUp() {
        countSubsetProblem = new CountSubsetProblem();
    }

    @Test
    void countSubset() {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 11;
        System.out.println(countSubsetProblem.countSubset(arr, sum, arr.length));
    }
}