package com.leetcode.dynamicPrograming;

public class DominoTiling {
    public static void main(String[] args) {
        int n =4;
        System.out.println(dTiling(n));
    }

    private static int dTiling(int n) {
        int[] dominoDp = new int[n+1];
        if(n<=2) return n;
        dominoDp[1] = 1;
        dominoDp[2] =2;
        for(int i=3;i<=n;i++){
            dominoDp[i] = dominoDp[i-1] + dominoDp[i-2];
        }
        return dominoDp[n];
    }
}
