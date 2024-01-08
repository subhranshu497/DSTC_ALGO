package com.leetcode.practice.goldmanSach;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int [] result = mergeTwoArray(arr1, arr2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+", ");
        }
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int temp [] = new int[m+n];
        int i=0;
        int j =0;
        for(int k =0;k<(m+n);k++){
            if(j>n || (i<m && arr1[i]<arr2[j])){
                temp[k] = arr1[i];
                i++;
            }
            else{
                temp[k] = arr2[j];
                j++;
            }
        }
        return temp;
    }
}
