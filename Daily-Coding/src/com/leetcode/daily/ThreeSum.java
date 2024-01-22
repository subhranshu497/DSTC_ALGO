package com.leetcode.daily;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = findThreeSum(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> findThreeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums); // -4, -1, -1, 0, 1, 2
        for(int i=0;i<nums.length;i++){
            int j =i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                }
                else if(sum <0){
                    j++;
                }
                else k--;
            }
        }
        return result.stream().toList();
    }
}
