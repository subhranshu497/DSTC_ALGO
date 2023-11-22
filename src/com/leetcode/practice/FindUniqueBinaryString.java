package com.leetcode.practice;

import java.util.*;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        String [] nums = {"00", "01"};
       System.out.println(uniqueBinStr(nums));
    }

    private static String uniqueBinStr(String[] nums) {
       StringBuilder sb = new StringBuilder();
        for(int i=0;i< nums.length;i++){
           sb.append(nums[i].charAt(i)=='0'?"1":"0");
        }
        return sb.toString();
    }
}
