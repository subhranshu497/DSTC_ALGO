package com.leetcode.practice;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = transpose(matrix);

        for(int i =0;i<result.length;i++){
            for(int j =0; j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int n = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j =i+1;j<n;j++){
                if(i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
                else continue;
            }
        }
        return matrix;
    }
}
