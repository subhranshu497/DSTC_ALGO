package com.leetcode.practice.jpmc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDistance {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        List<List<Integer>> list = minimumAbsDifferenceCountSort(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            diff = Math.min(diff, Math.abs(arr[i]-arr[i+1]));
        }
        for(int i=0;i<arr.length-1;i++){
            List<Integer> innerList = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i+1])==diff){
                innerList.add(arr[i]);
                innerList.add(arr[i+1]);
            }
            if(!innerList.isEmpty())result.add(innerList);
        }
        return result;
    }
    private static List<List<Integer>> minimumAbsDifferenceCountSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max-min+1;
        int [] temp = new int[range+1];
        int[]sortArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(temp[arr[i]]==0) temp[arr[i]] =1;
            else temp[arr[i]]++;
        }
        //cumulative sum
        for(int i=1;i<temp.length;i++){
            temp[i] +=temp[i-1];
        }
        //sorted arr
        for(int i=sortArr.length-1;i>=0;i--){
            sortArr[temp[arr[i]]-1]= arr[i];
        }
        //printing
        for(int ele:sortArr){
            System.out.print(ele+", ");
        }
        return null;
    }
}
