package com.leetcode.Oracle;

import java.util.*;

/**
 * leetcode problem 697
 */
public class DegreeOfAnArray {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }

    private static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            left.putIfAbsent(num, i);
            right.put(num, i);
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for(int num : count.keySet()){
            if(count.get(num)==degree){
                ans = Math.min(ans, right.get(num)-left.get(num)+1);
            }
        }
        return ans;
    }
}
