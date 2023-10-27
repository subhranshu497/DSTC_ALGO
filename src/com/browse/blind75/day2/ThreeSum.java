package com.browse.blind75.day2;

import com.algo.arraysExample.Array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSumCheck(nums));
    }

    private static List<List<Integer>> threeSumCheck(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if(nums ==null && nums.length <3) return new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //two pointer technique. One from the left and other from right
            //Pick ith element as constant

            int left = i+1;
            int right = nums.length-1;
            while(left <right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
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
