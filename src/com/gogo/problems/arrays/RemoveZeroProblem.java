package com.gogo.problems.arrays;

public class RemoveZeroProblem {
    /**
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */

    /**
     * count the number of zeros -> counter
     */
    public static int[] moveZeros(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //if element is 0, then increase the counter
                counter++;
            }
            if (nums[i] != 0) {
                //replace positions by i - counter
                nums[i - counter] = nums[i];
            }
        }
        while (counter != 0) {
            nums[nums.length - counter] = 0;
            counter--;
        }
        return nums;
    }
}
