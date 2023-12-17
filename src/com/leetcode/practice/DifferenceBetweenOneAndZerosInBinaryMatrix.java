package com.leetcode.practice;

public class DifferenceBetweenOneAndZerosInBinaryMatrix {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1},{1,1,1}};
        int [][] result = onesMinusZeros(grid);
        //printing the matrix
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [] rowOnes = new int[m];
        int[] colOnes = new int[n];
        int [][] result = new int[m][n];

        // find all ones in the row and col
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rowOnes[i] += grid[i][j];
                colOnes[j] += grid[i][j];
            }
        }
        // calculate the result matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = 2*(rowOnes[i]+colOnes[j])-m-n;
            }
        }
        return  result;
    }
}
