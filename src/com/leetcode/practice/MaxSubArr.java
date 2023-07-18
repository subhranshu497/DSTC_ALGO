package com.leetcode.practice;

public class MaxSubArr {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubArr(nums));
    }

    private static int findMaxSubArr(int[] nums) {
        int n = nums.length;
        int maXSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<n;i++){
            currSum = Math.max(0,currSum)+nums[i];
            maXSum = Math.max(currSum, maXSum);
        }
        return maXSum;
    }

    //brute force approach
//    private static int findMaxSubArr(int[] nums) {
//        int maxSum =nums[0];
//        int n = nums.length;
//        for(int i=0;i<n;++i){
//            int currSum =0;
//            for(int j=i;j<n;++j){
//                currSum +=nums[j];
//                maxSum = Math.max(maxSum, currSum);
//            }
//        }
//        return maxSum;
//    }
}
