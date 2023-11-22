package com.leetcode.practice;

import java.util.Arrays;

public class FreqOfMostFreqElement {
    public static void main(String[] args) {
        int[] nums = {1,8,4,13};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }

    private static int maxFrequency(int[] nums, int k) {
        long currentSum = 0;
        int maxFreq = 0;
        Arrays.sort(nums);
        for(int l=0, r =0; r< nums.length;r++){
            currentSum += nums[r];
            //sliding window
            while(currentSum+k <(long) nums[r]*(r-l+1)){
                currentSum -= nums[l];
                l++;
            }
            maxFreq = Math.max(maxFreq, r-l+1);
        }
        return maxFreq;
    }
}
