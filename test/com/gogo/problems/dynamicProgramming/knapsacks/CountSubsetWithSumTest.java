package com.gogo.problems.dynamicProgramming.knapsacks;

import com.gogo.problems.dynamicProgramming.zeroOneknapsacks.CountSubsetWithSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountSubsetWithSumTest {

    CountSubsetWithSum countSubsetWithSum;

    @BeforeEach
    void setUp() {
        countSubsetWithSum = new CountSubsetWithSum();
    }

    @Test
    void countSubset() {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 11;
        System.out.println(countSubsetWithSum.countSubset(arr, sum, arr.length));
    }


    @Test
    void countSubset2() {
        int[] arr = {0, 1, 1, 0, 1};
        int sum = 2;
        System.out.println(countSubsetWithSum.countSubset(arr, sum, arr.length));
    }
}