package com.leetcode.seventyfive;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int[] result = prodExceptSelf(nums);
        for(int num:result){
            System.out.print(num+" ");
        }
    }

    private static int[] prodExceptSelfOptimized(int[] nums){
        int[] result = new int[nums.length];
        int i =0;
        int j = nums.length-1;
        return new int[2];
    }

    private static int[] prodExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            int prod = 1;
            for(int j=0;j< nums.length;j++){
                if(i != j){
                    prod *= nums[j];
                }
                result[i] = prod;
            }
        }
        return result;
    }
}
