package com.gogo.problems.arrays;

public class Sort012 {
    /**
    * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
    * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    * You must solve this problem without using the library's sort function.
    * */

    /**
    * Input: nums = [2,0,2,1,1,0]
    * Output: [0,0,1,1,2,2]
    * */

    /**
     * Input: nums = [2,0,1]
     * Output: [0,1,2]
     * */
    public void sortColors(int[] nums) {
        //Brute force
        /*
        * traverse through the array
        * whenever you encounter a[i] such that a[i] > a[i+1]
        * swap a[i+1] with every previous index till it is less than or equal to the previous
        *
        * This takes n^2 time at its worst
        * */

        /*for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]){
                for(int j=i+1; j>0; j--){
                    if(nums[j] < nums[j-1]){
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }else{
                        break;
                    }
                }
            }
        }*/

        /**
         * Better approach is to count 0, 1 and 2
         * and then populate using the values
         * */
        int count0 = 0, count1=0, count2=0;
        for(int n: nums){
            if(n==0){
                count0++;
            }else if(n==1){
                count1++;
            }else{
                count2++;
            }
        }

        int i = 0;
        while(count0-- > 0){
            nums[i++] = 0;
        }
        while(count1-- > 0){
            nums[i++] = 1;
        }
        while(count2-- > 0){
            nums[i++] = 2;
        }

        for (int n: nums) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        new Sort012().sortColors(nums);
    }
}
