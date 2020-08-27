package com.gogo.problems.maps;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacterProblem {
    /**
     * Google Question
     * Given an array = [2,5,1,2,3,5,1,2,4]:
     * It should return 2
     * <p>
     * Given an array = [2,1,1,2,3,5,1,2,4]:
     * It should return 1
     * <p>
     * Given an array = [2,3,4,5]:
     * It should return null
     */

    public static Integer getFirstRecurring(int[] nums) {
        /**
         * STRATEGY
         * Traverse through array one at a time
         * Check if the element is already present in visited then return present
         * If no more elements return null
         * O(n)
         */
        Set visited = new HashSet();
        for (int num : nums) {
            if (visited.contains(num)) {
                return num;
            } else {
                visited.add(num);
            }
        }
        return null;
    }
}
