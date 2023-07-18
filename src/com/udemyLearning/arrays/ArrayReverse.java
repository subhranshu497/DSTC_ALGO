package com.udemyLearning.arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        //reverseArray(arr,n);
        reverseArayRecursion(arr,0,2);
    }

    //reverse array with recursion
    private static void reverseArayRecursion(int[] arr, int start, int end) {
        int temp;
        //base condition
        if(start >=end) return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArayRecursion(arr, start+1, end-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    private static void reverseArray(int arr[], int n) {
        int arr2[] = new int[n];
        for(int i =0;i<n;i++){
            arr2[i] = arr[n-i-1];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
