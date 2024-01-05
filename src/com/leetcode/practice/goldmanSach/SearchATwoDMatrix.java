package com.leetcode.practice.goldmanSach;

public class SearchATwoDMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchInTwoD(matrix, target));
    }

    private static boolean searchInTwoD(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left =0;
        int right = (m*n)-1;
        int pivotIndex, pivotEle;
        while(left<=right){
            pivotIndex = (left+right)/2;
            pivotEle = matrix[pivotIndex/n][pivotIndex%n];
            if(target == pivotEle) return true;
            else {
                if(target < pivotEle) right = pivotIndex-1;
                else left = pivotIndex+1;
            }
        }
        return false;
    }
}
