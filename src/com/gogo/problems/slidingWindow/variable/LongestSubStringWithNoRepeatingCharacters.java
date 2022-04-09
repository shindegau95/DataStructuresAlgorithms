package com.gogo.problems.slidingWindow.variable;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithNoRepeatingCharacters {
    /*
    * str = "bwwkew"
    * */

    public static String solve(String str){
        int i=0,j=0;
        String temp = String.valueOf(str.charAt(0));
        Map<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 1);
        while(j<str.length() && i<str.length()){
            if(isNonRepeating(map)){
                if(str.substring(i, j+1).length() > temp.length()){
                    temp = str.substring(i, j+1);
                }
                j++;
                if(j<str.length()){
                    map.computeIfPresent(str.charAt(j), (k,v) -> v+=1);
                    map.putIfAbsent(str.charAt(j), 1);
                }
            }else{
                map.computeIfPresent(str.charAt(i), (k,v) -> v-=1);
                if(map.get(str.charAt(i)) == 0){
                    map.remove(str.charAt(i));
                }
                i++;
            }
        }
        return temp;
    }

    private static boolean isNonRepeating(Map<Character, Integer> map) {
        return map.values().stream().allMatch(x -> x==1);
    }

    public static void main(String[] args) {
        String str = "bwwkew";
        String answer = solve(str);
        System.out.println("answer = " + answer);
    }
}
