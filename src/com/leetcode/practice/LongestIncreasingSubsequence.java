package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(longestSub(nums));
    }

    private static int longestSub(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        for(int i=1; i<nums.length;i++){
            int num = nums[i];
            if(num>sub.get(sub.size()-1)){
                sub.add(num);
            }
            else{
                int j =0;
                while(num > sub.get(j)){
                    j +=1;
                }
                sub.set(j,num);
            }
        }
        return sub.size();
    }
}
