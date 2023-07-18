package com.udemyLearning.arrays.sorting;

public class SeletionSort {
    public static void main(String[] args) {
        int [] arr = {20,15, 55,7, 35,1,22};
        selectionSortAlgo(arr);
    }

    private static void selectionSortAlgo(int[] arr) {
        int n = arr.length;
        int index;
        for(int i=0;i<n;i++){
            index =i;
            int temp = arr[i];
            for(int j =0;j<n-i;j++){
                if(temp<arr[j]){
                    index =j;
                    temp = arr[index];
                }
            }
            arr[index] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
