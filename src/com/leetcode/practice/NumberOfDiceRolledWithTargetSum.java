package com.leetcode.practice;

public class NumberOfDiceRolledWithTargetSum {
    public static void main(String[] args) {
        System.out.println(numsRolledToTarget(2,6,7));
    }

    private static int numsRolledToTarget(int n, int k, int target) {
        int [][] dp = new int[n+1][target+1];
        dp[0][0] = 1;
        int mod = (int)1e9+7;
        for(int dice=1;dice<=n;dice++){
            for(int val=0;val<=target;val++){
                for(int face=1;face<=k;face++){
                    if(val < face)continue;
                    dp[dice][val] = (dp[dice][val]+dp[dice-1][val-face]) % mod;
                }
            }
        }
        return dp[n][target];
    }
}
