package com.leetcode.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int [] num1 ={1,2,3,-6,12,15};
        //squareOfArray(num1);
       squareOfArrayJava8(num1);
    }

    /**
     * this method will print the result in sorted order
     * using two pointer technique
     * @param num1
     */
    private static void squareOfArray(int[] num1) {
        int n = num1.length-1;
        int ptr1 = 0;
        int ptr2 = num1.length-1;
        int[] result = new int[n+1];
        while(ptr1 <= ptr2){
            int a = (int) Math.pow(num1[ptr1],2);
            int b = (int) Math.pow(num1[ptr2],2);
            if(a>b){
                result[n] = a;
                ptr1++;
            }
            else{
                result[n] = b;
                ptr2--;
            }
            n--;
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    private static void squareOfArrayJava8(int[] num1) {
       int[] result= Arrays.stream(num1).map(x->x*x).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
