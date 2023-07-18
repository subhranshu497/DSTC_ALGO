package com.leetcode.practice;

public class ArrayMerge {
    public static void main(String[] args) {
        int [] nums1 ={1,2,3,0,0,0};
        int [] nums2 ={3,5,6};
        int m = nums1.length;
        int n = nums2.length;
        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1;
        int j =n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                 nums1[k--] = nums2[j--];
            }
        }

    }
}
