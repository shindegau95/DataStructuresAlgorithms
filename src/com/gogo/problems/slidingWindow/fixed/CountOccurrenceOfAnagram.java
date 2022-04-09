package com.gogo.problems.slidingWindow.fixed;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfAnagram {
    /**
     * Count the number of occurrences of anagram
     * for eg.
     * sub = "for"
     * string = "forxxorfxdofr"
     * */

    public static int solve(String str, String pattern){
        Map<Character, Integer> countMap = new HashMap<>();
        fillMap(pattern, countMap);
        System.out.println("countMap = " + countMap);
        int i=0, j=0;
        int count = 0;
        while(j < str.length()){
            validate(countMap, str.charAt(j));
            if(j-i+1==pattern.length()){
                if(isAnagram(countMap)){
                    count++;
                }
                refill(str.charAt(i), countMap);
                i++;
            }
            j++;
        }
        return count;
    }

    private static void refill(char c, Map<Character, Integer> countMap) {
        countMap.computeIfPresent(c, (k,v) -> v+=1);
    }

    private static boolean isAnagram(Map<Character, Integer> countMap) {
        return countMap.values().stream().allMatch(x ->  x==0);
    }

    private static void validate(Map<Character, Integer> countMap,char c){
        countMap.computeIfPresent(c, (k,v) -> v-=1);
    }

    private static void fillMap(String pattern, Map<Character, Integer> countMap) {
        for(char c: pattern.toCharArray()){
            countMap.putIfAbsent(c, 1);
            countMap.computeIfPresent(c,(k,v) -> v++);
        }
    }

    public static void main(String[] args) {
        int count = solve("forxxorfxdofr", "for");
        System.out.println("count = " + count);
    }

}
