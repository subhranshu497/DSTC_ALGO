package com.leetcode.dynamicPrograming;

//leetcode - 1137
public class TribonacciNumber {
    public static void main(String[] args) {
        int n =4;
        System.out.println(tribonacciNumber(n));
    }

    private static int tribonacciNumber(int n) {
        if(n<3)return n>0?1:0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] =1;
        dp[2] =1;
        for(int i=3;i< dp.length;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
