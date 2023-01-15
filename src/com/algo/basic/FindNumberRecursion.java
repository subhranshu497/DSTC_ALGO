package com.algo.basic;

public class FindNumberRecursion {
    static int findNumber(int[] collection, int start, int end, int num){
        int mid = start+(end-start)/2;
        if(collection[mid]==num){
            return mid;
        }
        if(collection[mid]>num){
           return findNumber(collection, start, mid-1,  num);
        }
        return findNumber(collection,mid+1, end, num);
    }
}

