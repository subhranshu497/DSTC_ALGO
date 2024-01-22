package com.leetcode.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,-15,11,15};
        List<Integer> result = twoSumImpl(nums);
        System.out.println(result);
    }

    private static List<Integer> twoSumImpl(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        System.out.println(map);
        for(int i=0;i<nums.length;i++){
            int complement = 0 -nums[i];
            if(map.containsKey(complement) && map.get(complement) !=i){
                result.add(i);
                result.add(map.get(complement));
                return result;
            }
        }
        return null;
    }
}
