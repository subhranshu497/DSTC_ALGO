package com;

public class Solution {


    public static void main(String[] args) {
        int [] arr = {200, 10,40,50,60};
        bubSort(arr);
    }

    private static void bubSort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
            System.out.println(arr[i]);
        }

    }
}
