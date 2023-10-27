package com.browse.blind75.day2;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumCalculate(nums));
    }

    private static int maxSumCalculate(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            sum = Math.max(0,sum)+num;
            max = Math.max(sum,max);
        }
        return max;
    }
}
