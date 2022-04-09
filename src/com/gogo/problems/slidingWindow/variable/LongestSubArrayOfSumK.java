package com.gogo.problems.slidingWindow.variable;

import java.util.ArrayList;
import java.util.List;

public class LongestSubArrayOfSumK {

    /*
    * Problem statement
    * arr[] = {4,1,1,1,2,3,5}
    * sum = 5
    * */

    public static int solve(int[] arr, int target){
        int i=0, j=0;
        int sum = arr[0];
        int max = 0;
        while(j<arr.length && i<arr.length){
            if(sum == target){
                max = Math.max(max, j-i+1);
                sum-=arr[i];
                i++;
            }
            else{
                if(sum<target){
                    j++;
                    sum+=arr[j];
                }else{
                    sum-=arr[i];
                    i++;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,1,1,2,3,5};
        int max = solve(arr, 5);
        System.out.println("max = " + max);
    }

}
