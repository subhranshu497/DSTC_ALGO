package com.browse.blind75.day2;

public class ProdOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       int [] result =productExceptSelf(nums);
       for(int num:result){
           System.out.print(num+", ");
       }
    }

    private static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int prefix =1;
        int suffix = 1;
        int[] result = new int[nums.length];
        //to define prefix array
        for(int i=0;i<nums.length;i++){
            result[i]= prefix;
            prefix = prefix * nums[i];
        }
        //to get final array with multiplying suffix
        for(int i=nums.length-1;i>=0;i--){
            result[i] = result[i]*suffix;
            suffix = nums[i]*suffix;
        }
        return result;
    }
}
