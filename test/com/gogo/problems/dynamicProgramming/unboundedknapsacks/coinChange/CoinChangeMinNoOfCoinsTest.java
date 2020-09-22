package com.gogo.problems.dynamicProgramming.unboundedknapsacks.coinChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeMinNoOfCoinsTest {

    @Test
    void minNumberOfCoins() {
        int[] coin = {25, 10, 5};
        int sum = 5;
        int minNumberOfCoins = new CoinChangeMinNoOfCoins().minNumberOfCoins(coin, sum, 3);
        assertEquals(1, minNumberOfCoins);
    }

    @Test
    void minNumberOfCoins2() {
        int[] coin = {9, 6, 5, 1};
        int sum = 11;
        int minNumberOfCoins = new CoinChangeMinNoOfCoins().minNumberOfCoins(coin, sum, 3);
        assertEquals(2, minNumberOfCoins);
    }
}