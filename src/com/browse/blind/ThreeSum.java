package com.browse.blind;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSumChecker(nums);

    }

    private static List<List<Integer>> threeSumChecker(int[] nums) {
        Set<List<Integer>> ts = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int first = nums[i];
            for(int j=i+1;j<nums.length;j++){
                List<Integer> l = new ArrayList<>();
                int second = nums[j];
                int third = 0 - first -second;
                if(map.containsKey(third) && map.get(third)>j){
                    l.add(first);
                    l.add(second);
                    l.add(third);
                    ts.add(l);
                }
            }
        }
        return new ArrayList<>(ts);
    }
}
