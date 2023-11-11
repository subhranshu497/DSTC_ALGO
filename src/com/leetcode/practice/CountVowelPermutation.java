package com.leetcode.practice;

public class CountVowelPermutation {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(countVowelPermutationCheck(n));
    }

    private static int countVowelPermutationCheck(int n) {
        final int mod = 1000000007;
        long a=1l;
        long e =1l;
        long i =1l;
        long o=1l;
        long u=1l;
        for(int j=1;j<n;j++){
            long aNext = e;
            long eNext = (a+i)%mod;
            long iNext = (a+e+o+u) %mod;
            long oNext = (i+u) %mod;
            long uNext = a;

            a = aNext;
            e = eNext;
            i = iNext;
            o = oNext;
            u = uNext;
        }
        return (int) ((a+e+i+o+u) %mod);
    }
}
