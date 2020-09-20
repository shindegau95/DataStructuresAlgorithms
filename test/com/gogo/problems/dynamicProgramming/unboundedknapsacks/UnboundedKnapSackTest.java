package com.gogo.problems.dynamicProgramming.unboundedknapsacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnboundedKnapSackTest {

    UnboundedKnapSack unboundedKnapSack;

    @BeforeEach
    void setUp() {
        unboundedKnapSack = new UnboundedKnapSack();
    }

    @Test
    void unboundedKnapSackRecursive() {
        int[] w = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int capacity = 7;

        int maxProfit = unboundedKnapSack.unboundedKnapSackRecursive(w, val, 4, capacity);
        assertEquals(9, maxProfit);
    }
}