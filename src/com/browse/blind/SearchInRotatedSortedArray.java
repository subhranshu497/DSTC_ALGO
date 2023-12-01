package com.browse.blind;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,1};
        int target = 1;
        System.out.println(searchInRotatedArr(nums, target));
    }

    private static int searchInRotatedArr(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right) /2;
            if(nums[mid] == target) return mid;
            if(nums[left]<= nums[mid]){ // left array
                if(nums[left]<= target && nums[mid] > target) right = mid-1;
                else left = mid+1;
            }
            else{ // right array
                if(nums[right] >= target && nums[mid] < target) left = mid+1;
                else right = mid-1;
            }
        }
        return -1;
    }
}
