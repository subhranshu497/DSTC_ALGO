package com.leetcode.seventyfive;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCost(cost));
    }

    private static int minCost(int[] cost) {
        int [] minCost=new int[cost.length+1];
        for(int i=2;i<=cost.length;i++){
            int oneStep = cost[i-1]+minCost[i-1];//15
            int twoStep = cost[i-2]+minCost[i-2];//10
            minCost[i]= Math.min(oneStep, twoStep);
        }
        return minCost[minCost.length-1];
    }
}
