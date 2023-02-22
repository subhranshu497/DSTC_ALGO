package com.algo.firstandlast;

public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,5,5,5,5,8,10};
        findFirstAndLastIndexSortedArray(arr,5);

    }
    public static void findFirstAndLastIndexSortedArray(int [] arr, int x){
        int len = arr.length;
        int first = -1;
        int last = -1;
        for(int i =0;i<len;i++){
            if(x != arr[i])
                continue;
            if(first == -1)
                first = i;
            last = i;
        }
        if(first != -1) {
            System.out.println("First occurrence is " + first);
            System.out.println("Last occurrence is "+ last);
        }
        else
            System.out.println(x+" is not found");
    }
}
