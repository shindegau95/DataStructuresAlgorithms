package com.gogo.problems.dynamicProgramming.unboundedknapsacks.coinChange;

public class CoinChangeNumberOfWays {
    /*
     * Given a coin array
     * coin[] = {1, 2, 3}
     * sum = 5
     *
     * coins are unlimited in supply, thus unbounded
     * Find the number
     * */

    int countWays(int[] coin, int sum, int n) {
        if (sum == 0) {
            return 1;
        } else if (n == 0 || sum < 0) {
            return 0;
        } else {
            int included = countWays(coin, sum - coin[n - 1], n);
            int excluded = countWays(coin, sum, n - 1);
            return included + excluded;
        }
    }
}
