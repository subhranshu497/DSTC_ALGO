package com.tryexponent;

public class NumberFinder {
    public static void main(String[] args) {
        int[] nums = {200,200,200,200,500,500,500};
        System.out.println(findNum(nums,500));
    }

    private static int findNum(int[] nums, int num) {
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]==num){
                index = mid;
                right = mid-1;
            }
            else if(nums[mid]<num) left = mid+1;
            else  right = mid-1;
        }
        return index;
    }
}
