package com.gogo.problems.slidingWindow.variable;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    /*
    * Problem Statmeent
    * s = "timetopractice"
    * t = "toc"
    *
    * find substring such that
    * t occurs 1
    * o occurs 1
    * c occurs 1
    * */

    public static String solve(String str, String pattern){

        //timetopractice, toc
        int i=0,j=0;
        String temp = str;
        Map<Character, Integer> actualMap = new HashMap<>(); //t1,o1,c1
        Map<Character, Integer> expectedMap = new HashMap<>(); //t1
        populate(expectedMap, pattern); //toc
        actualMap.put(str.charAt(j), 1);
        while(i<str.length() && j< str.length()){
            if(mapMatch(actualMap, expectedMap)){
                if(temp.length() > j-i+1){
                    temp = str.substring(i, j+1);
                }
                j++;
                actualMap.putIfAbsent(str.charAt(j), 1);
                actualMap.computeIfPresent(str.charAt(j), (k,v) -> v+=1);
            }else{
                if(getSum(actualMap, expectedMap) > getSum(expectedMap, expectedMap)){
                    actualMap.computeIfPresent(str.charAt(i), (k,v) -> v-=1);
                    if(actualMap.get(str.charAt(i)) == 0){
                        actualMap.remove(str.charAt(i));
                    }
                    i++;
                }else {
                    j++;
                    if(j< str.length()) {
                        actualMap.computeIfPresent(str.charAt(j), (k, v) -> v += 1);
                        actualMap.putIfAbsent(str.charAt(j), 1);
                    }
                }
            }
        }
        return temp;
    }

    private static int getSum(Map<Character, Integer> actualMap, Map<Character, Integer> expectedMap) {
        return actualMap.entrySet().stream().filter(e -> expectedMap.containsKey(e.getKey())).map(Map.Entry::getValue).mapToInt(Integer::intValue).sum();
    }

    private static boolean mapMatch(Map<Character, Integer> actualMap, Map<Character, Integer> expectedMap) {
        for(Map.Entry exp: expectedMap.entrySet()){
            if(exp.getValue()!=actualMap.get(exp.getKey())){
                return false;
            }
        }
        return true;
    }

    private static void populate(Map<Character, Integer> expectedMap, String pattern) {
        for(char c: pattern.toCharArray()){
            expectedMap.computeIfPresent(c, (k,v) -> v+=1);
            expectedMap.putIfAbsent(c, 1);
        }
        //t1, o1, c1
    }

    public static void main(String[] args) {
        String str = "timetopractice";
        String pattern = "toc";
        String answer = solve(str, pattern);
        System.out.println("answer = " + answer);
    }
}
