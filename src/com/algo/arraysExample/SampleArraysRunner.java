package com.algo.arraysExample;

import java.util.Arrays;

public class SampleArraysRunner {

    public static void main(String[] args) {
        //start - dynamic array method call
//        Array arr = new Array(1);
//        arr.insert(10);
//        arr.insert(20);
//        arr.insert(50);
//        arr.insert(30);
//        arr.insert(70);
//       // arr.removeAt(1);
//        int value = arr.indexOf(90);
//        if(value >=0){
//            System.out.println("Index of "+90+" is "+value);
//        }
//        else{
//            System.out.println("Index not found");
//        }
//        arr.print();
        //end - dynamic array method call
        //start - array reverse method call
        ReverseArray rev = new ReverseArray();
        int[] inArr= {10,20,30,40,50,60,70,80,90};
        rev.reverseArrayFn(inArr);
        //end - array reverse method call
    }
}
