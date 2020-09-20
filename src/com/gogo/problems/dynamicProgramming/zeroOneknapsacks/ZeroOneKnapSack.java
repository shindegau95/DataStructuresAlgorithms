package com.gogo.problems.dynamicProgramming.zeroOneknapsacks;

public class ZeroOneKnapSack {
    /*
    * Total weight = 7

            I1	I2	I3	I4
        W	1	3	4	5
        C	1	4	5	7


        o/p max Profit


        For item in knapsack:
            If( item has more weight than capacity):
                Dont select this item and return previous weights till now
            Else
                Check max profit
                    1) Including the item
                    2) Excluding the item

    * */

    public int knapSackRecursive(int capacity, int numberOfItems, int[] w, int[] val) {
        if (numberOfItems == 0 || capacity == 0) {
            return 0;
        } else {
            if (w[numberOfItems - 1] > capacity) {
                return knapSackRecursive(capacity, numberOfItems - 1, w, val);
            } else {
                int includedProfit = val[numberOfItems - 1] + knapSackRecursive(capacity - w[numberOfItems - 1], numberOfItems - 1, w, val);
                int excludedProfit = knapSackRecursive(capacity, numberOfItems - 1, w, val);
                return Math.max(includedProfit, excludedProfit);
            }
        }
    }

    //memoized solution

    int[][] t;

    public int knapSackMemoizedSolution(int capacity, int numberOfItems, int[] w, int[] val) {
        t = new int[w.length + 1][capacity + 1];
        return knapSackMemoized(capacity, numberOfItems, w, val);
    }

    private int knapSackMemoized(int capacity, int numberOfItems, int[] w, int[] val) {
        if (numberOfItems == 0 || capacity == 0) {
            t[numberOfItems][capacity] = 0;
        } else {
            if (t[numberOfItems][capacity] == 0) {
                if (w[numberOfItems - 1] > capacity) {
                    t[numberOfItems][capacity] = knapSackMemoized(capacity, numberOfItems - 1, w, val);
                } else {
                    int includedProfit = val[numberOfItems - 1] + knapSackMemoized(capacity - w[numberOfItems - 1], numberOfItems - 1, w, val);
                    int excludedProfit = knapSackMemoized(capacity, numberOfItems - 1, w, val);
                    t[numberOfItems][capacity] = Math.max(includedProfit, excludedProfit);
                }

            }
        }
        return t[numberOfItems][capacity];
    }

    /*
     * for top down approach
     * there will be a matrix, lets call it t
     *
     * val\wt           0   1   2   3   4   5   6   7
     *     v   w    0   0   0   0   0   0   0   0   0
     *     1   1    1   0   1   1   1   1   1   1   1
     *     4   3    2   0   1   1   4   5   5   5   5
     *     5   4    3   0   1   1   4   5   6   6   9
     *     7   5    4   0   1   1   4   5   7   8   9
     * */

    public int knapSackTabular(int capacity, int numberOfItems, int[] w, int[] val) {
        t = new int[numberOfItems + 1][capacity + 1];
        for (int i = 1; i < numberOfItems + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (w[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    int included = val[i - 1] + t[i - 1][j - w[i - 1]];
                    int excluded = t[i - 1][j];
                    t[i][j] = Math.max(included, excluded);
                }
            }
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
        return t[numberOfItems][capacity];
    }
}
