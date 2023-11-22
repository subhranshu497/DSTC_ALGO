package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class TraverseDiagonalII {
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(List.of(1,2,3));
        nums.add(List.of(4,5,6));
        nums.add(List.of(7,8,9));
        findDigonalOrder(nums);
    }

    private static int[] findDigonalOrder(List<List<Integer>> nums) {
        int count = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for(int i =0;i<nums.size();i++){
            List<Integer> row = nums.get(i);
            for(int j=0;j<row.size();j++){
                int idx = i+j;
                if(lists.size() < idx+1){
                    lists.add(new ArrayList<>());
                }
                lists.get(idx).add(row.get(j));
                count++;
            }
        }
        //nw flatten the list
        int[] result = new int[count];
        int index = 0;
        for(List<Integer> list : lists){
            for(int i=list.size()-1;i>=0;i--){
                result[index++] = list.get(i);
            }
        }
        return result;
    }
}
