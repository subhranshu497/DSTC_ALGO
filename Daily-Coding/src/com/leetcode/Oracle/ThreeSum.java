package com.leetcode.Oracle;

import java.util.*;

/**
 * Leetcode #15
 */
public class ThreeSum {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> results = threeSumToZero(nums);
        System.out.println(results);
    }

    private static List<List<Integer>> threeSumToZero(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int i =0;
        while(i<nums.length){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                if(sum < 0) j++;
                else k--;
            }
            i++;
        }
        return ans.stream().toList();
    }
}
