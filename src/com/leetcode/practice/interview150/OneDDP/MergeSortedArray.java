package com.leetcode.practice.interview150.OneDDP;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;
        merge(num1,m,num2,n);
    }

    private static void merge(int[] num1, int m, int[] num2, int n) {
        // create a copy of num1
        int[] num1Copy=new int[m];
        for(int i=0;i<m;i++){
            num1Copy[i] = num1[i];
        }
        int p1 =0;
        int p2 =0;
        for(int p=0;p<(m+n);p++){
            if((p2>=n) || (p1<m && num1Copy[p1]<num2[p2])){
                num1[p]=num1Copy[p1];
                p1++;
            }
            else {
                num1[p] = num2[p2];
                p2++;
            }
        }
        for(int i=0;i< (m+n);i++){
            System.out.print(num1[i]+", ");
        }
    }
}
