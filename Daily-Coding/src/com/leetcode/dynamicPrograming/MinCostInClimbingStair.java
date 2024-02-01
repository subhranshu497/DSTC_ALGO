package com.leetcode.dynamicPrograming;

public class MinCostInClimbingStair {
    public static void main(String[] args) {
        int [] cost = {10,15,20};
        System.out.println(minCostClimbingStair(cost));
    }

    private static int minCostClimbingStair(int[] cost) {
        int dp[] = new int[cost.length+1];
        for(int i=2;i<=cost.length;i++){
            int oneMove = cost[i-1]+dp[i-1];
            int twoMove = cost[i-2]+dp[i-2];
            dp[i] =Math.min(oneMove, twoMove);
        }
        return dp[dp.length-1];
    }
}
