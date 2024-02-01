package com.leetcode.dynamicPrograming;

/**
 * Leetcode 790
 */
public class DominoAndTrominoTiling {
    public static void main(String[] args) {
        int n =30;
        System.out.println(numTilings(n));
    }

    private static int numTilings(int n) {
        Long mod = 1000000007L;
        long[] dp = new long[n+3];
        if(n ==1) return 1;
        if(n == 2) return 2;
        if(n==3) return 5;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] =5;
            for(int i=4;i<=n;i++){
                dp[i] =(int) ((2*dp[i-1]%mod)+dp[i-3]%mod) % mod;
            }
            return (int)dp[n];
    }
}
