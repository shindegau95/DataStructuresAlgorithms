package com.gogo.problems.dynamicProgramming.unboundedknapsacks.coinChange;

public class CoinChangeMinNoOfCoins {
    /*
     * Given a coin array
     * coin[] = {1, 2, 3}
     * sum = 5
     * */

    int minNumberOfCoins(int[] coin, int sum, int n) {
        if (n == 0) {
            return Integer.MAX_VALUE;
        } else if (sum <= 0) {
            return 0;
        } else if (n == 1) {
            if (sum % coin[0] == 0) {
                return sum / coin[0];
            } else {
                return Integer.MAX_VALUE;
            }
        } else {
            int included = minNumberOfCoins(coin, sum - coin[n - 1], n) + 1;
            int excluded = minNumberOfCoins(coin, sum, n - 1);
            return Math.min(included, excluded);
        }
    }
}
