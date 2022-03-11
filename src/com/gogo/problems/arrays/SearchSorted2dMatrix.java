package com.gogo.problems.arrays;

public class SearchSorted2dMatrix {
    /**
     * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
     *
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the previous row.
     *
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * Output: true
     *
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     * Output: false
     */

    public boolean searchMatrix(int[][] matrix, int target) {
        //Brute force
        /*
        * Implement a modification of binary search
        * */

        return binarySearchOuter(matrix, 0, matrix.length, target);
    }

    private boolean binarySearchOuter(int[][] matrix, int rowStart, int rowEnd, int target) {
        int columns = matrix[0].length;
        int mid = (rowStart + rowEnd-1)/2;
        if(rowStart <= rowEnd){
            if(target == matrix[mid][0]){
                return true;
            }else if(target > matrix[mid][0] && target < matrix[mid][columns-1]){
                return binarySearchInner(matrix[mid], 0, columns, target);
            }else if(target < matrix[mid][0]){
                return binarySearchOuter(matrix, rowStart, mid-1, target);
            }else if(target > matrix[mid][columns-1]){
                return binarySearchOuter(matrix, mid+1, rowEnd, target);
            }
        }
        return false;
    }

    private boolean binarySearchInner(int[] matrix, int start, int end, int target) {
        int mid = (start + end-1)/2;
        if(start <= end){
            if(target == matrix[mid]){
                return true;
            }else if(target < matrix[mid]){
                return binarySearchInner(matrix, start, mid-1, target);
            }else if(target > matrix[mid]){
                return binarySearchInner(matrix, mid+1, end, target);
            }else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1}
        };
        System.out.println(new SearchSorted2dMatrix().searchMatrix(matrix, 13));
    }
}
