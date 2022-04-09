package com.gogo.problems.slidingWindow.fixed;

import java.util.*;

public class MaximumOfAllSubArrayOfSizeK {

    /**
     * for every sub array or window find the maximum in that subarray
     * arr[] = {1,3,-1,-3,5,3,6,7}
     * k = 3
     * */

    public static void solve(int[] arr, int k){
        /*
        * Brute force
        * for every window calculating the max will be an overhead
        * complexity will be n^2
        *
        * to reduce this we can find the max for a subArray
        * */
        int i=0, j=0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int max = arr[0];
        while(j<arr.length){
            queue.add(arr[j]);
            if(j-i+1 == k){
                System.out.println(queue.peek());
                queue.remove(arr[i]);
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        solve(arr, 3);
    }
}
