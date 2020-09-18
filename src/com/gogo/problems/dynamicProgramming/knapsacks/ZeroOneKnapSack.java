package com.gogo.problems.dynamicProgramming.knapsacks;

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
}
