package com.browse.blind75.day1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,2};
        System.out.println(checkDuplicate(nums));
    }

    private static boolean checkDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
