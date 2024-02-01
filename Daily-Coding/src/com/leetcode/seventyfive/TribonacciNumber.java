package com.leetcode.seventyfive;

public class TribonacciNumber
{
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tribonacci(n));
    }

    private static int tribonacci(int n) {
        if (n < 3) {
            return n > 0 ? 1 : 0;
        }
        int[] tribonacciSeq = new int[n+1];
        tribonacciSeq[0] = 0;
        tribonacciSeq[1] = 1;
        tribonacciSeq[2] = 1;
        for(int i=3;i<tribonacciSeq.length;i++){
            tribonacciSeq[i]= tribonacciSeq[i-3]+tribonacciSeq[i-2]+tribonacciSeq[i-1];
        }
        return tribonacciSeq[n];
    }
}
