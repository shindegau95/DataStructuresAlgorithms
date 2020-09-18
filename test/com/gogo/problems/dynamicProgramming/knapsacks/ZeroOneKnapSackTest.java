package com.gogo.problems.dynamicProgramming.knapsacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZeroOneKnapSackTest {

    ZeroOneKnapSack zeroOneKnapSack;

    @BeforeEach
    void setUp() {
        zeroOneKnapSack = new ZeroOneKnapSack();
    }

    @Test
    void testKnapSack() {
        int[] w = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int capacity = 7;

        assertEquals(9, zeroOneKnapSack.knapSackRecursive(capacity, 4, w, val));
    }
}