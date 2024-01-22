package com.leetcode.daily;

import java.util.*;

public class ThreeSumAgain {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        return new ArrayList<>(result);
    }
}
