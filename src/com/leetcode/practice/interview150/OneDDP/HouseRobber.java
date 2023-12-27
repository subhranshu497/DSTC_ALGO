package com.leetcode.practice.interview150.OneDDP;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(robDPTop(nums));
    }

    private static int rob(int[] nums) {
        int [] memo = new int[nums.length+1];
        Arrays.fill(memo,-1);
        return robFrom(0, nums, memo);
    }

    private static int robFrom(int i, int[] nums, int[] memo) {
        if(i>=nums.length) return 0;
        if(memo[i]>-1) return memo[i];
        int ans = Math.max(robFrom(i+1,nums, memo), robFrom(i+2, nums, memo)+nums[i]);
        memo[i] = ans;
        return ans;
    }
    // using DP
    private static int robDP(int[] nums){
        int [] maxRobbedAmt = new int [nums.length+1];
        int n = nums.length;
        //in case of no house to rob, then robber will make profit of 0
        if(n==0) return 0;
        //in case there is only one house to rob
        maxRobbedAmt[n-1] = nums[n-1];
        // iterate from n-2 to 0
        for(int i=n-2;i>=0;i--){
            maxRobbedAmt[i] = Math.max(maxRobbedAmt[i+1], maxRobbedAmt[i+2]+nums[i]);
        }
        return maxRobbedAmt[0];
    }
    private static int robDPTop(int[] nums){
        if(nums.length==1) return nums[0];
        int[] maxRobbedAmt = new int[nums.length];
        maxRobbedAmt[0] = nums[0];
        maxRobbedAmt[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            maxRobbedAmt[i] = Math.max(maxRobbedAmt[i-1], maxRobbedAmt[i-2]+nums[i]);
        }
        return maxRobbedAmt[nums.length-1];
    }
}
