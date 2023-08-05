package com.leetcode.practice;

public class PeakElementInAnArray {
    public static void main(String[] args) {
        int [] arr = {5,10,20,4};
        System.out.println(findPeakElement(arr));
    }

    private static int findPeakElement(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len -1;
        for(int i =0; i<len;i++){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            else if(arr[mid] < arr[mid+1]){
                if((mid+1) != (len-1)) start = mid+1;
                else return mid+1;
            }
            else{
                if((mid-1) != 0) end = mid-1;
                else return mid-1;
            }
        }
        return -1;
    }
}
