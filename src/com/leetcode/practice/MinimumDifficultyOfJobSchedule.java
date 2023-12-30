package com.leetcode.practice;

import java.util.Arrays;

public class MinimumDifficultyOfJobSchedule {
    public static void main(String[] args) {
        int [] jobSchedule = {6,5,4,3,2,1};
        int d =2;
        System.out.println(minDifficulty(jobSchedule, d));
    }

    private static int minDifficulty(int[] jobSchedule, int d) {
        if(jobSchedule.length < d) return -1;
        int [][] dp = new int[d+1][jobSchedule.length];
        for(int [] p:dp) Arrays.fill(p, -1);
        return dfs(jobSchedule, d, dp,0);
    }

    private static int dfs(int[] jobSchedule, int d, int[][] dp, int idx) {
        if(d == 1){
            int max =0;
            while(idx < jobSchedule.length) max = Math.max(max, jobSchedule[idx++]);
            return max;
        }
        if(dp[d][idx] != -1) return dp[d][idx];
        int max = 0;
        int res = Integer.MAX_VALUE;
        for(int i = idx;i<jobSchedule.length-d+1;i++){
            max = Math.max(max, jobSchedule[i]);
            res = Math.min(res, max+dfs(jobSchedule, d-1,dp,i+1));
        }
        return dp[d][idx] = res;
    }
}
