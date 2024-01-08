package com.leetcode.practice.goldmanSach;

public class NumberOfIslands {
    public static void main(String[] args) {
        char [][] grid = {{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }

    private static int numIslands(char[][] grid) {
        int islandCount = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0;i< rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    islandCount +=1;
                    dfs(grid, i,j,grid.length,grid[0].length);
                }
            }
        }
        return islandCount;
    }

    private static void dfs(char[][] grid, int x, int y, int m, int n) {
        if(x<0 || x>=m || y<0 || y>=n || grid[x][y] !='1') return;
        grid[x][y] = '2';
        dfs(grid, x+1,y,m,n);
        dfs(grid, x,y+1,m,n);
        dfs(grid, x-1,y,m,n);
        dfs(grid, x,y-1,m,n);
    }
}
