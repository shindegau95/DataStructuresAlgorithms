package com.gogo.problems.dynamicProgramming.ZeroOne.equalSumPartition;

import com.gogo.problems.dynamicProgramming.ZeroOne.subsetSum.SubsetSumRecursive;

import java.util.Arrays;
import java.util.stream.Stream;

public class EqualSumPartitionRecursive {
    /*
    * Input
    * arr[] = {1,5,11,5}
    * output = true or false, i.e. if the array can be divided in 2 subsets such that their sum is equal
    * for eg. {11} {1,5,5}
    * */

    /*
    * Sum of both subsets = S + S = 2S
    * so this is possible only when sum of both subsets is even
    * */

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,11,5};
        int n = arr.length;
        int sum = Arrays.stream(arr).sum();
        boolean isPossible;
        if(sum%2 == 0){
            isPossible = SubsetSumRecursive.solve(arr, sum/2, n-1);
        }else{
            isPossible =  false;
        }

        if(isPossible){
            System.out.println("Sum possible");
        }else{
            System.out.println("Sum not possible");
        }
    }
}
