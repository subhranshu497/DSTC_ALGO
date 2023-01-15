package com.algo.arraysExample;

public class ReverseArray {
    public void reverseArrayFn(int [] inArr){
        for(int i=0;i<inArr.length/2;i++){
            int end = inArr.length -i-1;
            int temp = inArr[i];
            inArr[i] = inArr[end];
            inArr[end] = temp;
        }
        for(int i=0;i<inArr.length;i++)
            System.out.print(inArr[i]+" ");
    }



}
