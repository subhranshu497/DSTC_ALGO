package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArithmaticSubArray {
    public static void main(String[] args) {
        int [] nums = {4,6,5,9,3,7};
        int [] l = {0,0,2};
        int [] r = {2,3,5};
        System.out.println(checkArithmaticSubarray(nums, l, r));
    }

    private static List<Boolean> checkArithmaticSubarray(int[] nums, int[] l, int[] r) {
        // first itarate the nums array based on the l , r indices and create the subarray
        int m = l.length;
        List<Boolean> result = new ArrayList<>();
        for(int i =0; i<m;i++){
            List<Integer> list1 = new ArrayList<>(); // for storing the the subarray
            for(int j =l[i];j<=r[i];j++){
                list1.add(nums[j]);
            }
            Collections.sort(list1);
            // now check for arithmatic seq
            int diff = 0;
            for(int j =1; j<list1.size();j++){
                if(j==1){
                    diff = list1.get(j) - list1.get(j-1);
                }
                else if(diff != list1.get(j) - list1.get(j-1)){
                    result.add(false);
                    break;
                }
                if(j == list1.size()-1){
                    result.add(true);
                }
            }
        }
        return result;
    }
}
