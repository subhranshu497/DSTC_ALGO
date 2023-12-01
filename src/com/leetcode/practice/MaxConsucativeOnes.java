package com.leetcode.practice;

public class MaxConsucativeOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(countOne(nums));
    }

    private static int countOne(int[] nums) {
        int currentCount = 0;
        int prevCount = 0;
        int maxCount = 0;
        for(int num:nums){
            if(num == 1) currentCount++;
            else{
                prevCount = currentCount+1;
                currentCount = 0;
            }
            maxCount = Math.max(maxCount, currentCount+prevCount);
        }
        return maxCount;
    }

}
