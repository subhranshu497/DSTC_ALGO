package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOpsMakeArrayEmpty {
    public static void main(String[] args) {
        int [] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOps(nums));
    }

    private static int minOps(int[] nums) {
        if(nums.length ==1) return -1;
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> e:freqMap.entrySet()){
            int value = e.getValue();
            if(value == 1) return -1;
            count +=Math.ceil((double)value/3);
        }
        return count;
    }
}
