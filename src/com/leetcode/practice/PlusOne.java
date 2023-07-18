package com.leetcode.practice;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {9};
        int [] results =plusOneArray(digits);
        for(int i=0;i<results.length;i++){
            System.out.print(results[i]+" ");
        }

    }

    private static int[] plusOneArray(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i] <9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] =0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
