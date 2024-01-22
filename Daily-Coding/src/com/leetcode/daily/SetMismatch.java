package com.leetcode.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetMismatch {
    public static void main(String[] args) {
        int [] nums = {2,2};
        int[] result = findErrorNums(nums);
        for(int num: result){
            System.out.print(num+", ");
        }
    }

    private static int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int missing = 0;
        int duplicate =-1;
        for(int i =0;i<nums.length;i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        for(int i =1;i<= nums.length;i++){
            if(freqMap.containsKey(i)){
                if(freqMap.get(i)==2){
                    duplicate = i;
                }
            }
            else missing =i;
        }
        return new int[]{duplicate, missing};
    }
}
