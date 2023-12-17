package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25PercentinSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(element(arr));
    }

    private static int element(int [] arr) {
        int len = arr.length;
        int qtr = len /4;
        System.out.println("qtr  "+qtr);
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer item : arr){
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > qtr) return entry.getKey();
        }
        return 0;
    }
}
