package com.udemyLearning.arrays.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {20,-15, 55,7, 35,1,-22};
        insertionSortAlgo(arr);
    }

    private static void insertionSortAlgo(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j;
            int element = arr[i];
            for(j=i;j>0&&arr[j-1]>element;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = element;
        }
        System.out.println("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
