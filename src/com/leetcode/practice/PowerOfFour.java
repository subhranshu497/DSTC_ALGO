package com.leetcode.practice;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(checkPowerOfFour(n));
    }

    private static boolean checkPowerOfFour(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 4 ==0) {
            n = n / 4;
        }
        else return false;
        return checkPowerOfFour(n);
    }
}
