package com.udemyLearning.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaxMin {
    public static void main(String[] args) {
        int [] arr = {12,1234,45,67,1};
        int n = arr.length;
         //findMaxMinUtil(arr, n);
        OptionalInt max = getMaxStream(arr,n);
        System.out.println("Max element is "+max);
        int min = getMin(arr, 0,n);
        System.out.println("Min element is "+min);
    }
    //using java 8 library method
    public static OptionalInt getMaxStream(int[] arr, int n){
        return Arrays.stream(arr).max();
    }

    //time complexity O(n) space O(1)
    private static void findMaxMinUtil(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max is "+max+" and min is "+min);
    }

    //find max and min using recursion
    public static int getMax(int arr[], int i, int n){
        return n==1?arr[i]:Math.max(arr[i], getMax(arr,i+1,n-1));
    }

    public static int getMin(int arr[], int i, int n){
        return n==1?arr[i]:Math.min(arr[i], getMin(arr,i+1, n-1));
    }
}
