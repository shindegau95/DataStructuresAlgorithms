package com.gogo.problems.arrays;

public class MaximumSubArrayProblem {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     */

    //brute force

    /**
     * eg. [-1, 2, 3, -5, 4]
     * Current Streak(to check if the solution is better locally), Global Streak (solution is better globally)
     * C -> update this if next number is better than adding next number to current number in current streak
     * G -> update this if current streak is better than adding C to current number in Global Streak
     * O(n)
     */
    public static int findMaxSumUsingContiguousArray(int[] nums) {
        int c = nums[0];
        int g = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (isBetter(num, c)) {
                c = c + num;
            } else {
                c = num;
            }
            if (c > g) {
                g = c;
            }
        }

        return g;
    }

    private static boolean isBetter(int num, int c) {
        return num + c > num;
    }


}
