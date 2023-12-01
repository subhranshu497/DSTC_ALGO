package com.browse.blind;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArraySum(nums));
    }

    private static int subArraySum(int[] nums) {
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int num :nums){
            sum = Math.max(0, sum)+num;
            max = Math.max(max, sum);
        }
        return max;
    }
}
