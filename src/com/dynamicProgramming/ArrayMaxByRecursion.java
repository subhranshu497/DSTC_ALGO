package com.dynamicProgramming;

public class ArrayMaxByRecursion {
    public static void main(String[] args) {
        int[] nums = {5,90,2,1,40,200,55,9};
        int n = nums.length-1;
        System.out.println(findMaxByRecursion(nums,n));
    }

    private static int findMaxByRecursion(int[] nums, int n) {
        //base case
        if(n==0) return nums[0];
        return Math.max(nums[n], findMaxByRecursion(nums, n-1));
    }
}
