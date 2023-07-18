package com.leetcode.practice;

import java.util.HashSet;
import java.util.Set;

public class ContainsDups {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containsDuplicates(nums));
    }

    private static boolean containsDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(nums.length == set.size()) return false;
        return true;
    }
}
