package com.leetcode.daily;

public class KthInversePair {
    private static Integer[][] dp = new Integer[1001][1001];
    public static void main(String[] args) {
        int n =4;
        int k =1;
        System.out.println(kthInversePair(n,k));
    }

    private static int kthInversePair(int n, int k) {
        if(n==0) return 0;
        if(k==0) return 1;
        if(dp[n][k]!=null) return dp[n][k];

        int count=0;
        for(int i=0;i<=Math.min(k,n-1);i++)
        {
            count=(count+kthInversePair(n-1,k-i))%1000000007;
        }
        dp[n][k] = count;

        return dp[n][k];
    }
}
