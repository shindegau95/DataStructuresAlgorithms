package com.gogo.problems.slidingWindow.fixed;

public class MaximumSumSubArrayOfSizeK {

    /**
     * Problem Statement
     * Input - array of size m, window size k
     * For this window size, find the sub array such that the sum is maximum
     * */

    /*
    * To represent window i -> start, j -> end
    * window size = j - 1 + 1
    * eg. 0 2 4 5 8 6
    *       i   j
    *
    * windowSize = 3 - 0 + 1 = 4
    * */

    public static int MaximumSumForSubArray(int[] arr, int k){
        int i=0, j=0;
        int max = Integer.MIN_VALUE;
        int subArrSum = 0;

        //while first window
        while(j-i+1 <= k){
            subArrSum += arr[j++];
        }

        System.out.println("subArrSum = " + subArrSum);
        max = Math.max(max, subArrSum);

        while(j < arr.length -1){
            subArrSum -= arr[i];
            i++;
            subArrSum += arr[j];
            j++;
            System.out.println("subArrSum = " + subArrSum);
            max = Math.max(max, subArrSum);

        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        int sum = MaximumSumForSubArray(arr, k);
        System.out.println("sum = " + sum);
    }
}
