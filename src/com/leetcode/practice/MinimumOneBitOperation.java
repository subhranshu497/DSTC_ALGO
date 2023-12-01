package com.leetcode.practice;

public class MinimumOneBitOperation {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(minOneBitOperation(n));
    }

    private static int minOneBitOperation(int n) {
        if(n<=1) return n;
        int count =0;
        while((1<<count)<=n) count++;
        return ((1<<count)-1) - minOneBitOperation(n-(1<<(count)-1));
    }
}
