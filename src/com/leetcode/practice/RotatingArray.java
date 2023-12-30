package com.leetcode.practice;

public class RotatingArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k =3;
        int [] results = rotate(nums,k);
        for(int num : results){
            System.out.print(num+", ");
        }
    }

    private static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        int[] results = new int[n];

        for(int i=0;i<n;i++){
            results[(i+k)%n] = nums[i];
        }

        return results;
    }
}
