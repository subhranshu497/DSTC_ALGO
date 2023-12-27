package com.leetcode.practice;

import java.util.Arrays;

public class MaxProdDiffTwoPairs {
    public static void main(String[] args) {
        int [] nums = {5,6,2,7,4};
        System.out.println(maxProdDiffIter(nums));
    }

    private static int maxProdDiff(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
    //iterative approach - O(n)
    private static int maxProdDiffIter(int[] nums){
        int biggest = 0;
        int secondBig = 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int num : nums){
            if(num>biggest){
                secondBig = biggest;
                biggest = num;
            }
            else {
                secondBig = Math.max(secondBig, num);
            }
            if(num < smallest){
                secondSmall = smallest;
                smallest = num;
            }
            else{
                secondSmall = Math.min(secondSmall,num);
            }
        }
        return (biggest*secondBig)-(smallest*secondSmall);
    }
}
