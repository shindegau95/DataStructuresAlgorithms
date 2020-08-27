package com.gogo.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static int[] twoSumSorted(int[] nums, int target) {
        /*
         * STRATEGY
         * Keep 2 pointers low = 0 and high = nums.length-1
         * sum(e@low, e@high) == target | done
         * sum(e@low, e@high) < target  | move high to the left
         * sum(e@low, e@high) > target  | move low to the right
         * if(low > high) break and return null
         * O(log n)
         * */
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int lowElement = nums[low];
            int highElement = nums[high];
            if (lowElement + highElement == target) {
                return new int[]{low, high};
            } else if (lowElement + highElement > target) {
                high--;
            } else {
                low++;
            }
        }
        return null;
    }

    public static int[] twoSumUnSorted(int[] nums, int target) {
        /*
         * STRATEGY
         * While traversing throught the array, maintain a hashmap of <compliment, index>
         * compliment = target - element
         * check if the element exists in compliments, then return the map.entry
         * O(nlogn)
         * */

        Map<Integer, Integer> compliments = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (compliments.containsKey(nums[i])) {
                return new int[]{compliments.get(nums[i]), i};
            } else {
                compliments.put(target - nums[i], i);
            }
        }
        return null;
    }
}
