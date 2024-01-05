package com.sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,5,1,2,5,2,5};
        int [] result = countSortAlgo(arr);
        for(int element:result){
            System.out.print(element+", ");
        }
    }

    private static int[] countSortAlgo(int[] arr) {
        //find max and min element of the existing array
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        // calculate range
        int range = max-min+1;
        //declare a temp aray of range
        int[] temp = new int[range+1];
        //delcare the output array
        int[] result = new int[arr.length];
        // iterate the input array and find freq of each element and fill those in temp array
        for(int i=0;i<arr.length;i++){
            if(temp[arr[i]] == 0) temp[arr[i]] = 1;
            else temp[arr[i]]++;
        }
        // to calculate the cumulative sum
        for(int i =1;i<temp.length;i++){
            temp[i] +=temp[i-1];
        }
        // now start fillng up the result array
        for(int i= result.length-1;i>=0;i--){
            result[temp[arr[i]]-1] = arr[i];
            temp[arr[i]]--;
        }
        return result;
    }
}
