package com.leetcode.daily;

import java.util.HashMap;
import java.util.Map;

public class TwoSumAgain {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int [] result = twoSum(nums, target);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i =0;i< nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && i !=map.get(complement)){
                result[0]=map.get(complement);
                result[1]= i;
            }
        }
       return result;
    }
}
