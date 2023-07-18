package com.leetcode.practice;

/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 */
public class InsertedPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target =5;
        int insertion_index = searchInsert(nums, target);
        System.out.println("Insertion index is "+insertion_index);
    }

    private static int searchInsert(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target) return i;
            if(nums[i] > target){
                return i++;
            }
            else if(i == nums.length-1){
                return nums.length;
            }
        }
        return -1;
    }
}
