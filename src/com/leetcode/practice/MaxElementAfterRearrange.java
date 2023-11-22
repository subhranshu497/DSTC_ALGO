package com.leetcode.practice;

import java.util.Arrays;

public class MaxElementAfterRearrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }

    private static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0] !=1) arr[0] = 1;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i] - arr[i-1]) > 1) arr[i] = arr[i-1]+1;
        }
        return arr[arr.length-1];
    }
}
