package com.tryexponent;

import java.util.HashMap;
import java.util.Map;

public class SumOfEleSubarrayMultipleOfK {
    public static void main(String[] args) {
        int[] nums = null;
        int k =6;
        System.out.println(IsMultipleExists(nums,k));
    }

    private static boolean IsMultipleExists(int[] nums, int k) {
        int lengthOfSubArray = 2;
        int sum = 0;
        if(nums == null) return false;
        if(nums.length <=1) return false;
        Map<Integer, Integer> modMap = new HashMap<>(Map.of(0,-1));
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            Integer firstIndex = modMap.get(sum % k);
            if(firstIndex == null){
                modMap.put(sum%k, i);
            }
            else if(i-firstIndex >= lengthOfSubArray) return  true;
        }
        return false;
    }
}
