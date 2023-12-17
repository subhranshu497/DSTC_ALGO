package com.leetcode.practice;

import java.util.Arrays;

public class MaxProdOfTwoElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProdWithoutSorting(nums));
    }

    private static int maxProd(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
    //max prod without sorting
     private static int maxProdWithoutSorting(int[] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int num :nums){
            if(num >= max1){
                max2 = max1;
                max1 = num;
            }
            else if(num > max2) max2 = num;
        }
        return (max1-1)*(max2-1);
     }
}
