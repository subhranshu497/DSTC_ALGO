package com.browse.blind75.day4;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 3;
        System.out.println(findInRotatedArr(nums, target));
    }

    private static int findInRotatedArr(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target) return mid;
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                 right = mid-1;
                }
                else left = mid+1;
            }
            else{
                if(nums[mid]<target && target<=nums[right]) left = mid+1;
                else right = mid-1;
            }
        }
        return -1;
    }
}
