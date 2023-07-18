package com.udemyLearning.arrays.sorting;

import java.sql.SQLOutput;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {20,-15, 55,7, 35,1,-22};
        bubbleSortAlgo(arr);
    }

    private static void bubbleSortAlgo(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
