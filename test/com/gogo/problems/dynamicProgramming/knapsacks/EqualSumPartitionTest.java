package com.gogo.problems.dynamicProgramming.knapsacks;

import com.gogo.problems.dynamicProgramming.zeroOneknapsacks.EqualSumPartition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EqualSumPartitionTest {

    EqualSumPartition equalSumPartition;

    @BeforeEach
    void setUp() {
        equalSumPartition = new EqualSumPartition();
    }

    @Test
    void isEqualSumPartitionPossible() {
        int[] arr = {1, 5, 10, 5, 1};
        assertTrue(equalSumPartition.isEqualSumPartitionPossible(arr));
    }
}