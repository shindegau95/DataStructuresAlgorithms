package com.gogo.problems.slidingWindow.variable;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithKUniqueCharacters {
    /*
    * str = "aabacbebebe"
    * k=3
    * */

    public static int solve(String str, int k){
        int i=0, j=0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0),1);
        while(i<str.length() && j<str.length()){

            if(map.size() == k){
                max = Math.max(max, j-i+1);
                Character c = str.charAt(i);
                if(map.get(c) == 1){
                    map.remove(c);
                }else{
                    map.computeIfPresent(c, (key,v) -> v-=1);
                }
                i++;
            }else{
                if(map.size() < k){
                    j++;
                    if(j<str.length()){
                        map.computeIfPresent(str.charAt(j), (key,v) -> v+=1);
                        map.putIfAbsent(str.charAt(j), 1);
                    }
                }else{
                    Character c = str.charAt(i);
                    if(map.get(c) == 1){
                        map.remove(c);
                    }else{
                        map.computeIfPresent(c, (key,v) -> v-=1);
                    }
                    i++;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max = solve("aabacbebebe", 3);
        System.out.println("max = " + max);
    }
}
