package com.gogo.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateProblem {
    /**
     * Given an array of integers, find if the array contains any duplicates.
     * <p>
     * Input: [1,2,3,1]
     * Output: true
     * <p>
     * Input: [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     * <p>
     * Input: [1,2,3,4]
     * Output: false
     */

    public static boolean findDuplicates(int[] nums) {
        Set set = new HashSet();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
