package com.gogo.problems.arrays;

public class RotateImage {
    /*
    * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
    * */

    /**
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]]
     * */

    /**
     * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
     * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
     */

    public void rotate(int[][] matrix) {
        /*
         * Steps
         * 1) transpose the array i.e. row becomes column and vice versa
         * 2) reverse
         * */

        transpose(matrix);
        reverse(matrix);


    }

    private void reverse(int[][] transpose) {
        for(int i=0;i< transpose.length; i++){
            //every row in transpose
            int mid = transpose[i].length/2;
            for (int j = 0; j < mid; j++) {
                int temp = transpose[i][j];
                transpose[i][j] = transpose[i][transpose.length-1-j];
                transpose[i][transpose.length -1 -j] = temp;
            }
        }
    }

    private void transpose(int[][] matrix) {
        // [[1,2,3],[4,5,6],[7,8,9]]
        // [[1,4,7],[2,5,8],[3,6,9]]
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        new RotateImage().rotate(matrix);
        print(matrix);
    }

    private static void print(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
