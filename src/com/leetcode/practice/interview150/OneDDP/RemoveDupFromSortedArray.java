package com.leetcode.practice.interview150.OneDDP;

public class RemoveDupFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int counter =1; // there exists at least one unique element in the array
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
