package com.leetcode.daily;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int [][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }

    private static int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        Integer [][] memo = new Integer [matrix.length][matrix.length];
        //dfs
        for(int i=0;i<matrix.length;i++){
            min = Math.min(min, findMin(matrix,0, i,memo));
        }
        return min;
    }
    private static int findMin(int[][]matrix, int row, int col, Integer[][]memo){
        //base condition
        if(col<0 || col==matrix.length) return Integer.MAX_VALUE;
        // last row
        if(row == matrix.length-1) return matrix[row][col];
        //if cell calculated before
        if(memo[row][col] !=null) return memo[row][col];
        int left = findMin(matrix, row+1,col, memo);
        int middle = findMin(matrix, row+1,col+1, memo);
        int right = findMin(matrix, row+1,col-1, memo);

        memo[row][col] = Math.min(left, Math.min(middle, right))+matrix[row][col];
        return memo[row][col];
    }
}
