package com.algo.playWithMatrix;

public class ZeroMatrix {
    public static void main(String[] args) {
        int [][] matrixInput = {
                { 1, 2, 3, 10 },
                { 4, 5, 0, 11 },
                { 7, 8, 9, 12 }
        };
        System.out.println("=====Initial Matrix======");
        printMatrix(matrixInput);
        checkForZero(matrixInput);
    }
    public static void printMatrix(int[][] matrixInput){
        int rowLen = matrixInput.length;
        int colLen = matrixInput[0].length;
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                System.out.print(matrixInput[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void checkForZero(int [][] matrix){
        /* Find number of rows and columns */
        int rows = matrix.length;
        int cols = matrix[0].length;
        /* Create an array of boolean for row and column size */
        boolean[] rowzero = new boolean[rows];
        boolean[] colzero = new boolean[cols];
        /* Traverse through the matrix, where 0 is found,
         * make that row and column as true in array.
         * Note - Matrix is as it is still. Not touched */
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    rowzero[r] = true;
                    colzero[c] = true;
                }
            }
        }
        /* Let's deal with rows, for each row, if any one is zero
         * make the row as zero. Don't touch the column
         * yet, because we don't know at which position we stand right
         * now. If we will make column zero, we will loose next set of elements
         * int the column */
        for (int r = 0; r < rows; r++) {
            if (rowzero[r]) {
                for (int c = 0; c < cols; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
        /* Check each column, if zero found,
         * update corresponding column */
        for (int c = 0; c < cols; c++) {
            if (colzero[c]) {
                for (int r = 0; r < rows; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
        System.out.println("=====Zero Matrix=======");
        printMatrix(matrix);
    }
}
