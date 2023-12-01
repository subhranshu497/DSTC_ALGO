package com.browse.blind;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int [] result = TwoSumCalcuator(nums, target);
        System.out.println(result[0]+",  "+result[1]);
    }

    private static int[] TwoSumCalcuator(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int j=0;j< nums.length;j++){
            int complement = target - nums[j];
            if(map.containsKey(complement)&& map.get(complement)!=j){
                return new int[]{j, map.get(complement)};
            }
        }
        return new int[]{};
    }

}
