package com.leetcode.dynamicPrograming;

public class HouseRobber {
    public static void main(String[] args) {
        int [] houses = {1,2,3,1};
        System.out.println(maxRob(houses));
    }

    private static int maxRob(int[] houses) {
        int[] dp = new int[houses.length];
        if(houses.length==1) return houses[0];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0],houses[1]);
        for(int i=2;i<houses.length;i++){
            dp[i] = Math.max(dp[i-2]+houses[i], dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
