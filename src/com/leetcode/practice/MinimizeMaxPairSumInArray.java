package com.leetcode.practice;

import java.util.Arrays;

public class MinimizeMaxPairSumInArray {
    public static void main(String[] args) {
        int [] nums = {3,5,2,3};
        System.out.println(minMaxSum(nums));
    }

    private static int minMaxSum(int [] nums) {
        int i =0;
        int j = nums.length-1;
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        while(i<j){
            max = Math.max(max, nums[i]+nums[j]);
            i++;
            j--;
        }
        return max;
    }
}
