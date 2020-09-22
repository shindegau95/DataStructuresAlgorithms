package com.gogo.problems.dynamicProgramming.unboundedknapsacks.coinChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeNumberOfWaysTest {

    @Test
    void countWays() {
        int[] coin = {1, 5, 10};
        int sum = 8;
        int noOfWays = new CoinChangeNumberOfWays().countWays(coin, 5, 3);
        assertEquals(2, noOfWays);
    }
}