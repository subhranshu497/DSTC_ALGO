package com.leetcode.practice.interview150.OneDDP;

public class RemoveDuplicateFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDup(nums));
    }

    private static int removeDup(int[] nums) {
        int length = nums.length;
        int count =1;
        int i =1;
        while(i<length){
            if(nums[i] == nums[i-1]){
                count++;

                if(count >2){
                    nums =removeElementFromArray(nums, i);
                    i--;
                    length--;
                }
            }
            else {
                count =1;
            }
            i++;
        }
        return length;
    }

    private static int[] removeElementFromArray(int[] nums, int index) {
        for(int i=index+1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        return nums;
    }
}
