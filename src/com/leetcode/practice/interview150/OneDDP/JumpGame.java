package com.leetcode.practice.interview150.OneDDP;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        int i =0;
        int max  =0;
        while(i<nums.length){
            if(i>max) return false;
            max = Math.max(max, nums[i]+i);
            i++;
        }
        return true;
    }
}
