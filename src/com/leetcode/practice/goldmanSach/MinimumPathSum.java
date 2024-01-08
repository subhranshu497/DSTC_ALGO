package com.leetcode.practice.goldmanSach;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(grid));
    }

    private static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n =grid[0].length;
        int sum =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i ==0){
                    sum +=grid[i][j];
                }
                else if(j == n-1){
                    sum +=grid[i][j];
                }
            }
        }
        return sum;
    }
}
