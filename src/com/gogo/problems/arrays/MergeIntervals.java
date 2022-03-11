package com.gogo.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeIntervals {

    /**
     * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
     *
     * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
     *
     * Input: intervals = [[1,4],[4,5]]
     * Output: [[1,5]]
     * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
     * */
    public int[][] merge(int[][] intervals) {
        //sort
        List<int[]> collect = Arrays.stream(intervals).sorted((a, b) -> a[0] - b[0]).collect(Collectors.toList());
        print(collect);

        //logic to merge intervals
        List<int[]> answers = new ArrayList<>();
        answers.add(collect.get(0));
        for (int[] interval: collect) {
            if(answers.get(answers.size()-1)[1] >= interval[0]){
                answers.get(answers.size()-1)[1] = Math.max(interval[1], answers.get(answers.size()-1)[1]);
            }else{
                answers.add(interval);
            }
        }

        int[][] a = new int[answers.size()][];
        for(int i=0; i<answers.size(); i++){
            a[i] = answers.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {2,6},
                {1,3},
                {8,10},
                {15,18}
        };
        print(new MergeIntervals().merge(intervals));
    }

    private static void print(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void print(List<int[]> a){
        for (int[] i: a) {
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
