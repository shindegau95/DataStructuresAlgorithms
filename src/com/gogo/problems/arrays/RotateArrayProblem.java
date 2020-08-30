package com.gogo.problems.arrays;

public class RotateArrayProblem {
    /**
     * Given an array, rotate the array to the right by k steps, where k is non-negative.
     */

    //brute force
    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] spare = new int[k];
        for (int i = nums.length - k, j = 0; i < nums.length; i++, j++) {
            spare[j] = nums[i];
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = spare[i];
        }
        return nums;
    }

    /**
     * k = 2
     * [1,2,3,4,5]
     * [5,4,3,2,1]
     * [4,5,3,2,1]
     * [4,5,1,2,3]
     */
    public static int[] rotateInPlace(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
