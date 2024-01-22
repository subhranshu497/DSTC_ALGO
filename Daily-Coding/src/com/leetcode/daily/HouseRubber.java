package com.leetcode.daily;

import com.sun.security.jgss.GSSUtil;

//Leetcode # 198
public class HouseRubber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        //int[] nums = {1,2};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        int [] maxRobbedAmount = new int[nums.length];
        maxRobbedAmount[0] = nums[0];
        maxRobbedAmount[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            maxRobbedAmount[i] = Math.max(maxRobbedAmount[i-1], maxRobbedAmount[i-2]+nums[i]);
        }
        return maxRobbedAmount[maxRobbedAmount.length-1];
    }
}
