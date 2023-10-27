package com.dynamicProgramming;

public class DigitSumRecursion {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(digitSum(n));
    }

    private static int digitSum(int n) {
        if(n == 0) return 0;
        int digit = n%10;
        return digit+digitSum(n/10);
    }
}
