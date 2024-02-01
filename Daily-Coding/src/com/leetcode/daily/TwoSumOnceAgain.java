package com.leetcode.daily;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOnceAgain {
    public static void main(String[] args) {
        int [] nums = {3,3};
        int target = 6;
        int [] result =tsoa(nums, target);
        System.out.println(result[0]+"    "+result[1]);
    }

    private static int[] tsoa(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++){
            numMap.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement)&& i != numMap.get(complement)){
                result[0] = i;
                result[1] = numMap.get(complement);
                return result;
            }
        }
        return result;
    }
}
