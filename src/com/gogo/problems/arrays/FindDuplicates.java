package com.gogo.problems.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    /**
     * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
     * You must write an algorithm that runs in O(n) time and uses only constant extra space.
     * */

    /**
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Input: nums = [1]
     * Output: []
     * */

    public List<Integer> findDuplicates(int[] nums) {
        //brute force use map

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(countMap.get(nums[i]) != null){
                int count = countMap.get(nums[i]);
                countMap.put(nums[i], count + 1);
            }else{
                countMap.put(nums[i], 1);
            }
        }
        return countMap.entrySet().stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(new FindDuplicates().findDuplicates(nums));
    }
}
