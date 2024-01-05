package com.leetcode.practice.jpmc;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1};
        int k =1;
        System.out.println(subArrayNum(nums,k));
    }

    private static int subArrayNum(int[] nums, int k) {
        int sum = 0;
        int count =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(map.containsKey(sum-k)) count += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
