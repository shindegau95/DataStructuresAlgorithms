package com.gogo.problems.dynamicProgramming.knapsacks;

import com.gogo.problems.dynamicProgramming.zeroOneknapsacks.CountSubsetWithDifference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetSumTest {

    @Test
    void getCountForTargetSum() {
        int[] arr = {1, 1, 2, 3};
        assertEquals(3, new CountSubsetWithDifference().countSubSetWithDifference(arr, 1));
    }
}