package com.browse.blind75.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
       int [] result = checkTwoSumTwoPointer(nums, target);
        System.out.println(result[0]+", "+result[1]);
    }
    //using two pointer
    private static int[] checkTwoSumTwoPointer(int[] nums, int target) {
        Arrays.sort(nums);
        int left =0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int[]{left,right};
            }
            else if(nums[left]+nums[right]>target) right--;
            else left++;
        }
        //no solution found
        return new int[]{};
    }

    // using hasmap O(n)
    private static int[] checkTwoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<map.size();i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) !=i){
                return new int[]{i,map.get(complement)};
            }
        }
        return new int[]{}; // no soltion found
    }
}
