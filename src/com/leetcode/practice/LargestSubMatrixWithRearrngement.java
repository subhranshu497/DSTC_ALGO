package com.leetcode.practice;

import java.util.Arrays;

public class LargestSubMatrixWithRearrngement {
    public static void main(String[] args) {
        //int [][] matrix = {{0,0,1},{1,1,1},{1,0,1}};
        int [][] matrix = {{1,0,1,0,1}};
        System.out.println(largestSubMatrix(matrix));
    }
    // 0  0  1      0  0  1     0  0  1
    // 1  1  1  =>  1  1  2  => 1  1  2
    // 1  0  1      2  0  3     0  2  3

    private static int largestSubMatrix(int [][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i= 0;i< m;i++){
            for(int j=0;j<n;j++){
                if(i !=0 && matrix[i][j]== 1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }
        int area =0;
        // traverse the matrix backward to find area (element * width )
        for(var row : matrix){
            Arrays.sort(row);
            int width = 1;
            for(int j=n-1; j>=0;j--){
                area = Math.max(area, row[j] * width);
                width++;
            }
        }
        return area;
    }
}
