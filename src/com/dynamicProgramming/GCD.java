package com.dynamicProgramming;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcdCalcultion(24,9));
    }

    private static int gcdCalcultion(int a, int b) {

        if(a%b==0) return b;
        return gcdCalcultion(b, a%b);
    }
}
