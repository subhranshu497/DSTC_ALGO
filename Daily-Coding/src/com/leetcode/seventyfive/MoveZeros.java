package com.leetcode.seventyfive;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
         moveZero(nums);
    }

    private static void moveZero(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0){
                for(int j=i;j<nums.length-1;j++){
                    if(nums[j]==0) {
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
        }
        // print the array
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
