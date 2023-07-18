package com.leetcode.practice;

public class RestructureArray {
    public static void main(String[] args) {
        int [] digits = {0,1,2,0,3,-1,0}; // output - 1,2,3,-1,0,0,0
        int [] results = reArrange(digits);
        for(int i=0;i<results.length;i++){
            System.out.print(results[i]+" ");
        }

    }
    private static int[] reArrange(int[] digits) {
        int k =0;
        int [] results = new int[digits.length];
        for(int i=0;i<digits.length;i++){
            if(digits[i] !=0){
                results[k] = digits[i];
                k++;
            }
        }
        return results;
    }
}
