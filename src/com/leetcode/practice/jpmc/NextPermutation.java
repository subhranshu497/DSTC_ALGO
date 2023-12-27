package com.leetcode.practice.jpmc;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,5,8,4,7,6,5,3,1};
        nextPerm(nums);
    }

    private static void nextPerm(int[] nums) {
        //find the pivot point
        int n = nums.length; //9
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        //find the elment to swap
        if(i>=0){
            int j = n-1;
            while(nums[j] <=nums[i]) j--;
            swap(nums, i, j);
        }
        //to minimize the value
        reverse(nums, i+1);
    }

    private static void reverse(int[] nums, int start) {
        int j = nums.length-1;
        while(start <j){
            swap(nums,start,j);
            start++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
