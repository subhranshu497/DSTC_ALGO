package com.leetcode.practice;

import java.util.Arrays;

public class SortIntByNoOfOneBit {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8};
        String [] result = sortedByOneBit(nums);
    }

    private static String[] sortedByOneBit(int[] nums) {
        String[] result = new String[nums.length];
        for(int i=0;i<nums.length;i++){
           String s= Integer.toBinaryString(nums[i]); //0 1
            Arrays.sort(s.toCharArray());
            System.out.println(s);
            result[i] = s;
        }
        return result;
    }
}
