package com.gogo.problems.arrays;

public class kLargestNumbersInArray {
    /*
     * Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.
     * eg.  [1, 23, 12, 9, 30, 2, 50]
     * k =3
     * 50, 30 and 23
     * */

    public int[] getKLargest(int[] arr, int k) {
        //brute force
        //walt through the array and fill the answer with the max found
        //need to check only if its bigger than the smallest in that array
        // 23 30 50
        int[] answer = new int[k];
        for (int i = 0; i < arr.length; i++) {
            //going through each element of the list
            for (int j = 0; j < k; j++) {
                if (answer[j] == 0) {
                    answer[j] = arr[i];
                    break;
                }
                if (arr[i] > answer[j]) {
                    //cascade ahead of j
                    for (int x = k - 1; x > j; x--) {
                        answer[x] = answer[x - 1];
                    }
                    answer[j] = arr[i];
                    break;
                }
            }
        }

        return answer;
    }

    /*
     * dry run
     * [1, 23, 12, 9, 30, 2, 50]
     * [50, 30, 23]
     * */
}


