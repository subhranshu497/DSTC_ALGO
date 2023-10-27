package com.dynamicProgramming;

public class ArrayInSeqRecursion {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int n = nums.length-1;
        System.out.println(arrayInSeqCheck(nums,n));
    }

    private static boolean arrayInSeqCheck(int[] nums, int n) {
        //base case
        return n== 0 || (nums[n]==nums[n-1]+1 && arrayInSeqCheck(nums, n-1));
    }
}
