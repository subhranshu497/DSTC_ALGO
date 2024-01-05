package com.leetcode.practice;

import java.util.*;

public class ConvertArrayTo2DArray {
    public static void main(String[] args) {
        int [] nums = {1,3,4,1,2,3,1};
        List<List<Integer>> results = findMatrix(nums);
    }

    private static List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count0 = 0;
        List<List<Integer>> results = new ArrayList<>();
        //populate the hashmap
        for(int i=0;i< nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        while(count0 !=map.size()){
            count0 =0;
            ArrayList<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> e:map.entrySet()){
                if(e.getValue() >0){
                    int value = e.getValue();
                    list.add(e.getKey());
                    e.setValue(value-1);
                }
                else count0++;
            }
            if(list.size()>=1) results.add(list);
        }
        return results;
    }
}
