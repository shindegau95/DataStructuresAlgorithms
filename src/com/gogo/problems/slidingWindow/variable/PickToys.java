package com.gogo.problems.slidingWindow.variable;

import java.util.HashMap;
import java.util.Map;

public class PickToys {
    /*
    * Problem Statement
    * John goes to mall with his mom.
    * He looks at a range of toys placed in an aisle and demands to buy them
    * His mom however tells him to pick toys consecutively.
    * However, 2 types of toys can be picked
    *
    * string = "abaccab"
    * Here, a is one type of toy and b is another type of toy
    *
    * possible combinations are
    * "aba", "acca", "ab"
    * */

    //this is actually similar to longest substring with k unique characters
    public static String solve(String str){
        int i=0,j=0;

        Map<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 1);
        String temp = "" + str.charAt(0);
        while(i<str.length() && j<str.length()){
            if(map.size() == 2){
                if(j-i+1 > temp.length() ){
                    temp = str.substring(i, j+1);
                }
                j++;
                if(j<str.length()){
                    map.putIfAbsent(str.charAt(j), 1);
                    map.computeIfPresent(str.charAt(j), (k,v) -> v+=1);
                }
            }else{
                if(map.size() > 2){
                    map.computeIfPresent(str.charAt(i), (k,v) -> v-=1);
                    if(map.get(str.charAt(i)) == 0){
                        map.remove(str.charAt(i));
                    }
                    i++;
                }else{
                    j++;
                    map.computeIfPresent(str.charAt(j), (k,v) -> v+=1);
                    map.putIfAbsent(str.charAt(j), 1);
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String str = "abaccab";
        String answer = solve(str);
        System.out.println("answer = " + answer);
    }
}
