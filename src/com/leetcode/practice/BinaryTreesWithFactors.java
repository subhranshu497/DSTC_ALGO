package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {
    public static void main(String[] args) {
        int[] arr = {2,4,5,10};
        System.out.println(numFactoredBinaryTrees(arr));
    }

    private static int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        //take a hasmap and enter array element as key and value is the count of possibilities
        Map<Integer, Long> map = new HashMap<>();
        //iterate the array and populate the map
        for(int i=0;i<arr.length;i++){
            long count =1l;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j])){
                    count +=map.get(arr[j])*map.get(arr[i]/arr[j]);
                }
            }
            map.put(arr[i], count);
        }
        //iterate the map to get the possibilities
        long sum =0;
        for(Map.Entry<Integer,Long> entry:map.entrySet()){
            sum += entry.getValue();
        }
        return (int)sum % (1000000000+7);
    }

//    public int numFactoredBinaryTrees(int[] arr) {
//        Arrays.sort(arr);
//        Map<Integer, Long> map = new HashMap<>();
//
//        for (int i=0;i<arr.length;i++) {
//            map.put(arr[i], 1L);
//
//            for (int j=0;j<i;j++) {
//                if (arr[i] % arr[j] == 0 && map.containsKey(arr[i] / arr[j])) {
//                    map.put(arr[i], (map.get(arr[i]) + map.get(arr[j]) * map.get(arr[i] / arr[j])));
//                }
//            }
//        }
//
//        long totalTrees = 0L;
//        for (int key : map.keySet()) {
//            totalTrees = (totalTrees + map.get(key)) % 1_000_000_007;
//        }
//
//        return (int) totalTrees;
//    }
}
