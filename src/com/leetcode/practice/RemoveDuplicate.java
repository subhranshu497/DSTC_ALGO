package com.leetcode.practice;

import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] intArr = {1,1,2};
        int j =removeDup(intArr);
    }
    private static int removeDup(int[] intArr) {
        int [] temp = new int[intArr.length];
        int j =0;
        for(int i=0;i<intArr.length-1;i++){
            if(intArr[i] != intArr[i+1]){
                temp[j++] = intArr[i];
            }
        }
        temp[j++] = intArr[intArr.length-1];
        //to change the original array
        for(int i =0;i<j;i++){
            intArr[i] = temp[i];
        }
        //to print the result array post removal of dups
        for(int i=0;i<j;i++){
            System.out.print(intArr[i]+" ");
        }
        System.out.println();
        System.out.println(j);
        return j;
    }

//    private static int removeDup(int[] intArr) {
//        Set<Integer> set = new TreeSet<>();
//        for(int i=0;i<intArr.length;i++){
//            set.add(intArr[i]);
//        }
//        System.out.println(set);
//        return set.size();
//    }
}
