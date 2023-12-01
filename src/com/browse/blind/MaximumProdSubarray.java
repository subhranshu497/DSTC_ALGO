package com.browse.blind;

public class MaximumProdSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProdSubArr(nums));
    }

    private static int maxProdSubArr(int[] nums) {
        //using two pointer technique and kadane algo
        int left = Integer.MIN_VALUE;
        int rigth = Integer.MIN_VALUE;
        int cs = 1;
        //first trverse the array forward
        for(int i=0;i<nums.length;i++){
            cs = cs*nums[i];
            left = Math.max(cs, left);
            if(cs == 0) cs =1;
        }
        cs =1;
        //then traverse the array backward
        for(int i = nums.length-1;i>=0;i--){
            cs = cs * nums[i];
            rigth = Math.max(cs,rigth);
            if(cs == 0) cs =1;
        }
        return Math.max(left, rigth);
    }
}
