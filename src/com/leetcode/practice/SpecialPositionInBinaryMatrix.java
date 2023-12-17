package com.leetcode.practice;

public class SpecialPositionInBinaryMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(findPosition(mat));
    }

    private static int findPosition(int[][] mat) {
        int special = 0;
        int m = mat.length;
        int n = mat[0].length;

        for(int i =0;i<m;i++){
            int colIndex = checkRow(mat,i);
            if(colIndex >=0 && checkColumn(mat, i, colIndex)){ //row iterate to traverse a column
                    special++;
            }
        }
        return special;
    }

    private static boolean checkColumn(int[][] mat, int i, int colIndex) {
        for(int row =0;row < mat.length;row++){
            if(mat[row][colIndex] == 1 && i !=row) return false;
        }
        return true;
    }

    private static int checkRow(int[][] mat, int i) { // iterate thorugh column to traverse teh row
        int colIndex = -1;
        for(int j = 0;j<mat[0].length;j++){
            if (mat[i][j] == 1) {
                if (colIndex >= 0)
                    return -1;
                else
                    colIndex = j;
            }
        }
        return colIndex;
    }
}
