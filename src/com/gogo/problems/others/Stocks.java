package com.gogo.problems.others;

public class Stocks {
    /*
    * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
    * design an algorithm to find the maximum profit.
    * Note that you cannot sell a stock before you buy one.
    *
    * eg.
    * Input: [7,1,5,3,6,4]
    * Output: 5
    * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
    */

    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length && prices[j] > prices[i]; j++) {
                int stockPrice = prices[j] - prices[i];
                if (max < stockPrice) {
                    max = stockPrice;
                }
            }
        }

        return max;
    }
}
