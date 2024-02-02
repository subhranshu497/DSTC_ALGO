package com.leetcode.Oracle;

public class PowerXN {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        double res = powerCalculator(x,n);
    }

    /**
     * this will throw TLE
     * @param x
     * @param n
     * @return
     */
    private static double powerCalculator(int x, int n) {
        double result = 1;
        int power =0;
        if(n<0) power = Math.abs(n);
        else power = n;
        for(int i=1;i<=power;i++){
            result *=x;
        }
        if(n<0) return 1/result;
        return result;
    }
    private static double powerCalculatorRecursion(int x, int n) {
        if(n==0) return 1;
        if(n<1) return 1/powerCalculatorRecursion(x, -n);;
        return x * powerCalculatorRecursion(x, n-1);
    }
}
