package com.leetcode.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int [] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] results = divideArray(nums, k);
        for(int i=0;i<results.length;i++){
            for(int j=0;j<results[0].length;j++){
                System.out.print(results[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] divideArray(int[] nums, int k) {
        int len = nums.length; // 1,1,3,3,4,5,7,8,9
        int m = len/3;
        int[][] result = new int[m][3];
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i =2;
        while(i<len){
            if(nums[i]-nums[i-2]>k){
                return new int [0][0];
            }
            result[i/3] = new int[]{nums[i-2], nums[i-1], nums[i]};
            i=i+3;
        }
        return result;
    }
}
