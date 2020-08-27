package com.gogo.problems.arrays;


import com.sun.istack.internal.NotNull;

public class MergeSortedArrayProblem {

    public static int[] mergeSortedArray(@NotNull int[] a, @NotNull int[] b) {
        //brute force
        /*
         * end array will have a size equal to a.size + b.size
         * let i = iterator on a, j = iterator on b
         * compare a[i] with a[j] and put the smaller one in merged
         * O(a+b)
         * */
        int totalSize = a.length + b.length;
        int[] merged = new int[totalSize];
        int i = 0, j = 0, k = 0;
        for (; i < a.length || j < b.length; ) {
            if (i == a.length) {
                merged[k++] = b[j++];
                continue;
            } else if (j == b.length) {
                merged[k++] = a[i++];
                continue;
            }
            if (a[i] >= b[j]) {
                merged[k++] = b[j++];
            } else {
                merged[k++] = a[i++];
            }
        }
        return merged;
    }
}
