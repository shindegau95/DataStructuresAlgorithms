package com.gogo.problems.slidingWindow.fixed;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInteger {
    /**
     * Problem statement
     * arr[] = {12,-1,-7,8, -15, 30, 16, 28}
     * int k = 3
     * */

    public static void solve(int[] arr, int k){
        int i=0, j=0;
        List<Integer> list = new ArrayList<>();
        while(j< arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1 == k){
                if(list.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(list.get(0));
                }
                if(!list.isEmpty() && arr[i] == list.get(0)){
                    list.remove(0);
                }
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{12,-1,-7,8, -15, 30, 16, 28};
        solve(arr, 3);
    }
}
