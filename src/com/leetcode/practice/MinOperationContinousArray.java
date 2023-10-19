package com.leetcode.practice;

import java.util.Arrays;

public class MinOperationContinousArray {
    public static void main(String[] args) {
        int[] nums = {1,3,98,2,99,98,103,101};
        System.out.println(minOperation(nums));
    }

    private static int minOperation(int[] nums) {
        int length = nums.length;
        int distinct_element=1;
        int j=0;
        int ans =length;
        Arrays.sort(nums);
        //to find number of distinct element
        for(int i =1; i<length;i++){
            if (nums[i] != nums[i-1]){
                nums[distinct_element] = nums[i];
                distinct_element++;
            }
        }
        //sliding window
        for(int i=0;i<distinct_element;i++){
            while(j<distinct_element && nums[j] < nums[i]+length){
                j++;
            }
            ans = Math.min(ans, length-j+i);
        }
        return ans;
    }
}
