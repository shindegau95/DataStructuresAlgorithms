package com.gogo.problems.dynamicProgramming.ZeroOne.classic;

public class ZeroOneKnapsackMemoization {
    static int[][] t = new int[5][8]; //change row = n+1 and col = c+1

    public static void main(String[] args) {
        initialize();
        int n = 4;
        int[] wt = new int[]{1, 3, 4, 5};
        int[] val = new int[]{1, 4, 5, 7};
        int c = 7;
        int maxProfit = knapsack(wt, val, c, n);
        System.out.println("maxProfit = " + maxProfit);
    }

    private static void initialize() {
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                t[i][j] = -1;
            }
        }
    }

    private static int knapsack(int[] wt, int[] val, int c, int n) {
        if(n == 0 || c == 0){
            return 0;
        }
        if(t[n][c] != -1){
            return t[n][c];
        }

        if(wt[n-1] <= c){
            int included = val[n-1] + knapsack(wt, val, c-wt[n-1], n-1);
            int excluded = knapsack(wt, val, c, n-1);
            t[n][c] = Math.max(included, excluded);
            return t[n][c];
        }else {
            t[n][c] = knapsack(wt, val, c, n-1);
            return t[n][c];
        }
    }
}
