package com.leetcode.practice;

public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingBits(n));
    }

    private static int hammingBits(int n) {
        int count =0;
        while(n !=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
