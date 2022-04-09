package com.gogo.problems.slidingWindow.fixed;

import sun.java2d.pipe.SolidTextRenderer;

public class MaximumSumSubArrayOfSizeK {
    /**
     * Problem statment
     * given an array of size n
     * find the maximumsum that is possible with all the subarrays of size k
     * eg.
     * arr[] = {2,5,1,8}
     * window size = 3
     * max = Math.max(8, 14) = 14
     *
     * */

    public static int solve(int[] arr, int k){

        int i=0, j=0;
        int maxSum = 0;
        int sum = 0;
        while(j<arr.length){
            sum+=arr[j]; //14
            if(j-i+1 == k){
                maxSum = Math.max(sum, maxSum); //14
                sum-=arr[i]; //9
                i++; //2
            }
            j++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,5,1,8};
        int k = 3;
        int max = solve(arr, k);
        System.out.println("max = " + max);
    }
}
