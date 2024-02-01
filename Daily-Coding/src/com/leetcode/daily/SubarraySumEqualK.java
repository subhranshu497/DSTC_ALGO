package com.leetcode.daily;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int target = 2;
        System.out.println(subArraySum(nums,target));

    }

    public static int subArraySum(int[] nums, int target) {
        int count =0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum +=num;
            if(map.containsKey(sum-target)) count +=map.get(sum-target);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
