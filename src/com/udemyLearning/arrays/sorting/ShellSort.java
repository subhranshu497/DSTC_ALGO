package com.udemyLearning.arrays.sorting;

public class ShellSort {
    public static void main(String[] args) {
        int [] arr = {20,-15, 55,7, 35,1,-22};
        shellSortAlgo(arr);
    }

    private static void shellSortAlgo(int[] arr) {
       for(int gap = arr.length/2; gap >0;gap /=2){
           for(int i=0;i<arr.length;i++){
               int element = arr[i];
               int j = i;
               for(j=i; j>=gap && arr[j-gap]>element; j -=gap){
                   arr[j] = arr[j-gap];
               }
               arr[j] = element;
           }
       }
        System.out.println("Sorted array  post shell sort is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
