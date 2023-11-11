package com.leetcode.practice;

public class AntFallLastMoment {
    public static void main(String[] args) {
        int n = 4;
        int [] left = {4,3};
        int [] right = {0,1};
        System.out.println(getLastMoment(n, left, right));
    }
    public static int getLastMoment(int n, int[] left, int[] right) {
        int max = 0;

        for(int i=0;i<left.length;i++){
            max = Math.max(max, left[i]-0);
        }

        for(int i=0;i<right.length;i++){
            max = Math.max(max, n - right[i]);
        }
        return max;
    }

}
