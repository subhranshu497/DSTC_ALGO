package com.leetcode.practice;

import java.util.Arrays;

public class MaximumNoOfCoins {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxPiles(piles));
    }

    private static int maxPiles(int[] piles) {
        int len = piles.length;
        int iter = len/3;
        int result =0;
        int jump = 0;
        Arrays.sort(piles);
        while(iter >0){
            result += piles[len-2-jump];
            jump =jump+2;
            iter--;
        }
        return result;
    }
}
