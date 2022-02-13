package com.gogo.problems.arrays;

public class StockBuySell {
    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * */

    public int maxProfit(int[] prices) {
        /**
         * Brute force,
         * while traversing through the array keep track of profit;
         * return max profit;
         * */

        /*int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(min > prices[i]){
                min = prices[i];
            }
            int p = prices[i] - min;
            if(p > profit){
                profit = p;
            }
        }
        return profit;*/

        /**
         * Better approach to calc min and max
         * then return profit
         * */

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        /*
        * Input: prices = [7,1,5,3,6,4]
        * Output: 5
        * */

        /*
        * Input: prices = [7,6,4,3,1]
        * Output: 0
        * */
        int[] nums = new int[]{7,6,4,3,1};
        System.out.println(new StockBuySell().maxProfit(nums));
    }
}
