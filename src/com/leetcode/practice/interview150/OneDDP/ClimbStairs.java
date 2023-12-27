package com.leetcode.practice.interview150.OneDDP;

public class ClimbStairs {
    public static void main(String[] args) {
        int noOfSteps = 3;
        System.out.println(climbStairs(noOfSteps));
    }

    private static int climbStairs(int noOfSteps) {
        int [] memo = new int[noOfSteps+1];
        return climbStair(0,noOfSteps, memo);
    }
    //using memoiztion
    private static int climbStair(int i, int noOfSteps, int[] memo) {
        if(i>noOfSteps) return 0;
        if(i == noOfSteps) return 1;
        if(memo[i]>0) return memo[i];
        memo[i] = climbStair(i+1,noOfSteps,memo)+climbStair(i+2,noOfSteps,memo);
        return memo[i];
    }
}
