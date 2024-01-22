package com.leetcode.daily;

public class FindValueOfANumberRaisedToItsReverse {
    public static void main(String[] args) {
        int n = 30;
        int r = 03;
        System.out.println(powerOfNum(n,r));
    }

    private static long powerOfNum(int n, int r) {
        if(n==0) return 0;
        if(r==0) return 1;
        long mod = 1000000007;
        return (n*powerOfNum(n, r-1)) % mod;

    }
}
