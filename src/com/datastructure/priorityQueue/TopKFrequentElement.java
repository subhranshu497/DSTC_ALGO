package com.datastructure.priorityQueue;

import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        kFreqEle(nums, k);
    }

    private static int[] kFreqEle(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length+1];
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        // populat the buckets
        for(int key : freqMap.keySet()){

            int value = freqMap.get(key);
            if(buckets[value] == null){
                buckets[value] = new ArrayList<>();
            }
           buckets[value].add(key);
        }
        // iterate the bucket array
        int[] result = new int[k];
        int count =0;
        for(int i = buckets.length-1; i>=0 && count <k;i--){
            if(buckets[i] != null){
                for(int num:buckets[i]){
                    result[k-1-count] = num;
                    count++;
                }
            }
        }
        return result;
    }
}
